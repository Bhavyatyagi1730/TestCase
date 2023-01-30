package credexpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Area_TestCase {

	@Test
	public void test() {
		AreaOfReactangle obj = new AreaOfReactangle();
		assertEquals(12 , obj.area(3, 4));
		assertEquals(0 , obj.area(2,0));
		assertEquals(0 , obj.area(0, 3));
	  
	}

}
