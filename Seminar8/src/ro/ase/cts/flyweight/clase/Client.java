package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract {

	private String numeClient;
	private String nrtelefon;
	private String adresaEmail;

	public Client(String numeClient, String nrtelefon, String adresaEmail) {
		super();
		this.numeClient = numeClient;
		this.nrtelefon = nrtelefon;
		this.adresaEmail = adresaEmail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", nrtelefon=");
		builder.append(nrtelefon);
		builder.append(", adresaEmail=");
		builder.append(adresaEmail);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void afiseazaInfm(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println("Clientul " + this.toString() + " are rezervarea " + rezervare.toString());
	}

}
