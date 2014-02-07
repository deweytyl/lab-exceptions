package taojava.labs.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QR
{
  public static void
    main (String[] args)
      throws Exception
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    BufferedReader eyes = new BufferedReader (new InputStreamReader (System.in));

    int i = IOUtils.readInt (pen, eyes, "Please enter Quadratic a, b, c: ");
    pen.println (i + " squared is " + (i * i));
  } // main(String[])
}
