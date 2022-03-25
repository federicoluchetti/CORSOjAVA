package srL.neotech.academy;

import java.util.ArrayList;

public class Biblioteca {
ArrayList<Libro> Libri= new ArrayList<Libro>();
ArrayList<Associato> Associati= new ArrayList<Associato>();
public ArrayList<Libro> getLibri() {
	return Libri;
}
public void setLibri(ArrayList<Libro> libri) {
	this.Libri = libri;
}
public ArrayList<Associato> getAssociati() {
	return Associati;
}
public void setAssociati(ArrayList<Associato> associati) {
	this.Associati = associati;
}

}
