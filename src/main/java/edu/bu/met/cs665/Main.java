/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2026
 * File Name: Main.java
 * Description: Demonstrates beverage vending machine functionality.
 */
package edu.bu.met.cs665;

public class Main {

  /**
   * Program entry point.
   * @param args command line arguments
   */
  public static void main(String[] args) {

    BeverageMachine machine = new BeverageMachine();

    Beverage beverage =
            machine.createBeverage(
                    BeverageType.ESPRESSO,
                    2,
                    1);

    System.out.println(beverage.brew());
    System.out.println(beverage.getName());
    System.out.println("Price: $" + beverage.getPrice());
  }
}