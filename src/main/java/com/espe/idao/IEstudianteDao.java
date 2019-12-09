package com.espe.idao;

import java.util.List;

import com.espe.model.Estudiante;

public interface IEstudianteDao {

	
	
	
	public Estudiante buscar(int id);
	public List<Estudiante>obtenerEstudiantes();
	void guardar(Estudiante estudiante);
    void editar(Estudiante estudiante);
    void eliminar(int id);
    
	
}
