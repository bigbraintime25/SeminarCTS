package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class EmployeeReader extends Reader {

	public EmployeeReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Angajat a = new Angajat();
			super.readAplicant(a, input);
			int salariu = input.nextInt();
			String ocupatie = input.next();
			a.setSalariu(salariu);
			a.setOcupatie(ocupatie);
			angajati.add(a);
		}
		input.close();
		return angajati;
	}
}
