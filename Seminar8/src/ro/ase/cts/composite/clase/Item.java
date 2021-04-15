package ro.ase.cts.composite.clase;

public class Item implements ComponentaMeniu {
	private String numeItem;

	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugareNod(ComponentaMeniu componentaMeniu) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Metoda nu e implementata");
	}

	@Override
	public void stergereNod(ComponentaMeniu componentaMeniu) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Metoda nu e implementata");
	}

	@Override
	public void afisareInformatii() {
		// TODO Auto-generated method stub
		System.out.println("Item " + numeItem);
		
	}

	@Override
	public ComponentaMeniu getComponent(int index) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Metoda nu e implementata");
	}
	
	
}
