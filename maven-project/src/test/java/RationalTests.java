import org.example.Rational;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RationalTests
{
    @Test
    public void paramConstructorTest()
    {
        Rational fraction = new Rational(5, 3);

        //verify that the numerator and denominator were assigned
        assertEquals(5, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    public void defaultConstructorTest()
    {
        Rational fraction = new Rational();

        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void divideByZeroTest()
    {
        //this should throw an ArithmeticException
        assertThrows(ArithmeticException.class, () -> new Rational(10, 0));
    }

    public void identifyingOneTest()
    {

    }

    //verify that the toString() method returns the right format...
    @Test
    public void toStringTest()
    {
        Rational fraction = new Rational(1, 3);

        assertEquals("1.0/3.0", fraction.toString());
    }
}
