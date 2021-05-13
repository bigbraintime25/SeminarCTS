package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorCuHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemplateIntrareStadion spectatorNormal = new SpectatorUzual("Gigel");
		spectatorNormal.intrareStadion();
		
		TemplateIntrareStadion spectatorHandicap = new SpectatorCuHandicap("Gigel cu scaun");
		spectatorHandicap.intrareStadion();
	}

}
