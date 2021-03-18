package ro.ase.cts.clase;

public class Ziar {
	String denumire;
	int nrPagini;
	float pret;

	private static Ziar instanta = null;

	public static synchronized Ziar getInstance(String denumire, int nrPagini, float pret) {
		if (instanta == null) {
			instanta = new Ziar(denumire, nrPagini, pret);
			return instanta;
		} else {
			return instanta;
		}
	}

	private Ziar(String denuire, int nrPagini, float pret) {
		super();
		this.denumire = denuire;
		this.nrPagini = nrPagini;
		this.pret = pret;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setNrPagini(int nrPagini) {
		this.nrPagini = nrPagini;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Ziar [denuire=" + denumire + ", nrPagini=" + nrPagini + ", pret=" + pret + "]";
	}

}
