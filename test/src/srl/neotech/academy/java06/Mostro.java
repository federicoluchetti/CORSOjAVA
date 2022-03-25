package srl.neotech.academy.java06;

public abstract class Mostro implements Giocatore {

	public Mostro() {
		// TODO Auto-generated constructor stub
	}
	public String caccia() {
		return "guarisci 10 hp";
	}
	public String vainLetargo() {
		return "ripristina tutti gli hp";
	}



	@Override
	public String attacca() {
		// TODO Auto-generated method stub
		return "+15 danni";
	}

	@Override
	public String difendi() {
		// TODO Auto-generated method stub
		return "-5 danni";
	}

	@Override
	public String muori() {
		// TODO Auto-generated method stub
		return "mostro sconfitto";
	}

}
