package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.cenfotec.logica.AnnoBisiesto;

public class AnnoBisiesto_Test {

	private static AnnoBisiesto AB;
	
	@BeforeClass
	public static void Init () {
		AB = new AnnoBisiesto();
		
	}
	
	@Test
	public void Is_Bisiesto () {
		assertTrue	(AB.isBisiesto(2020));
	}
	
	@Test
	public void Not_Bisiesto () {
		assertFalse	(AB.isBisiesto(2018));
		assertFalse	(AB.isBisiesto(1900));
		assertFalse	(AB.isBisiesto(2100));
	}
	@Test
	public void Bisiesto_400 () {
		assertTrue	(AB.isBisiesto(1600));
		assertTrue	(AB.isBisiesto(2000));
	}
	

}
