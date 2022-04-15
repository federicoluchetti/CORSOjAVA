package srl.neotech.model;
import java.util.ArrayList;
public class SingleListaMovimenti {

	private static SingleListaMovimenti instance=null;

	ArrayList<ListaMovimenti> ListeMovimenti = new ArrayList<ListaMovimenti>();

	public ArrayList<ListaMovimenti> getListeMovimenti() {
		return ListeMovimenti;
	}

	public void setListeMovimenti(ArrayList<ListaMovimenti> listeMovimenti) {
		this.ListeMovimenti = listeMovimenti;
	}

public static SingleListaMovimenti  getInstance() {
	if (instance==null) {
		instance= new SingleListaMovimenti ();
	}
	return instance;
}




}




