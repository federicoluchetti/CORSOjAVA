package srl.neotech.academy.java03;

public class Dipendente extends Impiegato {
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
private double stipendio;

public double getStipendio() {
	return stipendio;
}

public void setStipendio(double stipendio) {
	this.stipendio = stipendio;
}
public double getPaga() {
	return stipendio;
	
}
}
