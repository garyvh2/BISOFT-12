package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.cenfotec.logica.CalculadoraSalarial;
import ac.cr.cenfotec.logica.TipoEmpleado;

public class CalculadoraSalarial_Test {

	private static CalculadoraSalarial CS;
	@BeforeClass
	public static void Init () {
		CS = new CalculadoraSalarial();
	}
	
	
	@Test
	public void SalarioStatic () throws Exception {
		assertEquals(1000.0f, CS.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 0, 0), 0.0f);
		assertEquals(1500.0f, CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0, 0), 0.0f);
	}
	// Vendedor
	@Test
	public void Vendedor_2000 () throws Exception {
		assertEquals(1360.0f, CS.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000.0f, 8), 0.0f);
	}
	@Test
	public void Vendedor_1500 () throws Exception {
		assertEquals(1260.0f, CS.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500.0f, 3), 0.0f);
	}
	@Test
	public void Vendedor_1499 () throws Exception {
		assertEquals(1100.0f, CS.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1499.99f, 0), 0.0f);
	}
	// Encargado
	@Test
	public void Encargado_1250 () throws Exception {
		assertEquals(1760.0f, CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1250.0f, 8), 0.0f);
	}
	@Test
	public void Encargado_1000 () throws Exception {
		assertEquals(1600.0f, CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1000.0f, 0), 0.0f);
	}
	@Test
	public void Encargado_999 () throws Exception {
		assertEquals(1560.0f, CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 999.99f, 3), 0.0f);
	}
	// 0s
	@Test
	public void Hours_0 () throws Exception {
		assertEquals(1500.0f, CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 500.0f, 0), 0.0f);
	}
	@Test
	public void Sales_0 () throws Exception {
		assertEquals(1660.0f, CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0.0f, 8), 0.0f);
	}	
	// Exceptions
	@Test(expected = Exception.class)
	public void Invalid_Type () throws Exception {
		CS.calculaSalarioBruto(null, 0.0f, 0);
	}
	@Test(expected = Exception.class)
	public void Invalid_Sales () throws Exception {
		CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, -1, 0);
	}
	@Test(expected = Exception.class)
	public void Invalid_Horas () throws Exception {
		CS.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0, -1);
	}
}
