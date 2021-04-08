package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean sePermiteAcces(Persoana persoana, Bilet bilet) {
		if(persoana.getNume().equals(bilet.getNume())) {
			if(!Politie.esteUrmarita(persoana)) {
				if(!BazaDateHuligani.esteInListaHuligani(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
