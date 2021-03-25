package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client("Gigel", 23, "Roman", 001);
		
		Client client2 =(Client) client1.cloneaza();
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
	}

}
