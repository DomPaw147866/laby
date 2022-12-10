/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab3;

/**
 *
 * @author student
 */
public interface Currency {
  Currency addedCurrency(float value, String currency);

  Currency subtractedCurrency(float value, String currency);

  String abbreviation();

  String symbol();

  String balance();

  float toDollarExchangeRate();
}
