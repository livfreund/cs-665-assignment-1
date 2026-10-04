/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2026
 * File Name: Beverage.java
 * Description: Abstract base class representing a beverage produced
 * by the vending machine. **Abstract class serves as a template or blueprint for subclasses.
 */
package edu.bu.met.cs665;

public abstract class Beverage {

    private String name;
    private double basePrice;
    private int milkUnits;
    private int sugarUnits;

    /**
     * Creates a beverage with a name and base price.
     * @param name beverage name
     * @param basePrice beverage base price
     */
    public Beverage(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.milkUnits = 0;
        this.sugarUnits = 0;
    }

    /**
     * Adds milk units to the beverage.
     * @param units number of milk units
     */
    public void addMilk(int units) {
        this.milkUnits += units;
    }

    /**
     * Adds sugar units to the beverage.
     * @param units number of sugar units
     */
    public void addSugar(int units) {
        this.sugarUnits += units;
    }

    /**
     * Returns the beverage name.
     * @return beverage name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns milk quantity.
     * @return milk units
     */
    public int getMilkUnits() {
        return milkUnits;
    }

    /**
     * Returns sugar quantity.
     * @return sugar units
     */
    public int getSugarUnits() {
        return sugarUnits;
    }

    /**
     * Calculates the beverage price.
     * @return beverage price
     */
    public double getPrice() {
        return basePrice + ((milkUnits + sugarUnits) * 0.50);
    }

    /**
     * Simulates beverage preparation.
     * @return brewing message
     */
    public abstract String brew();
}