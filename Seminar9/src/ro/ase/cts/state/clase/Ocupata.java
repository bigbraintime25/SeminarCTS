package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof Ocupata)) {
			System.out.println("Ati ocupat masa cu nr "+masa.getNrMasa());
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}

}
