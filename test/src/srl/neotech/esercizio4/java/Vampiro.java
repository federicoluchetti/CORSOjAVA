package srl.neotech.esercizio4.java;

public class Vampiro implements IMostro {
	private int forza;

	public int getForza() {
	return forza;
}

public void setForza(int forza) {
	this.forza = 20;
}
	@Override
	public String GetForza() {
		// TODO Auto-generated method stub
		return String.valueOf(forza);
	}

	@Override
	public void azzanna() {
		// TODO Auto-generated method stub
forza=forza+5;

	}

}
