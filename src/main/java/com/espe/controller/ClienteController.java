package com.espe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.espe.dao.ClienteDao;
import com.espe.model.Cliente;

//encargado de recibir las peticiones del navegador 

@ManagedBean(name="clienteBean")
@RequestScoped

public class ClienteController {
	
	
	private List<Cliente> arrayList;
	
	
	public List<Cliente> getArrayList() {
		ClienteDao clientedao = new ClienteDao();
		return clientedao.obtenerCliente();
	}

	public void setArrayList(List<Cliente> arrayList) {
		this.arrayList = arrayList;
	}

	
	
	public List<Cliente> obtenerClientes(){
	ClienteDao clientedao = new ClienteDao();
	
	
	
	/*List<Cliente> listaClientes = new ArrayList<Cliente>();
	Cliente c1 = new Cliente();
	Cliente c2 = new Cliente();
	
	
	c1.setIdCliente(1);
	c1.setNombreCli("Gema");
	c1.setApellidoCli("Castillo");
	c1.setCedulaCli("1313602920");
	
	c2.setIdCliente(2);
	c2.setNombreCli("Santiago");
	c2.setApellidoCli("Perez");
	c2.setCedulaCli("2222222222");
	

	listaClientes.add(c1);
	listaClientes.add(c2);
	
	
	return listaClientes;*/
	
	return clientedao.obtenerCliente();

	}
	
	public String editar(int id) {
		ClienteDao clienteDao = new ClienteDao();
		Cliente c = new Cliente();
		c = clienteDao.buscar(id);
		System.out.println(c);
		
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return "editar.xhtml";
		
	}
	
	public String actualizar(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.editar(cliente);
		return "index.xhtml";
		
	}
	
	public String guardar(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.guardar(cliente);
		return "index.xhtml";
		
	}
	
	public String PaginaAdd() {
		Cliente c = new Cliente();
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return "crear.xhtml";
		
	} 
	public String eliminar(int id) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.eliminar(id);
		System.out.println("Cliente Eliminado");
		
		return "index.xhtml";
		
	}
	
	
	
	
	
}
