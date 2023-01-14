package lab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author student
 */
public class Weather {

    private Forecast forecast;

    public Weather(Forecast forecast) {
        this.forecast = forecast;
    }

    public String currentTemp() {
        return "Current today temperatue: " + forecast.currentTemperature();
    }

}
