package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Gigel",  new Cash());
		Card card = new Card(200);
		
		client.platesteNota(120);
		
		client.setModPlata(card);
		client.platesteNota(170);
		client.platesteNota(100);
	}

}
