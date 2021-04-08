package ro.ase.cts.decorator.clase;

public class DecoratorSarbatoriMesaj extends DecoratorAbstract {

	public DecoratorSarbatoriMesaj(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("LA MULTI ANI!");
	}
	
}
