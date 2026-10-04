/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2026
 * File Name: BeverageMachine.java
 * Description: class that controls beverage creation and condiment validation.
 */
package edu.bu.met.cs665;

public class BeverageMachine {

    private static final int MAX_MILK = 3;
    private static final int MAX_SUGAR = 3;

    /**
     * Creates a beverage based on the selected type.
     * @param type beverage type
     * @param milkUnits milk quantity
     * @param sugarUnits sugar quantity
     * @return prepared beverage
     */
    public Beverage createBeverage(
            BeverageType type,
            int milkUnits,
            int sugarUnits) {

        validateCondiments(milkUnits, sugarUnits);

        Beverage beverage;

        switch (type) {

            case ESPRESSO:
                beverage = new Coffee("Espresso", 2.00);
                break;

            case AMERICANO:
                beverage = new Coffee("Americano", 2.50);
                break;

            case LATTE_MACCHIATO:
                beverage = new Coffee("Latte Macchiato", 3.00);
                break;

            case BLACK_TEA:
                beverage = new Tea("Black Tea", 2.00);
                break;

            case GREEN_TEA:
                beverage = new Tea("Green Tea", 2.00);
                break;

            case YELLOW_TEA:
                beverage = new Tea("Yellow Tea", 2.00);
                break;

            default:
                throw new IllegalArgumentException(
                        "Invalid beverage selection.");
        }

        beverage.addMilk(milkUnits);
        beverage.addSugar(sugarUnits);

        return beverage;
    }

    /**
     * Validates condiment quantities.
     * @param milkUnits milk quantity
     * @param sugarUnits sugar quantity
     */
    private void validateCondiments(
            int milkUnits,
            int sugarUnits) {

        if (milkUnits < 0 || milkUnits > MAX_MILK) {
            throw new IllegalArgumentException(
                    "Milk must be between 0 and 3 units.");
        }

        if (sugarUnits < 0 || sugarUnits > MAX_SUGAR) {
            throw new IllegalArgumentException(
                    "Sugar must be between 0 and 3 units.");
        }
    }
}
