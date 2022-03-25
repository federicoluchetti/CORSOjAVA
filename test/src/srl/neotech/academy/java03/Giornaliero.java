package srl.neotech.academy.java03;

public class Giornaliero extends Impiegato{
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getIndirizzo() {
		// TODO Auto-generated method stub
		return super.getIndirizzo();
	}

	@Override
	public void setIndirizzo(String indirizzo) {
		// TODO Auto-generated method stub
		super.setIndirizzo(indirizzo);
	}

	@Override
	public String getTelefono() {
		// TODO Auto-generated method stub
		return super.getTelefono();
	}

	@Override
	public void setTelefono(String telefono) {
		// TODO Auto-generated method stub
		super.setTelefono(telefono);
	}
	private double base;
	private int giorni;

	public int getGiorni() {
		return giorni;
	}

	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}

	public double getStipendio() {
		return base;
	}

	public void setStipendio(double base) {
		this.base = base;
	}
	public double getPaga() {
		return base*giorni;
		
	}
	}


