package com.espe.idao;

import java.util.List;

import com.espe.model.Docente;

public interface IDocenteDao {

	public void guardar(Docente docente);

	public void editar(Docente docente);

	public Docente buscar(int id);

	public void eliminar(int id);

	public List<Docente> obtenerDocente();

}
