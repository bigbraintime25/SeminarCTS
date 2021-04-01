package ro.ase.cts.builder.clase;

public class BuilderRezervare implements BuilderAbstract {
	
	private Rezervare rezervare;

	@Override
	public Rezervare build() {
		return this.rezervare;
		
	}

	public BuilderRezervare() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false, "");
	}
	
	public BuilderRezervare setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}


	public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}


	public BuilderRezervare setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}


	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}


	public BuilderRezervare setAreMuzicaInclusa(boolean areMuzicaInclusa) {
		this.rezervare.setAreMuzicaInclusa(areMuzicaInclusa);
		return this;
	}


	public BuilderRezervare setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
}
