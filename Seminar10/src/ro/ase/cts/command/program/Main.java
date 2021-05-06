package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContBancar cont = new ContBancar("Gigel");
		ManagerComenzi manager = new ManagerComenzi();
		
		manager.invoca(new ComandaConstituire(cont, 200));
		manager.invoca(new ComandaDepunere(cont, 30));
		
		manager.executaCommanda();
		
		manager.invoca(new ComandaRetragere(cont, 1120));
		manager.executaCommanda();
		manager.executaCommanda();
	}

}
