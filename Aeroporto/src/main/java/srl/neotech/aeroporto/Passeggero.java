package srl.neotech.aeroporto;

public class Passeggero {
private Integer idUnivoco;
private Genere MF;
private Integer eta;
private Classe classeViaggiatore;
private Boolean haBagagli;
private Boolean haFiore;
private Boolean haChampagne;
private Boolean haGiornale;
public Integer getIdUnivoco() {
	return idUnivoco;
}
public void setIdUnivoco(Integer idUnivoco) {
	this.idUnivoco = idUnivoco;
}
public Genere getMF() {
	return MF;
}
public void setMF(Genere mF) {
	MF = mF;
}
public Integer getEta() {
	return eta;
}
public void setEta(Integer eta) {
	this.eta = eta;
}
public Classe getClasseViaggiatore() {
	return classeViaggiatore;
}
public void setClasseViaggiatore(Classe classeViaggiatore) {
	this.classeViaggiatore = classeViaggiatore;
}
public Boolean getHaBagagli() {
	return haBagagli;
}
public void setHaBagagli(Boolean haBagagli) {
	this.haBagagli = haBagagli;
}
public Boolean getHaFiore() {
	return haFiore;
}
public void setHaFiore(Boolean haFiore) {
	this.haFiore = haFiore;
}
public Boolean getHaChampagne() {
	return haChampagne;
}
public void setHaChampagne(Boolean haChampagne) {
	this.haChampagne = haChampagne;
}
public Boolean getHaGiornale() {
	return haGiornale;
}
public void setHaGiornale(Boolean haGiornale) {
	this.haGiornale = haGiornale;
}
}
