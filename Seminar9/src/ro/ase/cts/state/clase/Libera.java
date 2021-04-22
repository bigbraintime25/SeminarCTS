package ro.ase.cts.state.clase;

public class Libera implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof Libera)) {
			System.out.println("Ati eliberat masa cu nr "+masa.getNrMasa());
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi eliberata");
		}
	}

}
