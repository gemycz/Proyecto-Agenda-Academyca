package com.espe.idao;

import java.util.List;

import com.espe.model.Asignatura;
import com.espe.model.Tareas;

public interface ITareasDao {

	public void guardar(Tareas tareas);

	public void editar(Tareas tareas);

	public Tareas buscar(int id);

	public void eliminar(int id);

	public List<Tareas> obtenerTareas();

	List<Asignatura> obtenerAsignaturas();

	List<Tareas> obtenerTareasFecha();

	List<Tareas> obtenerTareasFecha1();

	List<Tareas> obtenerTareasFecha2();

	List<Tareas> obtenerTareasFecha3();

	List<Tareas> obtenerTareasFecha4();

}
