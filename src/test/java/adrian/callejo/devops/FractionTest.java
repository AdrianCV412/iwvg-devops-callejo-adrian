package adrian.callejo.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;
    private Fraction fraction2;

    @BeforeEach
    void before(){
        fraction = new Fraction(1,2);
        fraction2 = new Fraction(2,4);
    }

    @Test
    void testDecimal(){
        assertEquals(0.5,fraction.decimal());
    }

    @Test
    void testIsProper(){
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper(){
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent(){
        assertTrue(fraction.isEquivalent(fraction2));
    }

    @Test
    void testAdd(){
        Fraction fractionResult = Fraction.add(fraction,fraction2);
        assertEquals(8,fractionResult.getNumerator());
        assertEquals(8,fractionResult.getDenominator());
    }

    @Test
    void testSubstract(){
        Fraction fractionResult = Fraction.substract(fraction,fraction2);
        assertEquals(0,fractionResult.getNumerator());
        assertEquals(8,fractionResult.getDenominator());
    }

    @Test
    void testMultiply(){
        Fraction fractionResult = Fraction.multiply(fraction,fraction2);
        assertEquals(2,fractionResult.getNumerator());
        assertEquals(8,fractionResult.getDenominator());
    }

    @Test
    void testDivide(){
        Fraction fractionResult = Fraction.divide(fraction,fraction2);
        assertEquals(4,fractionResult.getNumerator());
        assertEquals(4,fractionResult.getDenominator());
    }
}
