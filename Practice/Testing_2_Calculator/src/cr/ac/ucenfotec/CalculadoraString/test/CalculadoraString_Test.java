package cr.ac.ucenfotec.CalculadoraString.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import cr.ac.ucenfotec.CalculadoraString.CalculadoraString;

public class CalculadoraString_Test {

	private static CalculadoraString calc;
	
	@BeforeClass
	public static void Init () {
		calc = new CalculadoraString();
	}
	
	@Test
	public void Empty () throws Exception {
		assertEquals(0, calc.add(""));
	}

	@Test
	public void Addition () throws Exception {
		assertEquals(1, calc.add("0,1"));
	}
	
	@Test(expected = Exception.class)
	public void Addition_Error_Overflow () throws Exception {
		assertEquals(3, calc.add("0,1,2"));
	}
	
	@Test
	public void OneNumber () throws Exception {
		assertEquals(1, calc.add("1"));
		assertEquals(2, calc.add("2"));
	}
	
	@Test(expected = NumberFormatException.class)
	public void Separator () throws Exception {
		assertEquals(1, calc.add("1-2"));
	}
	
	@Test
	public void Split_Comma () throws Exception {
		assertEquals(2, calc.add("1,1"));
	}
	@Test
	public void Split_SemiColon () throws Exception {
		assertEquals(2, calc.add("1;1"));
	}
	@Test
	public void Split_Colon () throws Exception {
		assertEquals(2, calc.add("1:1"));
	}
 }
