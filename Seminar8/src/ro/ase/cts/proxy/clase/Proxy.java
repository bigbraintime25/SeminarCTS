package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {
	private OperatorRezervare operator;
	private int nrMinimPersoane;
	
	
	
	public Proxy(OperatorRezervare operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}



	@Override
	public void rezerva(int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane >= nrMinimPersoane) {
			operator.rezerva(nrPersoane);
		}
		else {
			System.out.println("Nu se poate face rezervarea");
		}
	}
}
