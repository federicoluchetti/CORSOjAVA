package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Movimento;



public class ResponseSearchMovimento {
	private ArrayList<Movimento> movimenti=new ArrayList<Movimento>();
private String msg;
	
	private String code;

	public ArrayList<Movimento> getMovimenti() {
		return movimenti;
	}

	public void setMovimenti(ArrayList<Movimento> movimenti) {
		this.movimenti = movimenti;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
