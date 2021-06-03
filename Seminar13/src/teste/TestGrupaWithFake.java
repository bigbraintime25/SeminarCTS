package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import dubluri.StudentFake;

public class TestGrupaWithFake {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testRightGetPromovabilitate() {
		Grupa grupa = new Grupa(1076);
		for(int i=0;i<8;i++) {
			StudentFake stud1 = new StudentFake();
			stud1.setValoareGetRestanta(false);
			grupa.adaugaStudent(stud1);
		}
		for(int i=0;i<2;i++) {
			StudentFake stud1 = new StudentFake();
			stud1.setValoareGetRestanta(true);
			grupa.adaugaStudent(stud1);
		}
		
		assertEquals(0.8,  grupa.getPromovabilitate(), 0.01);
	}

}
