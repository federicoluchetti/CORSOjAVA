package srl.neotech.aeroporto;

import java.util.ArrayList;

public class Aereo extends Modello{
	private Integer idUnivoco;
	private Integer orario;
	private CompagnieAeree compagniaAerea;
    ArrayList<Passeggero> Passeggeri= new ArrayList<Passeggero>();
	private Integer velocita;
	private Integer distanzaDallAeroporto;
	private  Stati stato;
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public CompagnieAeree getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea(CompagnieAeree compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}

	@Override
	public String getCostruttore() {
		// TODO Auto-generated method stub
		return super.getCostruttore();
	}
	@Override
	public void setCostruttore(String costruttore) {
		// TODO Auto-generated method stub
		super.setCostruttore(costruttore);
	}
	@Override
	public Integer getCodiceModello() {
		// TODO Auto-generated method stub
		return super.getCodiceModello();
	}
	@Override
	public void setCodiceModello(Integer codiceModello) {
		// TODO Auto-generated method stub
		super.setCodiceModello(codiceModello);
	}
	@Override
	public Integer getCapienzaNumPasseggeri() {
		// TODO Auto-generated method stub
		return super.getCapienzaNumPasseggeri();
	}
	@Override
	public void setCapienzaNumPasseggeri(Integer capienzaNumPasseggeri) {
		// TODO Auto-generated method stub
		super.setCapienzaNumPasseggeri(capienzaNumPasseggeri);
	}
	public ArrayList<Passeggero> getPasseggeri() {
		return Passeggeri;
	}
	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		Passeggeri = passeggeri;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}
	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}
	public Stati getStato() {
		return stato;
	}
	public void setStato(Stati stato) {
		this.stato = stato;
	}
	@Override
	public String toString() {
		return this.getIdUnivoco() + "--" +this.getOrario() + "--" + this.getVelocita()+ "--"+ this.getCompagniaAerea()+ "--"+this.getDistanzaDallAeroporto();
	}
}


