package srl.neotech.academy;

import java.util.EnumMap;
import java.util.Enumeration;

public class Libro{

	private Integer idLibro;
	private String titolo;
	private String autore;
	private Genere genere;
	private Scaffale scaffale;
	
	
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitolo() {
		return " [Titolo Libro]:"+titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return " [Autore Libro]:"+autore;
	}
	public void setAutore(String autore) {
		this.autore =autore;
	}
	
	public Genere getGenere() {
		return genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	
	
	






	
	public Scaffale getScaffale() {
		return scaffale;
	}
	public void setScaffale(Scaffale scaffale) {
		this.scaffale = scaffale;
	}
	@Override
	public String toString() {
		return this.getIdLibro()+"--"+this.getTitolo()+"--"+this.getAutore()+"--"+this.getGenere()+"--"+this.getScaffale();
	}
	
	
	
}
