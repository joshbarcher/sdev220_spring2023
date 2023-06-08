package org.example;

//this represents a mathematical fraction (7/2, 3/14, 1/2, ...)
public class Rational
{
    private double numerator;
    private double denominator;

    //the default fraction is 1/1
    public Rational()
    {
        numerator = 1;
        denominator = 1;
    }

    public Rational(double numerator, double denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //returns true if this rational evaluates to one (5/5, 3/3, -1/-1, 1/1, ...)
    public boolean isOne()
    {

    }

    public double getNumerator()
    {
        return numerator;
    }

    public double getDenominator()
    {
        return denominator;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }
}
