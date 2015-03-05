package JUNIT1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class maximoTest {
	public maximo mimax;

	@Before
	public void antestest(){
		int[] pl={2,3,5,7,1};
				
		mimax=new maximo(pl);
	}
	

	@Test
		public void testsimple(){
			int resultado=mimax.calculamax();
			assertTrue(resultado==7);
		}
	
	@Test
	public void testorden(){
		int[] pl={2,1,5,7,1};
		mimax=new maximo(pl);
		int resultado=mimax.calculamax();
		assertTrue(resultado==7);
	}
	@Test
	public void testdoble(){
		int[] pl={2,7,5,7,7};
		mimax=new maximo(pl);
		int resultado=mimax.calculamax();
		assertTrue(resultado==7);
	}
	@Test
	public void testuno(){
		int[] pl={7};
		mimax=new maximo(pl);
		int resultado=mimax.calculamax();
		assertTrue(resultado==7);
	}
	@Test
	public void testnegativos(){
		int[] pl={-2,-7,-5,-10,-77};
		mimax=new maximo(pl);
		int resultado=mimax.calculamax();
		assertTrue(resultado==-2);
	}
}
