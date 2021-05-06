package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.sold =0;
	}
	
	public void constituire (float suma) {
		System.out.println("S-a constituit contul cu suma de " + suma);
		this.sold=suma;
	}
	
	public void depunere  (float suma) {
		System.out.println("S-a depus suma de " + suma);
		this.sold +=suma;
	}
	
	public void retragere (float suma) {
		if(suma <=sold)
		 {
			System.out.println("S-a retras suma de " + suma);
		 	this.sold-=suma;
		 }
		else {
			System.out.println("Fonduri insuficiente");
		}
	}
	
}
