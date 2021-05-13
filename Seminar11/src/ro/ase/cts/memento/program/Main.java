package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeciJucat jucat = new MeciJucat("asa", "bala", 324, 432, 363, 12);
		ManagerMemento manager = new ManagerMemento();
		
		manager.adaugaMemento(jucat.salvareInformatii());
		
		jucat.setNrSpectatori(625);
		jucat.setNumeEchipaOaspeti("aloha");
		jucat.setNumeEchipaGazda("Corcoduse");
		manager.adaugaMemento(jucat.salvareInformatii());
		
		System.out.println(jucat.toString());
		
		jucat.revenire(manager.getMemento(0));
		System.out.println(jucat.toString());
	}

}
