package ro.ase.cts.clase;

public class Politie {
	public static boolean esteUrmarita(Persoana persoana) {
		return (Integer.parseInt(""+persoana.getCNP().charAt(12))%2 ==0);
	}
}
