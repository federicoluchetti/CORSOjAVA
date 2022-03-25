package srl.neotech.academy.java03;

public abstract class Impiegato implements LImpiegato {
private String nome;
private String indirizzo;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
private String telefono;


public double getPaga() {
	return 0;
}
}