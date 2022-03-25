package srl.neotech.esercizio4.java;

public class Licantropo implements IMostro, IUmano {
private int forzaUmano;
private int forzaMostro;
private boolean IsUomo; 
	public void setèUomo(boolean IsUomo) {
	this.IsUomo = IsUomo;
}

	@Override
	public String GetForza() {
		// TODO Auto-generated method stub
		if( IsUomo=true) {return String.valueOf(forzaUmano);}
		;
		return String.valueOf(forzaMostro);
		
	}

	@Override
	public void combatti() {
		// TODO Auto-generated method stub

	}

	@Override
	public void azzanna() {
		// TODO Auto-generated method stub

	}

	public boolean isIsUomo() {
		return IsUomo;
	}

	public void setIsUomo(boolean isUomo) {
		IsUomo = isUomo;
	}

}
