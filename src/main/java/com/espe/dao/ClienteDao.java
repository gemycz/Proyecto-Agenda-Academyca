package com.espe.dao;

import com.espe.model.Cliente;
import com.espe.model.JPAUtil;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.espe.idao.IClienteDao;

public class ClienteDao implements IClienteDao{

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		
		entity.getTransaction().begin();
		entity.persist(cliente);
		entity.getTransaction().commit();
		
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(cliente);
		entity.getTransaction().commit();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c = entity.find(Cliente.class, id);
		
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}
	
	@Override
	public Cliente buscar(int id) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c = entity.find(Cliente.class, id);
		
		return c;
	}

	@Override
	public List<Cliente> obtenerCliente() {
		// TODO Auto-generated method stub
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		Query q = entity.createQuery("SELECT c FROM Cliente c");
		listaClientes = q.getResultList();
		
		return listaClientes;
	}

	

}
