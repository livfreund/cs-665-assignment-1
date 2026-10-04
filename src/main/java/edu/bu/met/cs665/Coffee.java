/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2026
 * File Name: Coffee.java
 * Description: Represents coffee beverages produced by the vending machine.
 */
package edu.bu.met.cs665;

public class Coffee extends Beverage {

    /**
     * Creates a coffee beverage.
     * @param name coffee name
     * @param basePrice coffee base price
     */
    public Coffee(String name, double basePrice) {
        super(name, basePrice);
    }

    /**
     * Brews a coffee beverage.
     * @return brewing message
     */
    @Override
    public String brew() {
        return "Brewing coffee.";
    }
}
