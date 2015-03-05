package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Suma;

public class TestSuma {

	private Suma suma = new Suma();
	
	@Before
	public void setUp(){
		suma.setA(2);
		suma.setB(2);
	}
	
	@Test
	
	public void testSuma() {
	
  assertEquals(4,suma.sumar());
  assertNotNull(suma.getC());
	}
}
