package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.readers.EmployeeReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		System.out.println(Angajat.getFinantare());
		System.out.println(Student.getFinantare());
		try {
			listaAplicanti = UniversalReader.readAplicants(new EmployeeReader("angajati.txt"));
			Proiect p = new Proiect(80);
			for(Aplicant aplicant:listaAplicanti)
			{
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				aplicant.afisareStatutProiect(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
