package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajSustinere extends DecoratorAbstract {

	public DecoratorCuMesajSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Mult succes " + ((Bilet)(super.getBiletAbstract())).getNumeGazda());
	}

}
