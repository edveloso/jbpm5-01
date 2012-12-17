package br.com.petrobras.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petrobras.business.entity.Contato;
import br.com.petrobras.business.persistence.IContatoDAO;


@Controller(value="/contato/**")
public class ContatoController {
	
	private static final String LIST = "contato/list";

	private static final String FORM = "contato/form";

	private static final String REDIRECT = "redirect:/contato";

	private static final String EDIT = "contato/edit";
	
	@Autowired
	private IContatoDAO<Contato> contatoDAO;


	@RequestMapping(value="/contato/form") 
	public String newForm(Model model){
		model.addAttribute("contato", null); 
		return FORM;
	}
	
	@RequestMapping(value="/contato/remove/{id}")
	public String remove(@PathVariable("id") Integer id,  Model model){
		contatoDAO.remove(contatoDAO.getById(id));
		return REDIRECT;
	}
	
	
	@RequestMapping(value="/contato/edit/{id}")
	public String editForm(@PathVariable("id") Integer id,  Model model){
		Contato contato = contatoDAO.getById(id);
		model.addAttribute("contato", contato);
		return EDIT;
	}
	
	
	@RequestMapping(value="/contato/update")
	public String update(Model model, Contato contato){
		contatoDAO.update(contato);
		return REDIRECT;
	}
	
	@RequestMapping(value="/contato/save") 
	public String save(Contato contato, Model model){
		contatoDAO.save(contato);
		return REDIRECT;
	}
	
	@RequestMapping(value="/contato")
	public String get(Model model){
		model.addAttribute("list", contatoDAO.list());
		return LIST;
	}

	public IContatoDAO<Contato> getContatoDAO() {
		return contatoDAO;
	}

	public void setContatoDAO(IContatoDAO<Contato> contatoDAO) {
		this.contatoDAO = contatoDAO;
	}
	

}
