package ro.ase.cts.template.clase;

public class SpectatorCuHandicap extends TemplateIntrareStadion {
	private String nume;

	public SpectatorCuHandicap(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul cu handicap " + nume + " s a asezat la coada");
	}

	@Override
	public void prezentareBilet() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul cu handicap " + nume + " a prezentat biletul");
	}

	@Override
	public void controlCorporal() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul cu handicap " + nume + " a fost controlat si la carucior");
	}

	@Override
	public void ocupareLoc() {
		// TODO Auto-generated method stub
		System.out.println("Spectatorul cu handicap" + nume + " a ocupat locul special");
	}
	
	
}
