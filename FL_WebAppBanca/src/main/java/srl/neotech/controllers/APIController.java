package srl.neotech.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import srl.neotech.model.SingleListaMovimenti;
import srl.neotech.requestresponse.RequestSearchMovimento;

import srl.neotech.requestresponse.ResponseSearchMovimento;
import srl.neotech.requestresponse.StatusCode;

@RestController
public class APIController {

	
	@RequestMapping(value = "/api/hello")
	public String hello() {
		return "Ciaoooo!";
	}
	
	@ResponseBody
	@GetMapping(value = "/api/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchMovimento delete(@PathVariable("id") String idMovimento) {
		ResponseSearchMovimento response=new ResponseSearchMovimento();
		try {
			SingleListaMovimenti.getInstance().getListeMovimenti().removeIf(movimento->movimento.getId().equals(idMovimento));		
			response.setMovimenti(SingleListaMovimenti.getInstance().getListeMovimenti());
			response.setCode(StatusCode.OK.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode(StatusCode.ERROR.toString());
			response.setMsg(e.getMessage());
			e.printStackTrace();
		}
		return response;
	
	}
	

	@ResponseBody
	@PostMapping(value = "/api/add",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchMovimento search(@RequestBody RequestSearchMovimento request) {
		ResponseSearchMovimento response = new ResponseSearchMovimento();
		try {
		SingleListaMovimenti.getInstance().getListeMovimenti().add(request.getMovimento());
		response.setMovimenti(SingleListaMovimenti.getInstance().getListeMovimenti());
		response.setCode(StatusCode.OK.toString());
		} catch (Exception e) {
			response.setCode(StatusCode.ERROR.toString());
			response.setMsg(e.getMessage());
			e.printStackTrace();
		}
			return response;

	}











}





