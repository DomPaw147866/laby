/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author student
 */
public class Euro implements Currency {
    
    private FakeCantor cantor;
    private float balance;
    private String symbol;
            
            
    public Euro(float balance){
        this.cantor = new FakeCantor();
        this.balance = balance;
        this.symbol = "EUR";
    }        

    @Override
    public Currency addedCurrency(float value, String currency) {
        if(balance > 0 && value > 0){
           this.balance += value/this.cantor.euroToRate(currency);
            System.out.println("Wystąpiła wymiana waluty. Zostało dodane "
                    + value/this.cantor.euroToRate(currency) + " " + symbol);
        }
        return this;
    }

    @Override
    public Currency subtractedCurrency(float value, String currency) {
        
        if(balance > 0 && value > 0){
           float howManyToTranfer = value/this.cantor.euroToRate(currency);
           if(howManyToTranfer > balance){
               System.err.println("Próbowano przetrasferować wiecej valuty niż jest posiadane, tranzakcja zakończona niepomyślnie.");
               System.out.println("obecnie bilans EUR pozwala na przewalutowanie na około "+ (int)balance*(int)this.cantor.euroToRate(currency) + " " + currency);
           }
           else{
               this.balance -= howManyToTranfer;
                System.out.println("Wystąpiła wymiana waluty. Zostało pobrane "
                    + howManyToTranfer + " " + symbol);
           }
        }
        return this;
    }

    @Override
    public String abbreviation() {
        return String.format("%s : %s", symbol(),balance());
    }

    @Override
    public String symbol() {
        return symbol;
    }

    @Override
    public String balance() {
        return String.valueOf(balance);
    }

    @Override
    public float toDollarExchangeRate() {
        return 1f/this.cantor.euroToRate("USD");
    }
    
}
