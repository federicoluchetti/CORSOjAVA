package srl.neotech.aeroporto;


import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Aeroporto {
ArrayList <Aereo> Aerei = new ArrayList<Aereo>();
ArrayList<Passeggero> Passeggeri= new ArrayList<Passeggero>();

Random r = new Random();
int raggioDiAzione = r.nextInt(100) + 1;
public int getRaggioDiAzione() {
	return raggioDiAzione;
}
public void setRaggioDiAzione(int raggioDiAzione) {
	this.raggioDiAzione = raggioDiAzione ;

	if(raggioDiAzione>=1&&raggioDiAzione<=100) {
		Aereo aereoDecollo=new Aereo();
		Aereo aereoAtterraggio=new Aereo();
		Passeggero passeggeroCheckin=new Passeggero();
		Passeggero passeggeroCheckout=new Passeggero();
aereoDecollo.getStato();equals(Stati.ATTERRATO);
aereoDecollo.setStato(Stati.DECOLLATO);
aereoAtterraggio.getStato();equals(Stati.IN_AVVICINAMENTO);
aereoAtterraggio.setStato(Stati.ATTERRATO);
passeggeroCheckin.getStatoPasseggero();equals(StatoPasseggero.CHECK_IN);
passeggeroCheckin.setStatoPasseggero(StatoPasseggero.A_BORDO);
passeggeroCheckout.getStatoPasseggero();equals(StatoPasseggero.CHECK_OUT);
passeggeroCheckout.setStatoPasseggero(StatoPasseggero.A_TERRA);
	}
 


}
}
