package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.AdapterObiectBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {
	
	public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}

	public static void main(String[] args) {
		
		BiletOnline biletOnline = new AdapterBilet(42);
		
		Bilet bilet = new Bilet(47);
		
		rezervaSiVindeBilet(biletOnline);
		
		AdapterObiectBilet adapterObiectBilet = new AdapterObiectBilet(bilet);
		rezervaSiVindeBilet(adapterObiectBilet);
	}

}
