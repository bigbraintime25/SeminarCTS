package ro.ase.cts.program;

import ro.ase.cts.clase.BazaDateHuligani;
import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Persoana;
import ro.ase.cts.clase.Politie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana p1 = new Persoana("Gigel", "1234567892735");
		Bilet b1 = new Bilet("Gigel", "2B");
		
		if(p1.getNume().equals(b1.getNume())) {
			if(!Politie.esteUrmarita(p1)) {
				if(!BazaDateHuligani.esteInListaHuligani(p1)) {
					System.out.println("Poftiti");
				}
			}
		}
		
		Persoana p2 = new Persoana("Ionel","2936481263946");
		Bilet b2 = new Bilet("Ionel", "3B");
		
		if(Facade.sePermiteAcces(p2, b2)) {
			System.out.println("Poftiti");
		}
		else {
			System.out.println("Nu aveti voie");
		}
	}

}
