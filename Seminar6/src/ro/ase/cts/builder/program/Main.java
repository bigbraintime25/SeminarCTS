package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderRezervare rezervarebuilder = new BuilderRezervare();
		
		Rezervare rezervare1 = rezervarebuilder.build();
		Rezervare rezervare2 = new BuilderRezervare().setAreBauturaInclusa(true).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
	}

}
