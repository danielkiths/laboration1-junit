package com.example.lab1junit;

import com.example.demo.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void twoPlusTwoShouldEqualFour(){
        int a = 2;
        int b = 2;
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void  sixMinusFourShouldEqualTwo(){
        int a = 6;
        int b = 4;
        assertEquals(2, calculator.subtract(6,4));
    }

    @Test
    void sevenTimesTenShouldEqualSeventy(){
        int a = 7;
        int b = 10;
        assertEquals(70, calculator.multiply(7, 10));
    }

    @Test
    void sevenDividedByFiveEqualsOntPointFour(){
        int a = 7;
        int b = 5;
        assertEquals(1.4, calculator.divide(7,5));
    }

    @Test
    void verifySquareRootOfNine(){
        int a = 9;
        assertEquals(3, calculator.squareRootOf(9));
    }

    @Test
    void getArea(){
        int a = 100;
        assertEquals(31415.93, calculator.getArea(100));

    }
    @Test
    void getCircumference(){
        int a = 50;
        assertEquals(314.16, calculator.getCircumference(50));

    }
    @Test
    void fivePlusSeventeenShouldEqualTwentyTwo(){
        int a = 5;
        int b = 17;
        Assertions.assertEquals(22, calculator.add(a,b));
    }
}
