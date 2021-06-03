package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;

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
	@Category(TesteNormale.class)
	public void testConstructorExistsLista() {
		Grupa grupa = new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteNormale.class})
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for(int i =0;i<7;i++) {
			Student student = new Student("Gigel" + i);
			student.adaugaNota(3);
			student.adaugaNota(4);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		for(int i =0;i<5;i++) {
			Student student = new Student("Ionel" + i);
			student.adaugaNota(7);
			student.adaugaNota(7);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.41, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	public void testPromovabilitateBoundaryInf() {
		Grupa grupa = new Grupa(1076);
		for(int i =0;i<7;i++) {
			Student student = new Student("Gigel" + i);
			student.adaugaNota(3);
			student.adaugaNota(4);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateBoundarySup() {
		Grupa grupa = new Grupa(1076);
		for(int i =0;i<5;i++) {
			Student student = new Student("Ionel" + i);
			student.adaugaNota(7);
			student.adaugaNota(7);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(1.0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(TesteUrgente.class)
	public void testPromovabilitateError() {
		Grupa grupa = new Grupa(1076);
		grupa.getPromovabilitate();
	}
	
	
	
}
