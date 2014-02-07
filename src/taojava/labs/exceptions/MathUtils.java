package taojava.labs.exceptions;

/**
 * A variety of utilities for doing Math.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class MathUtils
{
  public static double
  smallQuadraticRoot (double a, double b, double c)
  {
    return ((-b - java.lang.Math.sqrt (b * b - 4 * a * c)) / (2 * a)); 
  }
} // MathUtils
