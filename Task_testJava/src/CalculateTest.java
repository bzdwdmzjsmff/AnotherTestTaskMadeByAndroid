import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculateTest {

	Calculate calculate=new Calculate();
	int result;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		
		
		result=calculate.add(3, 4);
		assertEquals(7, result);
		//fail("Not yet implemented");
	}
	public void testMinus(){
		result =calculate.minus(5, 2);
		assertEquals(3, result);
	}
	public void testMultiple(){
		result=calculate.multiple(2, 4);
		assertEquals(8, result);
	}
	public void testDivide(){
		result=calculate.divide(9, 3);
		assertEquals(3,result);
		
	}

}
