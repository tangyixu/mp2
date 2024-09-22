package edu.grinnell.csc207.util;

import edu.grinnell.csc207.util.BigFraction;

public class BFCalculator {
  public static void main (String args[]){

   //fields
  BigFraction lastValue = new BigFraction(1, 1);

  public BigFraction get() //gets the last computed value (returns 0 if there is no such value).
  {
    return lastValue;
  }

  public void add(BigFraction val) //adds val to the last computed value.
  {
    BigFraction result = new BigFraction(val.numerator()+lastValue.numerator,
                                         val.denominator()+lastValue.denominator);
    lastValue = result;
  }
  public void subtract(BigFraction val); //subtracts val from the last computed value.
  {
    BigFraction result = new BigFraction(val.numerator()-lastValue.numerator,
                                         val.denominator()-lastValue.denominator);
    lastValue = result;
  }

  public void multiply(BigFraction val); //multiplies the last computed value by val.
  {
    this.multiplies(lastValue, val);
  }
  public void divide(BigFraction val); //divides the last computed value by val.
  public void clear(); //resets the last computed value to 0.

  
 }
}
