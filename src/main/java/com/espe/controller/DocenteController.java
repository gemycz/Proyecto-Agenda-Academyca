package com.espe.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.espe.dao.DocenteDao;
import com.espe.model.Docente;

@ManagedBean(name="docenteBean")
@RequestScoped

public class DocenteController {

	private List<Docente> arrayList;
	
	
	public List<Docente> getArrayList() {
		DocenteDao docentedao = new DocenteDao();
		return docentedao.obtenerDocente();
	}

	public void setArrayList(List<Docente> arrayList) {
		this.arrayList = arrayList;
	}

	
	
	public List<Docente> obtenerDocentes(){
	DocenteDao docentedao = new DocenteDao();
	
	
	
	return docentedao.obtenerDocente();

	}
	
	public String editar(int id) {
		DocenteDao docenteDao = new DocenteDao();
		Docente d = new Docente();
		d = docenteDao.buscar(id);
		System.out.println(d);
		
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("docente", d);
		return "editardocente.xhtml";
		
	}
	
	public String actualizar(Docente docente) {
		DocenteDao docenteDao = new DocenteDao();
		docenteDao.editar(docente);
		return "indexdocente.xhtml";
		
	}
	
	public String guardar(Docente docente) {
		DocenteDao docenteDao = new DocenteDao();
		docenteDao.guardar(docente);
		return "indexdocente.xhtml";
		
	}
	
	public String PaginaAdd() {
		Docente d = new Docente();
		Map <String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("docente", d);
		return "creardocente.xhtml";
		
	} 
	public String eliminar(int id) {
		DocenteDao docenteDao = new DocenteDao();
		docenteDao.eliminar(id);
		System.out.println("Docente Eliminado");
		
		return "indexdocente.xhtml";
		
	}
	
	
	
	
	
}
