package ro.ase.cts.clase;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;

	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder("Elev:");
		str.append(super.toString()).append("Clasa =").append(clasa).append(", Tutore=").append(tutore);
		return str.toString();
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return Elev.sumaFinantata;
	}

	public static float getFinantare() {
		// TODO Auto-generated method stub
		return Elev.sumaFinantata;
	}

	public static void setFinantare(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

}
