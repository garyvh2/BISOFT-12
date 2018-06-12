package cr.ac.ucenfotec.CalculadoraString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculadoraString {
	
	
	public int add(String string) throws Exception {
		// >> Empty
		if (string.isEmpty())
			return 0;
		// >> Split string
		List<String> values = null;
		if (string.indexOf(";") != -1) {
			values = Arrays.asList(string.split(";"));	
		} 
		else if (string.indexOf(":") != -1) {
			values = Arrays.asList(string.split(":"));
		}
		else {
			values = Arrays.asList(string.split(","));
		}
		
		// >> Too many
		if (values.size() > 2)
			throw new Exception ("Too many parameter!");
		
		// >> Return 
		return values.stream()
			.mapToInt(val -> Integer.parseInt(val))
			.sum();
	}

}
