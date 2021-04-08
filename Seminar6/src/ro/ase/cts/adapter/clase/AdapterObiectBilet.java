package ro.ase.cts.adapter.clase;

public class AdapterObiectBilet implements BiletOnline {
	
	private Bilet bilet;
	
	

	public AdapterObiectBilet(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		bilet.vindeBilet();
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		bilet.rezervaBilet();
	}

}
