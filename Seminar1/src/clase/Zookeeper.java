package clase;

public class Zookeeper {
	private String name;

	public Zookeeper(String name) {
		super();
		this.name = name;
	}

	public void feed(Animal a) {
		System.out.println(this.name + " hraneste animalul " + a.getName());
	}
}
