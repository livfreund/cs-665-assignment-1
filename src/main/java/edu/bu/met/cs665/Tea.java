/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2026
 * File Name: Tea.java
 * Description: Represents tea beverages produced by the vending machine.
 */
package edu.bu.met.cs665;

public class Tea extends Beverage {

    /**
     * Creates a tea beverage.
     * @param name tea name
     * @param basePrice tea base price
     */
    public Tea(String name, double basePrice) {
        super(name, basePrice);
    }

    /**
     * Brews a tea beverage.
     * @return brewing message
     */
    @Override
    public String brew() {
        return "Brewing tea.";
    }
}