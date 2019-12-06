package com.espe.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.espe.dao.TareasDao;
import com.espe.model.Tareas;

@ManagedBean(name="tareasBean")
@RequestScoped

public class TareasController {

private List<Tareas> arrayList;
	
	
	public List<Tareas> getArrayList() {
		TareasDao tareasdao = new TareasDao();
		return tareasdao.obtenerTareas();
	}

	public void setArrayList(List<Tareas> arrayList) {
		this.arrayList = arrayList;
	}

	
	
	public List<Tareas> obtenerTareas(){
		TareasDao docentedao = new TareasDao();
	
	
	
	return docentedao.obtenerTareas();

	}
	
	public String editar(int id) {
		TareasDao tareasDao = new TareasDao();
		Tareas t = new Tareas();
		t = tareasDao.buscar(id);
		System.out.println(t);
		
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("tareas", t);
		return "editartareas.xhtml";
		
	}
	
	public String actualizar(Tareas tareas) {
		TareasDao tareasDao = new TareasDao();
		tareasDao.editar(tareas);
		return "indextareas.xhtml";
		
	}
	
	public String guardar(Tareas tareas) {
		TareasDao tareasDao = new TareasDao();
		tareasDao.guardar(tareas);
		return "indextareas.xhtml";
		
	}
	
	public String PaginaAdd() {
		Tareas t = new Tareas();
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("tareas", t);
		return "creartareas.xhtml";
		
	} 
	public String eliminar(int id) {
		TareasDao tareasDao = new TareasDao();
		tareasDao.eliminar(id);
		System.out.println("Tarea Eliminada");
		
		return "indextareas.xhtml";
		
	}
	
}
