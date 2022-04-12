package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.requestresponse.GetRequest;





@Controller
public class ViewController {

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
	@RequestMapping(value="/testform", method = RequestMethod.GET)
	public String testform(Model model) {
		GetRequest datiRequest = new GetRequest();
		model.addAttribute("mapping_dati", datiRequest);
		return "test_form"; 
		}
		
		
		@RequestMapping(value="/inviodati_get", method = RequestMethod.POST)
		public String inviodatiget(@ModelAttribute ("mapping_dati")GetRequest dati_in_input, Model model) {
			System.out.println(dati_in_input.getUsername());
			System.out.println(dati_in_input.getPassword());
			System.out.println(dati_in_input.getEmail());
			model.addAttribute("user", dati_in_input.getUsername());
			model.addAttribute("password", dati_in_input.getPassword());
			model.addAttribute("email", dati_in_input.getEmail());
			return "registrazione_view";
	
}
}