package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TestGrupa {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundarySup() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorSup() {
		Grupa grupa = new Grupa(1200);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorInf() {
		Grupa grupa = new Grupa(200);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1076);
	}
	
	//correct
	@Test
	public void testConstructorExistsLista() {
		Grupa grupa = new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
}
