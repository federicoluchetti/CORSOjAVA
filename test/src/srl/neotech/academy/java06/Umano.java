package srl.neotech.academy.java06;

public abstract class Umano implements Giocatore {

	
	public Umano() {
		// TODO Auto-generated constructor stub
	}
	public String mangia() {
		return "guarisci 5 hp";
	}
	public String dormi() {
		return "ripristina tutti gli hp";
	}


	@Override
	public String attacca() {
		// TODO Auto-generated method stub
		return "+10 danni";
	}

	@Override
	public String difendi() {
		// TODO Auto-generated method stub
		return "-10 danni";
	}

	@Override
	public String muori() {
		// TODO Auto-generated method stub
		return "game over";
	}

}
