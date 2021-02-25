package pachet;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Giraffe g1 = new Giraffe("bala", 12);
		Giraffe g2 = new Giraffe("alala");
		
		Zebra z1 = new Zebra("tras",34);
		Zebra z2 = new Zebra("asjh");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		zoo.adaugaAnimal(z1);
		zoo.adaugaAnimal(z2);
		zoo.hranesteAnimale();
	}

}
