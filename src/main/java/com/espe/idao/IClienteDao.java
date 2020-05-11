package com.espe.idao;

import java.util.List;

import com.espe.model.Cliente;

public interface IClienteDao {

	public void guardar(Cliente cliente);

	public void editar(Cliente cliente);

	public Cliente buscar(int id);

	public void eliminar(int id);

	public List<Cliente> obtenerCliente();

}
