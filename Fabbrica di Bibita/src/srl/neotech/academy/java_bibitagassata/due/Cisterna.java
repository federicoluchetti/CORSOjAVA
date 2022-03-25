package srl.neotech.academy.java_bibitagassata.due;

public class Cisterna {
 private Integer threshold;
 private Integer content;
 private Integer evapPerDay;
 private Tipologia tipologia;
 
 public Tipologia getTipologia() {
	return tipologia;
}

public void setTipologia(Tipologia tipologia) {
	this.tipologia = tipologia;
}

public Integer getContent() {
	return content;
}

public void setContent(Integer content) {
	this.content = content;
}

public Integer getEvapPerDay() {
	return evapPerDay;
}

public void setEvapPerDay(Integer evapPerDay) {
	this.evapPerDay = evapPerDay;
}


 

public Integer getThreshold() {
	return threshold;
}

public void setThreshold(Integer threshold) {
	this.threshold = threshold;
}
@Override
public String toString() {
	return this.getTipologia()+"--"+this.getContent()+"--"+this.getEvapPerDay()+"--"+this.getThreshold();
}
 
}
