package com.espe.controller;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import com.espe.model.Tareas;

@ManagedBean(name = "tareasBean")
@RequestScoped

public class TareasController implements Serializable {

	private List<Tareas> arrayList;
	private List<Tareas> tareasFecha;
	private List<Tareas> tareasFecha1;
	private List<Tareas> tareasFecha2;
	private List<Tareas> tareasFecha3;
	private List<Tareas> tareasFecha4;

	private List<SelectItem> arrayList1;
	private List<SelectItem> listaAsig;
	private Asignatura asig;
	// private ArrayList<SelectItem> ListAsignatura = new ArrayList<>();

	private Tareas tareas;

	public TareasController() {

	}

	List<String> listEstado;

	public List<String> getListEstado() {

		listEstado = new ArrayList<>();
		listEstado.add("Tarea por entregar");
		listEstado.add("Tarea entregada");
		listEstado.add("Tarea en proceso");
		listEstado.add("Tarea terminada");

		return listEstado;
	}

	public void setListEstado(List<String> listEstado) {
		this.listEstado = listEstado;
	}

	public Tareas getTareas() {
		return tareas;
	}

	public void setTareas(Tareas tareas) {
		this.tareas = tareas;
	}

	public void preparNuevaTarea(ActionEvent actionEvent) {
		tareas = new Tareas();
	}

	public List<SelectItem> getArrayList1() {
		this.arrayList1 = new ArrayList<SelectItem>();
		ITareasDao tareasDao = new TareasDao();
		List<Asignatura> a = tareasDao.obtenerAsignaturas();
		arrayList1.clear();

		for (Asignatura asignatura : a) {
			SelectItem asignaturaItem = new SelectItem(asignatura.getNRC_ASIGNATURA(),
					asignatura.getNOMBRE_ASIGNATURA());
			this.arrayList1.add(asignaturaItem);
		}

		return arrayList1;
	}

	public void setListaAsig(List<SelectItem> listaAsig) {
		this.listaAsig = listaAsig;
	}

	public List<Tareas> getArrayList() {
		TareasDao tareasdao = new TareasDao();
		return tareasdao.obtenerTareas();
	}

	public void setArrayList(List<Tareas> arrayList) {
		this.arrayList = arrayList;
	}

	public List<Tareas> getTareasFecha() {
		TareasDao tareasDao = new TareasDao();

		return tareasDao.obtenerTareasFecha();
	}

	public void setTareasFecha(List<Tareas> tareasFecha) {
		this.tareasFecha = tareasFecha;
	}

	public List<Tareas> getTareasFecha1() {
		TareasDao tareasDao = new TareasDao();

		return tareasDao.obtenerTareasFecha1();
	}

	public void setTareasFecha1(List<Tareas> tareasFecha1) {
		this.tareasFecha1 = tareasFecha1;
	}

	public List<Tareas> getTareasFecha2() {
		TareasDao tareasDao = new TareasDao();

		return tareasDao.obtenerTareasFecha2();
	}

	public void setTareasFecha2(List<Tareas> tareasFecha2) {
		this.tareasFecha2 = tareasFecha2;
	}

	public List<Tareas> getTareasFecha3() {
		TareasDao tareasDao = new TareasDao();

		return tareasDao.obtenerTareasFecha3();
	}

	public void setTareasFecha3(List<Tareas> tareasFecha3) {
		this.tareasFecha3 = tareasFecha3;
	}

	
	
	public List<Tareas> getTareasFecha4() {
		TareasDao tareasDao = new TareasDao();

		return tareasDao.obtenerTareasFecha3();
	}

	public void setTareasFecha4(List<Tareas> tareasFecha4) {
		this.tareasFecha4 = tareasFecha4;
	}

	public List<Tareas> obtenerTareas() {
		TareasDao tareasDao = new TareasDao();

		return tareasDao.obtenerTareas();

	}

	public String editar(int id) {
		TareasDao tareasDao = new TareasDao();
		Tareas t = new Tareas();
		t = tareasDao.buscar(id);
		System.out.println(t);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
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
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
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
