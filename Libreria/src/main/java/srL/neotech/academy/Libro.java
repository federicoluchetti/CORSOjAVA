package srL.neotech.academy;

import java.util.ArrayList;

public class Libro {
private Integer idLibro;
private String titolo;
private Genere Genere;
private String Autore;

private Integer scaffale;


public Integer getIdLibro() {
	return idLibro;
}
public void setIdLibro(Integer idLibro) {
	this.idLibro = idLibro;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public String getAutore() {
	return Autore;
}
public void setAutore(String autore) {
	this.Autore = autore;
}
public Genere getGenere() {
	return Genere;
}
public void setGenere(Genere genere) {
	this.Genere = genere;
}

public Integer getScaffale() {
	return scaffale;
}
public void setScaffale(Integer scaffale) {
	this.scaffale = scaffale;
}
@Override
public String toString() {
	return this.getIdLibro()+"--"+this.getTitolo()+"--"+this.getGenere()+"--"+this.getAutore()+"--"+this.getScaffale();
}
}
