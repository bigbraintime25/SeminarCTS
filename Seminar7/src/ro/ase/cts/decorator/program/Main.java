package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;
import ro.ase.cts.decorator.clase.DecoratorSarbatoriMesaj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet b1 = new Bilet("Arsenal", "Liverpool", "Gigel");
		
		b1.rezervaBilet();
		System.out.println();
		
		DecoratorCuMesajSustinere d1 = new DecoratorCuMesajSustinere(b1);
		d1.rezervaBilet();
		System.out.println();
		
		DecoratorSarbatoriMesaj d2 = new DecoratorSarbatoriMesaj(b1);
		d2.rezervaBilet();
		System.out.println();
		
		DecoratorAbstract d3 = new DecoratorSarbatoriMesaj(d1);
		d3.rezervaBilet();
		System.out.println();
	}

}
