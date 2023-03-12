package com.example.lab1junit;

import com.example.demo.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ValidatorTest {

    Validator validator = new Validator();

    @Test
    void doesPhoneNumberStartWithZero(){
        boolean result = validator.isPhoneNumberValid("0737773049");

        Assertions.assertTrue(result);
    }

    @Test
    void isPhoneNumberMoreThanSixDigits(){
        boolean result = validator.isPhoneNumberValid("07960");

        Assertions.assertFalse(result);
    }

    @Test
    void isPhoneNumberLessThanTenDigits(){
        boolean result = validator.isPhoneNumberValid("07958394059");

        Assertions.assertFalse(result);
    }

    @Test
    void doesPhoneNumberStartWithOtherThanZero(){
        boolean result = validator.isPhoneNumberValid("790490590");

        Assertions.assertFalse(result);
    }

    @Test
    void isPhoneNumberValid(){
        boolean result = validator.isPhoneNumberValid("0739202020");

        Assertions.assertTrue(result);
    }

    @Test
    void isPhoneNumberBetweenSixAndTenDigits(){
        boolean result = validator.isPhoneNumberValid("07000000");

        Assertions.assertTrue(result);
    }

    @Test
    void doesPhoneNumberContainLetters(){
        boolean result = validator.isPhoneNumberValid("07kldhk");

        Assertions.assertFalse(result);
    }

    @Test
    void doesPhoneNumberContainMoreThanTenDigits(){
        boolean result = validator.isPhoneNumberValid("07003300339");

        Assertions.assertFalse(result);
    }
    @Test
    void isEmailValid(){
        boolean result = validator.isEmailValid("agil.test@iths.se");

        Assertions.assertTrue(result);
    }

    @Test
    void doesEmailContainAtSymbol(){
        boolean result = validator.isEmailValid("agil.test.iths.se");

        Assertions.assertFalse(result);
    }

    @Test
    void doesEmailContainUsername(){
        boolean result = validator.isEmailValid("@iths.se");

        Assertions.assertFalse(result);
    }

    @Test
    void doesEmailContainTopLevelDomain(){
        boolean result = validator.isEmailValid("agil.test@iths.com");

        Assertions.assertTrue(result);
    }
}