package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	void adaugareNod(ComponentaMeniu componentaMeniu);
	void stergereNod(ComponentaMeniu componentaMeniu);
	void afisareInformatii();
	ComponentaMeniu getComponent(int index);
}
