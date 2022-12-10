package lab3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.HashMap;

public class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f);
    put("GBP", 0.87063f);
    put("CHF", 0.9881f);
    put("JPY", 145.12f);
  }};


  public float euroToRate(String currency) {
    return this.rates.get(currency);
  }

  public FakeCantor() {
  }

}
