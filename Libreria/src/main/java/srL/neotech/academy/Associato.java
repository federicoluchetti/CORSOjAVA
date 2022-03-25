package srL.neotech.academy;

import java.util.ArrayList;

public class Associato {
private Integer idAssociato;
private String nominativo;

private Stato Stato;
ArrayList<Libro>ListaIdLibri=new ArrayList<Libro>();
public Integer getIdAssociato() {
	return idAssociato;
}
public void setIdAssociato(Integer idAssociato) {
	this.idAssociato = idAssociato;
}
public String getNominativo() {
	return nominativo;
}
public void setNominativo(String nominativo) {
	this.nominativo = nominativo;
}
public Stato getStato() {
	return Stato;
}
public void setStato(Stato stato) {
	this.Stato = stato;
}
public ArrayList<Libro> getListaIdLibri() {
	return ListaIdLibri;
}
public void setListaIdLibri(ArrayList<Libro> listaIdLibri) {
	this.ListaIdLibri = listaIdLibri;
}
@Override
public String toString(){
	return this.getIdAssociato()+"--"+this.getNominativo()+"--"+this.getStato()+"--"+getListaIdLibri();
} 

}
