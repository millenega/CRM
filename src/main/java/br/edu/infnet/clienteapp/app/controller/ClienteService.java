package br.edu.infnet.clienteapp.app.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.clienteapp.app.model.Cliente;
import br.edu.infnet.clienteapp.app.model.persistence.ClienteDao;
import br.edu.infnet.clienteapp.app.model.persistence.ProjetoDao;


@Service
public class ClienteService {
 
	@Autowired
	private ClienteDao dao;

	public ClienteService() {
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public List<Cliente> getCliente() {
		return dao.getAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persite(Cliente cliente) {
		dao.salvar(cliente);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Cliente cliente) {
		dao.editar(cliente);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(String id) {
		Objects.requireNonNull(id, "Vai para lá com esse id nullo");
		Integer integer = Integer.valueOf(id);
		dao.deletar(integer);
	}

	@Transactional(propagation = Propagation.NEVER)
	public Cliente getCliente(String id) {
		Objects.requireNonNull(id, "vai para lá com esse id nullo");
		
		Integer integer = Integer.valueOf(id);
		return dao.findOne(integer);
	}

	public ClienteDao getDao() {
		return dao;
	}

	public void setDao(ClienteDao dao) {
		this.dao = dao;
	}

}



