package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	
	public void testMinus() {
	    SimpleCalculator calc = new SimpleCalculator();
	    assertEquals(calc.minus(5, 3), 2);
	}
}