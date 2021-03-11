package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class PupilReader extends Reader {
	public PupilReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException{
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev e = new Elev();
			super.readAplicant(e, input2);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			e.setClasa(clasa);
			e.setTutore(tutore);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}
}
