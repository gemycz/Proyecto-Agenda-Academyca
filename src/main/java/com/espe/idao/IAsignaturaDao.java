package com.espe.idao;

import java.util.List;

import com.espe.model.Asignatura;;

public interface IAsignaturaDao {
	
	public void guardar(Asignatura asignatua);
	public void editar(Asignatura asignatua);
	
	public Asignatura buscar(int id);
	public void eliminar(int id);
	
	public List <Asignatura> obtenerAsignatura();


}