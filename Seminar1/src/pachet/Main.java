package pachet;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Giraffe g1 = new Giraffe("bala", 12);
		Giraffe g2 = new Giraffe("alala");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		zoo.hranesteAnimale();
	}

}
