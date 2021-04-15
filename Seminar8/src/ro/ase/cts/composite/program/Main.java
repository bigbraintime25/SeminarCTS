package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComponentaMeniu meniu = new Sectiune("meniu");
		ComponentaMeniu sectiuneBauturi = new Sectiune("Bauturi");
		ComponentaMeniu sectiuneDesert = new Sectiune("Desert");
		
		ComponentaMeniu frappe = new Item("Frappe");
		ComponentaMeniu clatite = new Item("Clatite");
		ComponentaMeniu cola = new Item("Cola");
		
		meniu.adaugareNod(sectiuneDesert);
		meniu.adaugareNod(sectiuneBauturi);
		
		sectiuneBauturi.adaugareNod(cola);
		sectiuneBauturi.adaugareNod(frappe);
		
		sectiuneDesert.adaugareNod(clatite);
		
		meniu.afisareInformatii();
		
	}

}
