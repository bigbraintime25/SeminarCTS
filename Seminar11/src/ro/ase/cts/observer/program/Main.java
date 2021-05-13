package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerSala manager = new ManagerSala();
		
		Client client1 = new Client("Gigel");
		Client client2 = new Client("Dorel");
		Client client3 = new Client("Ionel");
		
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client3);
		
		manager.anuntaMeciFotbal();
		
		manager.stergeObserver(client2);
		manager.anuntaMeciHandbal();
	}

}
