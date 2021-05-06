package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cont contCurent = new ContCurent("Gigel", 50);
		Cont contEconomii = new ContEconomii("Gigel", 100);
		Cont contCredit = new ContCredit("Gigel", 150);
		Cont contIndisponibil = new ContIndisponibil("Gigel");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizeazaPlata(28);
		contCurent.realizeazaPlata(70);
		contCurent.realizeazaPlata(120);
		contCurent.realizeazaPlata(300);
		
	}

}
