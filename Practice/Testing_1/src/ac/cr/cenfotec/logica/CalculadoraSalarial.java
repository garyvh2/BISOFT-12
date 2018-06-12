package ac.cr.cenfotec.logica;

public class CalculadoraSalarial {

	/*
	 * El salario = 1000e si el empleado es de tipo Vendedor, y de 1500e si es Encargado. 
	 * Sume un bono de 100e ventasMes es mayor o igual que 1000e, 
	 * y de 200e si es al menos de 1500e. 
	 * Cada hora extra se pagará a 20e. 
	 * Si tipo es null, 
	 * o ventasMes es negativo  
	 * o horasExtra es negativo
	 * el método lanzará un new Exception
	 */
	public float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) throws Exception {
		if (tipo == null || ventasMes < 0 || horasExtra < 0)
			throw new Exception ("Invalid parameters!");
		
		float salario = 0.0f;
		if (tipo.equals(TipoEmpleado.VENDEDOR)) {
			salario = 1000;
		}
		if (tipo.equals(TipoEmpleado.ENCARGADO)) {
			salario = 1500;
		}
		if (ventasMes >= 1500) {
			salario += 200;
		} else if (ventasMes >= 1000) {
			salario += 100;
		}
		salario += (horasExtra * 20);
		return salario;
	}
/*
 * 
 * 
 * 
	vendedor, 2000 euros, 8h	  ->1360
	vendedor, 1500 euros, 3h	  ->1260
	vendedor, 1499.99 euros, 0h	  ->1100
	encargado, 1250 euros, 8h	  ->1760
	encargado, 1000 euros, 0h	  ->1600
	encargado, 999.99 euros, 3h	  ->1560
	encargado, 500 euros, 0h	  ->1500
	encargado, 0 euros, 8h	      ->1660
	vendedor, -1 euros, 8h	      ->Exception
	vendedor, 1500 euros, -1h	  ->Exception
	null, 1500 euros, 8h	      ->Exception
*/
	
	
}
