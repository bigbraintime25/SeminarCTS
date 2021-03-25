package ro.ase.cts.programe;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.clase.SimpleFactoryJucator;
import ro.ase.cts.clase.TipJucator;

public class Main {

	public static void main(String[] args) {
		
		Jucator jucator1 = SimpleFactoryJucator.createJucator(TipJucator.Fundas,"Gigel");
		Jucator jucator2 = SimpleFactoryJucator.createJucator(TipJucator.Atacant,"Dorel");
		
		System.out.println(jucator1.toString());
		System.out.println(jucator2.toString());
		
	}

}
