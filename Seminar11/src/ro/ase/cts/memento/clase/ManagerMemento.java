package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> backupuri;
	
	
	
	public ManagerMemento() {
		super();
		this.backupuri = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento) {
		backupuri.add(memento);
	}
	
	public Memento getMemento(int positie) {
		if(positie >=0 && positie < backupuri.size()) {
			return backupuri.get(positie);
		}
		else {
			throw new IllegalArgumentException("Argument invalid");
		}
	}
}
