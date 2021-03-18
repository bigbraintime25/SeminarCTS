package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;
import ro.ase.cts.clase.Ziar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerSpital m1 = ManagerSpital.getInstance();
		ManagerSpital m2 = ManagerSpital.getInstance();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		ManagerSpitalLazy managerLazy1 = ManagerSpitalLazy.getInstance("Gigel", 45, 3726);
		ManagerSpitalLazy managerLazy2 = ManagerSpitalLazy.getInstance("Gigelinho", 53, 6283);
		
		managerLazy1.setVarsta(33);
		managerLazy2.setNume("ionel");
		
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
		
		Ziar z1 = Ziar.getInstance("Libertatea", 37, 7.9f);
		Ziar z2 = Ziar.getInstance("Adevarul", 21, 5.9f);
		
		z1.setNrPagini(33);
		z2.setPret(6.2f);
		
		System.out.println(z1.toString());
		System.out.println(z2.toString());
	}

}
