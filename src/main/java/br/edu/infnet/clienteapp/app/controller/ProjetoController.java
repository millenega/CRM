package br.edu.infnet.clienteapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.clienteapp.app.model.Projeto;

@Controller
public class ProjetoController{

	@Autowired
	private ProjetoService service;
	
	@RequestMapping(value = "/projetos/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Projeto> projetos = service.getProjeto();
		model.addAttribute("listaProjetos", projetos);
		return "projetos/list";
	}
	
	@RequestMapping(value = "/projetos/form" , method = RequestMethod.GET)
	public String viewForm(Model model) {
		return "projetos/form";
	}
	
	
	@RequestMapping(value = "/projetos/add", method = RequestMethod.POST)
	public String save(Model model, Projeto projeto) {
		service.persite(projeto);
		return "redirect:/projetos/list";
	}
	
	@RequestMapping(value = "/projetos/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") String id, Model model) {
		Projeto projeto = service.getProjeto(id);
		model.addAttribute("projeto", projeto);
		return "projetos/edit";
	}
	
	
	@RequestMapping(value = "/projetos/deletar/{id}",method = RequestMethod.GET)
    public String deletar(@PathVariable("id") String id) {
		service.delete(id);
		return "redirect:/projetos/list";
    }
	
	
	@RequestMapping(value = "/projetos/update", method = RequestMethod.POST)
	public String update(Model model, Projeto projeto) {
		service.update(projeto);
		return "redirect:/projetos/list";
	}
	
	public ProjetoService getService() {
		return service;
	}

	public void setService(ProjetoService service) {
		this.service = service;
	}
	
}
