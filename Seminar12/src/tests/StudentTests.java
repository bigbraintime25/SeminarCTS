package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametrii() {
		String nume = "Gigel";
		Student student = new Student(nume);
//		if(nume != student.getNume()) {
//			fail("Numele nu e corect");
//		}

		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParam() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAreRestanta() {
		Student student = new Student();
		student.adaugaNota(3);
		student.adaugaNota(10);
		
		assertTrue( "Studentul care are restanta e marcat ca neavand restanta",student.areRestante());
	}
	
	@Test
	public void testNuAreRestanta() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(10);
		
		assertFalse( "Studentul care nu are restanta e marcat ca avand restanta",student.areRestante());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(9);
		
		assertEquals(1, student.getNote().size());
	}
	@Test
	public void testAdaugaNotaSpecifica() {
		Student student = new Student();
		student.adaugaNota(9);
		
		assertEquals(9, student.getNota(0));
	}

}
