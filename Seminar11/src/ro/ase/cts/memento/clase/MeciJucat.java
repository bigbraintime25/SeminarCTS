package ro.ase.cts.memento.clase;

public class MeciJucat {
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleApaVandute;
	private int nrJandarmi;
	public MeciJucat(String numeEchipaGazda, String numeEchipaOaspeti, int nrSpectatori, int nrBileteVandute,
			int nrSticleApaVandute, int nrJandarmi) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleApaVandute = nrSticleApaVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	
	
	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}



	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}



	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}



	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}



	public void setNrSticleApaVandute(int nrSticleApaVandute) {
		this.nrSticleApaVandute = nrSticleApaVandute;
	}



	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}



	public Memento salvareInformatii() {
		Memento memento = new Memento(nrSpectatori, numeEchipaGazda, numeEchipaOaspeti);
		return memento;
	}
	
	public void revenire(Memento memento) {
		this.nrSpectatori = memento.getNrSpectatori();
		this.numeEchipaGazda = memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSticleApaVandute=");
		builder.append(nrSticleApaVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
