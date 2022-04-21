package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Movimento;

public class ListaMovimentiResponse {

	ArrayList<Movimento> listaMovimentiRestituiti = new ArrayList<Movimento>();

	public ArrayList<Movimento> getListaMovimentiRestituti() {
		return listaMovimentiRestituiti;
	}

	public void setListaMovimentiRestituti(ArrayList<Movimento> listaMovimentiRestituti) {
		this.listaMovimentiRestituiti = listaMovimentiRestituti;
	}
}
