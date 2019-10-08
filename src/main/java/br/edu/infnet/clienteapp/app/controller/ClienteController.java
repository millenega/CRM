package br.edu.infnet.clienteapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.clienteapp.app.model.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/clientes/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Cliente> clientes = service.getCliente();
		model.addAttribute("listaClientes", clientes);
		return "clientes/list";
	}
	
	@RequestMapping(value = "/clientes/form" , method = RequestMethod.GET)
	public String viewForm(Model model) {
		return "clientes/form";
	}
	
	
	@RequestMapping(value = "/clientes/add", method = RequestMethod.POST)
	public String save(Model model, Cliente cliente) {
		service.persite(cliente);
		return "redirect:/clientes/list";
	}
	
	@RequestMapping(value = "/clientes/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") String id, Model model) {
		Cliente cliente = service.getCliente(id);
		model.addAttribute("cliente", cliente);
		return "clientes/edit";
	}
	
	
	@RequestMapping(value = "/clientes/deletar/{id}",method = RequestMethod.GET)
    public String deletar(@PathVariable("id") String id) {
		service.delete(id);
		return "redirect:/clientes/list";
    }
	
	
	@RequestMapping(value = "/clientes/update", method = RequestMethod.POST)
	public String update(Model model, Cliente cliente) {
		service.update(cliente);
		return "redirect:/clientes/list";
	}
	
	public ClienteService getService() {
		return service;
	}

	public void setService(ClienteService service) {
		this.service = service;
	}
	
}
