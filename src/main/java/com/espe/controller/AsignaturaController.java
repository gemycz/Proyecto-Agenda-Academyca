package com.espe.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.espe.dao.AsignaturaDao;
import com.espe.model.Asignatura;

//encargado de recibir las peticiones del navegador 

@ManagedBean(name="asignaturaBean")
@RequestScoped

public class AsignaturaController {
	
	
	private List<Asignatura> arrayList;
	

	
	public List<Asignatura> getArrayList() {
		AsignaturaDao asignaturadao = new AsignaturaDao();
		return asignaturadao.obtenerAsignatura();
	}

	public void setArrayList(List<Asignatura> arrayList) {
		this.arrayList = arrayList;
	}

	public List<Asignatura> obtenerAsignatura(){
		AsignaturaDao asignaturadao = new AsignaturaDao();
	return asignaturadao.obtenerAsignatura();

	}
	
	public String editar(int id) {
		AsignaturaDao asignaturadaoDao = new AsignaturaDao();
		Asignatura c = new Asignatura();
		c = asignaturadaoDao.buscar(id);
		System.out.println(c);
		
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("asignatura", c);
		return "editarasigntura.xhtml";
		
	}
	
	public String actualizar(Asignatura asignatura) {
		AsignaturaDao asignaturaDao = new AsignaturaDao();
		asignaturaDao.editar(asignatura);
		return "indexasignaturas.xhtml";
		
	}
	
	public String guardar(Asignatura asignatura) {
		AsignaturaDao asignaturaDao = new AsignaturaDao();
		asignaturaDao.guardar(asignatura);
		return "indexasignaturas.xhtml";
		
	}
	
	public String PaginaAdd() {
		Asignatura c = new Asignatura();
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("asignatura", c);
		return "crearAsignatura.xhtml";
		
	} 
	public String eliminar(int id) {
		AsignaturaDao asignaturaDao = new AsignaturaDao();
		asignaturaDao.eliminar(id);
		System.out.println("Cliente Eliminado");
		
		return "indexasignaturas.xhtml";
		
	}
	
	
	
}
