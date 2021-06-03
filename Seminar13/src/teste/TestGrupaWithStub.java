package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStub {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1076);
		IStudent student = new StudentStub();
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}
