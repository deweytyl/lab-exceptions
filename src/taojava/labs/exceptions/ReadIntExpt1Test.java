package taojava.labs.exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReadIntExpt1Test
{

  @Test
  public void
    test ()
  {
    assertEquals("roots 2, -5", -5, MathUtils.smallQuadraticRoot(1, 3, -10), .01);

  }
  

}
