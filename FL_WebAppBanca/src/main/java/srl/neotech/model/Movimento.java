package srl.neotech.model;

import java.sql.Date;

public class Movimento {
private String Id;
private Date data;
private String operazione;
private String nominativo;
private int taglio;
private int quantità;
private int totale;
private String azioni;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public String getOperazione() {
	return operazione;
}
public void setOperazione(String operazione) {
	this.operazione = operazione;
}
public String getNominativo() {
	return nominativo;
}
public void setNominativo(String nominativo) {
	this.nominativo = nominativo;
}
public int getTaglio() {
	return taglio;
}
public void setTaglio(int taglio) {
	this.taglio = taglio;
}
public int getQuantità() {
	return quantità;
}
public void setQuantità(int quantità) {
	this.quantità = quantità;
}
public int getTotale() {
	return totale;
}
public void setTotale(int totale) {
	this.totale = totale;
}
public String getAzioni() {
	return azioni;
}
public void setAzioni(String azioni) {
	this.azioni = azioni;
}

public boolean equals(Movimento obj) {
	if (obj ==null) return false;
	if (obj ==this) return true;
	if (!(obj instanceof Movimento)) return false;
	Movimento o = (Movimento) obj ;
	return o.Id == this.Id;
	
	



}
}
