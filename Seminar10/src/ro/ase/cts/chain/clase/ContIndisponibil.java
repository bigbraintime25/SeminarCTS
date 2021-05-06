package ro.ase.cts.chain.clase;

public class ContIndisponibil extends Cont {

	public ContIndisponibil(String detinator) {
		super(detinator, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		System.out.println("Plata a fost refuzata");
	}
	
}
