package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata {

	@Override
	public void achita(double suma) {
		// TODO Auto-generated method stub
		System.out.println("Clientul a platit cash suma de " + suma);
	}
	
}
