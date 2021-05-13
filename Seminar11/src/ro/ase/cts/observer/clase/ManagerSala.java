package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect {
	public void anuntaMeciFotbal() {
		super.notificareClient("A fost programat un nou meci de fotbal");
	}
	public void anuntaMeciVolei() {
		super.notificareClient("A fost programat un nou meci de volei");
	}
	public void anuntaMeciHandbal() {
		super.notificareClient("A fost programat un nou meci de handbal");
	}
}
