package ro.ase.cts.adapter.clase;

public class Bilet {
	private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}
	
	public void rezervaBilet() {
		System.out.println( "S-a rezervat biletul cu pretul " + this.pret);
	}
	
	public void vindeBilet() {
		System.out.println("S-a vandut biletul cu pretul "+this.pret);
	}
}
