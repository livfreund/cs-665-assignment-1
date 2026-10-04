/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: BeverageMachineTest.java
 * Description: 5 JUnit tests for the Beverage Machine application.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BeverageMachineTest {

    /**
     * Tests creation of an Espresso beverage.
     */
    @Test
    public void testCreateEspresso() {

        BeverageMachine machine = new BeverageMachine();

        Beverage beverage =
                machine.createBeverage(
                        BeverageType.ESPRESSO,
                        0,
                        0);

        assertEquals("Espresso",
                beverage.getName());
    }

    /**
     * Tests adding milk to a beverage.
     */
    @Test
    public void testMilkUnits() {

        BeverageMachine machine = new BeverageMachine();

        Beverage beverage =
                machine.createBeverage(
                        BeverageType.AMERICANO,
                        2,
                        0);

        assertEquals(2,
                beverage.getMilkUnits());
    }

    /**
     * Tests adding sugar to a beverage.
     */
    @Test
    public void testSugarUnits() {

        BeverageMachine machine = new BeverageMachine();

        Beverage beverage =
                machine.createBeverage(
                        BeverageType.GREEN_TEA,
                        0,
                        3);

        assertEquals(3,
                beverage.getSugarUnits());
    }

    /**
     * Tests beverage price calculation.
     */
    @Test
    public void testPriceCalculation() {

        BeverageMachine machine = new BeverageMachine();

        Beverage beverage =
                machine.createBeverage(
                        BeverageType.ESPRESSO,
                        2,
                        1);

        assertEquals(
                3.50,
                beverage.getPrice(),
                0.001);
    }

    /**
     * Tests invalid milk quantity.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMilkAmount() {

        BeverageMachine machine = new BeverageMachine();

        machine.createBeverage(
                BeverageType.BLACK_TEA,
                4,
                0);
    }
}