package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.ListaMovimenti;

public class ListaMovimentiResponse {

	ArrayList<ListaMovimenti> listaMovimentiRestituiti = new ArrayList<ListaMovimenti>();

	public ArrayList<ListaMovimenti> getListaMovimentiRestituti() {
		return listaMovimentiRestituiti;
	}

	public void setListaMovimentiRestituti(ArrayList<ListaMovimenti> listaMovimentiRestituti) {
		this.listaMovimentiRestituiti = listaMovimentiRestituti;
	}
}
