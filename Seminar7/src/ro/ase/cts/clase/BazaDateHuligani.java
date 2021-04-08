package ro.ase.cts.clase;

public class BazaDateHuligani {
	
	public static boolean esteInListaHuligani(Persoana persoana) {
		return (Integer.parseInt(""+persoana.getCNP().charAt(11))%2 ==0);
	}

}
