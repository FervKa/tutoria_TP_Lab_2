package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CalculatorTest {
    @Test
    public void testDivision() {
        var first_number = 10D;
        var second_number = 2D;

        Calculator calculator = new Calculator();

        var result = calculator.division(first_number, second_number);

        System.out.println(result);
        /*result = 5D = 5D*/
        assertEquals(5D, result);
    }

    @Test
    public void testDivideByZero(){
        var first_number = 10D;
        var second_number = 0D;

        Calculator calculator = new Calculator();

        var result = calculator.division(first_number, second_number);

        System.out.println(result);
        assertNull(result);
    }



}