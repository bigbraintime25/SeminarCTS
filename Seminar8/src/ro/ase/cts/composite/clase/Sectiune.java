package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu {
	private String numeSectiune;
	private List<ComponentaMeniu> lista;
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.lista = new ArrayList<ComponentaMeniu>();
	}
	@Override
	public void adaugareNod(ComponentaMeniu componentaMeniu) {
		// TODO Auto-generated method stub
		lista.add(componentaMeniu);
		
	}
	@Override
	public void stergereNod(ComponentaMeniu componentaMeniu) {
		// TODO Auto-generated method stub
		lista.remove(componentaMeniu);
	}
	@Override
	public void afisareInformatii() {
		// TODO Auto-generated method stub
		System.out.println("sectiunea " + numeSectiune);
		for(ComponentaMeniu c: lista) {
			c.afisareInformatii();
		}
	}
	@Override
	public ComponentaMeniu getComponent(int index) {
		// TODO Auto-generated method stub
		if(index >=0 && index<lista.size())
		{
		return lista.get(index);
		}
		else {
			throw new IllegalArgumentException("index invalid");
		}
	}
}
