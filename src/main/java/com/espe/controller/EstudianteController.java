package com.espe.controller;


import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

import com.espe.dao.EstudianteDao;
import com.espe.model.Estudiante;


//encargado de recibir las peticiones del navegador 

@ManagedBean(name="estudianteBean")
@RequestScoped

public class EstudianteController {
	
	private List<Estudiante> arrayList;
	
	
	public List<Estudiante> getArrayList() {
		EstudianteDao estudiantedao = new EstudianteDao();
		return estudiantedao.obtenerEstudiantes();
	}

	public void setArrayList(List<Estudiante> arrayList) {
		this.arrayList = arrayList;
	}

	
	
	public List<Estudiante>obtenerEstudiantes(){
		List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
		EstudianteDao estudiantedao = new EstudianteDao();
		return estudiantedao.obtenerEstudiantes();
	}
	
	public String guardar(Estudiante estudiante) {
		EstudianteDao estudianteDao = new EstudianteDao();
		estudianteDao.guardar(estudiante);
		return "index.xhtml";
		
	}
	
	public String agregar() {
		Estudiante es = new Estudiante();
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("estudiante", es);
		return "crear.xhtml";
		
	} 
	public String eliminar(int id) {
		EstudianteDao estudiantedao = new EstudianteDao();
		estudiantedao.eliminar(id);
		System.out.println("Estudiante Eliminado");
		
		return "index.xhtml";
		
	}
	public String editar(int id) {
		EstudianteDao estudiantedao = new EstudianteDao();
		Estudiante es = new Estudiante();
		es = estudiantedao.buscar(id);
		System.out.println(es);
		
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("estudiante", es);
		return "editar.xhtml";
		
	}
	
	public String actualizar(Estudiante estudiante) {
		EstudianteDao estudiantedao = new EstudianteDao();
		estudiantedao.editar(estudiante);
		return "index.xhtml";
		
	}
	
	
	

}
