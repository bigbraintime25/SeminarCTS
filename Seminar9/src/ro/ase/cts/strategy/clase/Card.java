package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {

	private double sold;
	
	
	public Card(double sold) {
		super();
		this.sold = sold;
	}


	@Override
	public void achita(double suma) {
		if(suma <=sold) {
			
		
		// TODO Auto-generated method stub
		System.out.println("Clientul a platit cu cardul suma de " + suma);
		this.sold -= suma;
		
		}
		else {
			System.out.println("Fonduri insuficiente");
		}
	}

}
