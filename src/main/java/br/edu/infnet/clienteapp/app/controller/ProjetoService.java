package br.edu.infnet.clienteapp.app.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.clienteapp.app.model.Projeto;
import br.edu.infnet.clienteapp.app.model.persistence.ProjetoDao;
import br.edu.infnet.clienteapp.app.model.persistence.ProjetoDao;


@Service
public class ProjetoService{
 
	@Autowired
	private ProjetoDao dao;

	public ProjetoService() {
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public List<Projeto> getProjeto() {
		return dao.getAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persite(Projeto projeto) {
		dao.salvar(projeto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Projeto projeto) {
		dao.editar(projeto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(String id) {
		Objects.requireNonNull(id, "Vai para lá com esse id nullo");
		Integer integer = Integer.valueOf(id);
		dao.deletar(integer);
	}

	@Transactional(propagation = Propagation.NEVER)
	public Projeto getProjeto(String id) {
		Objects.requireNonNull(id, "vai para lá com esse id nullo");
		
		Integer integer = Integer.valueOf(id);
		return dao.findOne(integer);
	}

	public ProjetoDao getDao() {
		return dao;
	}

	public void setDao(ProjetoDao dao) {
		this.dao = dao;
	}

}


