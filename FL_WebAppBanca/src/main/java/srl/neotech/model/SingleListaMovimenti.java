package srl.neotech.model;
import java.util.ArrayList;
public class SingleListaMovimenti {

	private static SingleListaMovimenti instance=null;

	ArrayList<Movimento> ListeMovimenti = new ArrayList<Movimento>();

	public ArrayList<Movimento> getListeMovimenti() {
		return ListeMovimenti;
	}

	public void setListeMovimenti(ArrayList<Movimento> listeMovimenti) {
		this.ListeMovimenti = listeMovimenti;
	}

public static SingleListaMovimenti  getInstance() {
	if (instance==null) {
		instance= new SingleListaMovimenti ();
	}
	return instance;
}




}




