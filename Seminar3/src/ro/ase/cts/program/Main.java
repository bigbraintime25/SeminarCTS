package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

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
	}

}
