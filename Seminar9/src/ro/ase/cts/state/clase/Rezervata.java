package ro.ase.cts.state.clase;

public class Rezervata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof Libera) {
			System.out.println("Ati rezervat masa cu nr "+masa.getNrMasa());
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}

}
