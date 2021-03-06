package srl.neotech.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.Movimento;
import srl.neotech.model.SingleListaMovimenti;
import srl.neotech.requestresponse.ListaMovimentiResponse;
import srl.neotech.requestresponse.RequestEliminaVoce;
import srl.neotech.requestresponse.RequestPrelievo;
import srl.neotech.requestresponse.RequestVersamento;

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
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}
	@RequestMapping(value="/lista", method = RequestMethod.GET)
	public String listam(Model model) {

		return "lista_movimenti";
	}
	
	LocalDateTime myDateObj= LocalDateTime.now();
	DateTimeFormatter myFormtObj=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
	String formattedDate = myDateObj.format(myFormtObj);
	
	
	
		@RequestMapping(value="/genera_lista", method = RequestMethod.GET)
		public String generalista(Model model) {
			for (int i=0;i<50;i++){
				Movimento lista=new Movimento();
				lista.setId(UUID.randomUUID().toString());
				lista.setData(null);
				lista.setOperazione(null);
				lista.setNominativo(null);
				lista.setTaglio(i);
				lista.setQuantità(i);
				lista.setTotale(i);
				SingleListaMovimenti.getInstance().getListeMovimenti().add(lista);
			}
			model.addAttribute("numeroMovimentiGenerati", SingleListaMovimenti.getInstance().getListeMovimenti().size());
			return "genera-movimenti";
	}
		
		
		@RequestMapping(value="/listamovimenti", method = RequestMethod.GET)
		public String listamovimenti(Model model) {
			ListaMovimentiResponse response = new ListaMovimentiResponse();
			response.setListaMovimentiRestituti(SingleListaMovimenti.getInstance().getListeMovimenti());
			 model.addAttribute("responseMovimenti", response);
			return "listamovimenti";
		}
		
	
		
		
		@RequestMapping(value="/elimina-voce", method = RequestMethod.GET)
		public String geliminavoce(@ModelAttribute  RequestEliminaVoce dati_in_input, Model model) {
			System.out.println("dati lista: " + dati_in_input.getId());
		SingleListaMovimenti.getInstance().getListeMovimenti().removeIf(ListaMovimenti->ListaMovimenti.getId().equals(dati_in_input.getId()));
			
			ListaMovimentiResponse response= new ListaMovimentiResponse();
			response.setListaMovimentiRestituti(SingleListaMovimenti.getInstance().getListeMovimenti());
			model.addAttribute("responseLista", response);
			
			return "listamovimenti";}
		
		

		
		
		
	@RequestMapping(value="/prelevamento", method = RequestMethod.GET)
	public String prelevamento(Model model) {
		return "prelevamento";
	}
	
	@RequestMapping(value="/prelevamento2", method = RequestMethod.GET)
	public String prelevamento2(Model model) {
		RequestPrelievo datiPrelievo = new RequestPrelievo();
		model.addAttribute("mapping_dati", datiPrelievo);
		return "prelevamentotest";
	}
	
	@RequestMapping(value="/prelievo_get", method = RequestMethod.POST)
	public String inviovprelievo(@ModelAttribute ("mapping_dati")RequestPrelievo dati_in_input, Model model) {
		System.out.println(dati_in_input.getNominativo());
		System.out.println(dati_in_input.getAltroImporto());
		model.addAttribute("nominativo", dati_in_input.getNominativo());
		model.addAttribute("altroimporto", dati_in_input.getAltroImporto());
		return "testBanca";
	}
	
	
	
	@RequestMapping(value="/versamento", method = RequestMethod.GET)
	public String versamento(Model model) {
		RequestVersamento datiVersamento = new RequestVersamento();
		model.addAttribute("mapping_dati", datiVersamento);
		return "versamento";
	}
	
	@RequestMapping(value="/inviovers_get", method = RequestMethod.POST)
	public String invioversget(@ModelAttribute ("mapping_dati")RequestVersamento dati_in_input, Model model) {
		System.out.println(dati_in_input.getUsername());
		System.out.println(dati_in_input.getTaglio());
		System.out.println(dati_in_input.getQuantità());
		model.addAttribute("username", dati_in_input.getUsername());
		model.addAttribute("taglio", dati_in_input.getTaglio());
		model.addAttribute("quantità", dati_in_input.getQuantità());
		return "testBanca";
	}

	@RequestMapping(value="/home_get", method = RequestMethod.GET)
	public String homeget(@ModelAttribute ("mapping_dati")Model model) {
		return "home";
	}
	@RequestMapping(value="/lista_get", method = RequestMethod.GET)
	public String listaget(@ModelAttribute ("mapping_dati")Model model) {
		
		return "lista_movimenti";
	}
	@RequestMapping(value="/prelevamento_get", method = RequestMethod.GET)
	public String prelevamentoget(@ModelAttribute ("mapping_dati")Model model) {
		return "prelevamento";
	}
	@RequestMapping(value="/versamento_get", method = RequestMethod.GET)
	public String versamentoget(@ModelAttribute ("mapping_dati")Model model) {
		return "versamento";
	}






}








/*singleton  crea lista oggetto - crea ciclo - set attributi - add. a lista - ritorna il genera  crea nuova lista con il bean che contiene la restituzione della prima  c for each*/