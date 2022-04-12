package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.requestresponse.ProvaGetRequest;
import srl.neotech.requestresponse.RequestRegistrazione;

@Controller
public class ViewController {

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(Model model) {
		 model.addAttribute("registrazione", new RequestRegistrazione()); 
		return "test_view";
	}
	
	
	@RequestMapping(value="/provaget", method = RequestMethod.GET)
	public String provaGet(Model model) {
		ProvaGetRequest datiRequest=new ProvaGetRequest();
		model.addAttribute("mapping_dati", datiRequest);
		return "provaget_view";
	}
	
	
	
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("mioTesto", "ProvaMassimiliano");
		return "hello_view";
	}
		
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax_view";
	}
	
	
	@RequestMapping(value="/registrazione_dati", method = RequestMethod.POST)
	public String registrazioneDati(@ModelAttribute("registrazione") RequestRegistrazione dati_in_input, Model model) {
         System.out.println(dati_in_input.getUsername());
         System.out.println(dati_in_input.getPassword());
         model.addAttribute("utente", dati_in_input.getUsername());
         return "registrazione_ok_view";
	}
	
	
	@RequestMapping(value="/inviodati_get", method = RequestMethod.POST)
	public String ricezioneDati(@ModelAttribute("mapping_dati") ProvaGetRequest dati_in_input, Model model) {
         System.out.println(dati_in_input.getUsername());
         System.out.println(dati_in_input.getEmail());
         model.addAttribute("utente", dati_in_input.getUsername());
         return "registrazione_ok_view";
	}
}
