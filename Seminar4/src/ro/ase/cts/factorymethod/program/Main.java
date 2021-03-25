package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AtacantFactory;
import ro.ase.cts.factorymethod.clase.Fundasfactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;

public class Main {
	
	public static void PrinteazaJucator(JucatorFactory fabrica, String nume) {
		Jucator jucator1 = fabrica.creareJucator(nume);
		System.out.println(jucator1.toString());
	}
	
	public static void main(String[] args) {
		PrinteazaJucator(new AtacantFactory(), "Gigel");
		PrinteazaJucator(new Fundasfactory(), "Dorel");
		
		PrinteazaJucator(new MijlocasFactory(), "Mirel");
	}

}
