package teste;


import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupaSetUp {

Grupa grupa;
	
	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1076);
		for(int i =0;i<35;i++) {
			Student student = new Student("Ionel" + i);
			student.adaugaNota(7);
			student.adaugaNota(7);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout = 500)
	public void testPromovabilitatePerformance() {
		
		grupa.getPromovabilitate();
	}

}
