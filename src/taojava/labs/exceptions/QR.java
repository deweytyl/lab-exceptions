package taojava.labs.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QR
{
  public static void
    main (String[] args)
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    BufferedReader eyes = new BufferedReader (new InputStreamReader (System.in));

    double a = IOUtils.readDouble (pen, eyes, "Please enter coefficient a: ");
    double b = IOUtils.readDouble (pen, eyes, "Please enter coefficient b: ");
    double c = IOUtils.readDouble (pen, eyes, "Please enter coefficient c: ");

    try
      {
        double root = MathUtils.smallQuadraticRoot (a, b, c);
        pen.println ("The smaller root of the polynomial is: " + root);
        pen.println ("Experimentally, " + a + "*" + root + "*" + root + "+" + b
                     + "*" + root + "+" + c + " = "
                     + (a * root * root + b * root + c));
      } // try to compute and print a root
    catch (DivideByZeroException dbze)
      {
        pen.println ("Cannot compute a result because the coefficient of the quadratic term is 0.");
      } // catch (DivideByZeroException)
    catch (Exception e)
      {
        pen.println ("Sorry, I could not compute a root.");
      } // catch (Exception)

  } // main(String[])
} // class QR

/** 11b
 * Please enter coefficient a: 0 
 * Please enter coefficient b: 1 
 * Please enter coefficient c: 1 
 * Cannot compute a result because the coefficient of the quadratic term is 0.
 * 
 * Please enter coefficient a: 1 
 * Please enter coefficient b: 0 
 * Please enter coefficient c: 1 
 * Sorry, I could not compute a root.
 * 
 * Please enter coefficient a: 1
 * Please enter coefficient b: -2
 * Please enter coefficient c: 1
 * The smaller root of the polynomial is: 1.0
 * Experimentally, 1.0*1.0*1.0+-2.0*1.0+1.0 = 0.0
 */

/** 11c
 * The results from this problem suggest catching specific exceptions can provide
 * useful information to users in case of user error. In general, I prefer specific
 * exceptions to generic ones. Using specific exceptions can make your program
 * more usable and user friendly. They also make potential errors more immediately
 * recognizable and readable to someone examining your code.
 */
