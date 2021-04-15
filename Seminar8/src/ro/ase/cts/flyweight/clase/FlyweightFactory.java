package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, FlyweightAbstract> clienti;

	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<>();
	}
	
	public FlyweightAbstract getClient(String numarTelefon) {
		FlyweightAbstract client = clienti.get(numarTelefon);
		
		if(client == null) {
			client = new Client("Dorel", numarTelefon, "dorel@santier.com");
			clienti.put(numarTelefon, client);
		}
		return client;
	}
	
}
