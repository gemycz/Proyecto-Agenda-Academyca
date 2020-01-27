package com.espe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.espe.dao.AsignaturaDao;
import com.espe.dao.TareasDao;
import com.espe.idao.IAsignaturaDao;
import com.espe.idao.ITareasDao;
import com.espe.model.Asignatura;
import com.espe.model.Docente;

//encargado de recibir las peticiones del navegador 

@ManagedBean(name = "asignaturaBean")
@RequestScoped

public class AsignaturaController {

	public AsignaturaController() {
		listaDias = new ArrayList<>();
		listaDias.add("Lunes");
		listaDias.add("Martes");
		listaDias.add("Miércoles");
		listaDias.add("Jueves");
		listaDias.add("Viernes");
		listaDias.add("Sábado");
		listaDias.add("Domingo");

	}

	private List<Asignatura> arrayList;
	private List<SelectItem> listDocente;

	List<String> listaDias;

	public List<String> getListaDias() {
		return listaDias;
	}

	public void setListaDias(List<String> listaDias) {
		this.listaDias = listaDias;
	}

	public List<Asignatura> getArrayList() {
		AsignaturaDao asignaturadao = new AsignaturaDao();
		return asignaturadao.obtenerAsignatura();
	}

	public void setArrayList(List<Asignatura> arrayList) {
		this.arrayList = arrayList;
	}

	public List<Asignatura> obtenerAsignatura() {
		AsignaturaDao asignaturadao = new AsignaturaDao();
		return asignaturadao.obtenerAsignatura();

	}

	public List<SelectItem> getListDocente() {
		this.listDocente = new ArrayList<SelectItem>();
		IAsignaturaDao asignaturaDao = new AsignaturaDao();
		List<Docente> a = asignaturaDao.obtenerDocente();
		listDocente.clear();

		for (Docente docente : a) {
			SelectItem asignaturaItem = new SelectItem(docente.getID_DOCENTE(),
					docente.getNOMBRE_DOCENTE() + " " + docente.getAPELLIDO_DOCENTE());
			this.listDocente.add(asignaturaItem);
		}

		return listDocente;
	}

	public void setListDocente(List<SelectItem> listDocente) {
		this.listDocente = listDocente;
	}

	public String editar(int id) {
		AsignaturaDao asignaturadaoDao = new AsignaturaDao();
		Asignatura c = new Asignatura();
		c = asignaturadaoDao.buscar(id);
		System.out.println(c);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
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
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
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
