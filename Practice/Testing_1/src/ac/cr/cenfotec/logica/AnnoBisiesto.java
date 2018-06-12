package ac.cr.cenfotec.logica;

public class AnnoBisiesto {

	public boolean isBisiesto(int anno){
		if (anno % 4 != 0){
			return false;
		} else if (anno % 100 != 0) {
			return true;
		} else if (anno % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
