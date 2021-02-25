package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animalList;
	private Zookeeper zookeeper;
	public Zoo(List<Animal> animalList, Zookeeper zookeeper) {
		super();
		this.animalList = animalList;
		this.zookeeper = zookeeper;
	}
	public Zoo() {
		this.animalList = new ArrayList<>();
		this.zookeeper = new Zookeeper("Jhon");
	}
	
	public void adaugaAnimal(Animal a)
	{
		this.animalList.add(a);
	}
	
	public void hranesteAnimale()
	{
		for (Animal animal : animalList) {
			zookeeper.feed(animal);
		}
	}
	
	
}
