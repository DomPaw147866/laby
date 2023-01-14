/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab;

/**
 *
 * @author student
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Forecast fakeForecast = new Forecast.Fake();
        Weather todayWeather = new Weather(fakeForecast);
       assert "Current today temperatue: 20.1".equals(todayWeather.currentTemp());
    }
    
}
