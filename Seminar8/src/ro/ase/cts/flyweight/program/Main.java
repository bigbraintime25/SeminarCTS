package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rez1 = new Rezervare(1, 3, 14);
		Rezervare rez2 = new Rezervare(2,4,13);
		Rezervare rez3 = new Rezervare(4,2,17);
		
		FlyweightFactory fabrica = new FlyweightFactory();
		Client c1 =(Client) fabrica.getClient("0723619267");
		Client c2 =(Client) fabrica.getClient("0723619467");
		c1.afiseazaInfm(rez1);
		c2.afiseazaInfm(rez2);
		fabrica.getClient("0723619467").afiseazaInfm(rez3);
	}

}
