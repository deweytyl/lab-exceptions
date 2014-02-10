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
      throws DivideByZeroException,
        Exception
  {
    if (a == 0)
      {
        throw new DivideByZeroException ("Cannot compute quadratic roots of "
                                         + "linear functions.");
      }

    double discriminant = b * b - 4 * a * c;

    if (discriminant < 0)
      {
        throw new Exception ("Cannot compute imaginary roots.");
      }
    return ((-b - java.lang.Math.sqrt (discriminant)) / (2 * a));
  }
} // MathUtils
