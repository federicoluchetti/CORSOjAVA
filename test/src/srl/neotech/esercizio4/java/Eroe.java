package srl.neotech.esercizio4.java;

public class Eroe implements IUmano {
private int forza;

	public int getForza() {
	return forza;
}

public void setForza(int forza) {
	this.forza = 10;
}

public void combatti(int forza) {
	this.forza = forza+10;
}
	@Override
	public String GetForza() {
		// TODO Auto-generated method stub
		return String.valueOf(forza);
	}

	@Override
	public void combatti() {
		// TODO Auto-generated method stub

	}

}
