package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudenti() {
		IStudent studentDummy = new StudentDummy();
		Grupa grupa = new Grupa(1076);
		
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(1, grupa.getStudenti().size());
	}

}
