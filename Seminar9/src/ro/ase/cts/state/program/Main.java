package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(63);
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.ocupaMasa();
		//masa.setStare(new Libera());
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}
