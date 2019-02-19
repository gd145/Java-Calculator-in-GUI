package junitTest;
import ui.*;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void testAdd() {
		float addOutput1 = calc.calculate("+", 5, 5);
		assertEquals(10.0, addOutput1, 0);
		
		float addOutput2 = calc.calculate("+", 158, 635);
		assertEquals(793.0, addOutput2, 0);
		
		float addOutput3 = calc.calculate("+", -5, -25);
		assertEquals(-30.0, addOutput3, 0);
	}
	
	@Test
	public void testSub() {
		float subOutput1 = calc.calculate("-", 10, 2);
		assertEquals(8.0, subOutput1 , 0);
		
		float subOutput2 = calc.calculate("-", 899, 523);
		assertEquals(376.0, subOutput2 , 0);
		
		float subOutput3 = calc.calculate("-", -25, -50);
		assertEquals(25.0, subOutput3 , 0);

	}
	
	@Test
	public void testMulti() {
		float multiOutput1 = calc.calculate("*", 2, 3);
		assertEquals(6.0, multiOutput1, 0);
		
		float multiOutput2 = calc.calculate("*", 7, 7);
		assertEquals(49.0, multiOutput2, 0);
		
		float multiOutput3 = calc.calculate("*", 9, 0);
		assertEquals(0.0, multiOutput3, 0);
	}
	
	

}
