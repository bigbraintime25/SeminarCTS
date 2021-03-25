package ro.ase.cts.clase;

public class SimpleFactoryJucator {
	public static Jucator  createJucator(TipJucator tipJucator, String numeJucator) {
		switch (tipJucator) {
		case Atacant: {
			
			return new Atacant(numeJucator);
		}
		case Fundas: {
			return new Fundas(numeJucator);
		}
		case Portar: {
			return new Portar(numeJucator);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipJucator);
		}
	}
}
