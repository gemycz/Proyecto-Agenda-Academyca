package com.espe.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Componentes {

	private String dia;

	List <String> listaDias;
	
	
	public Componentes() {
		listaDias = new ArrayList<>();
		listaDias.add("Lunes");
		listaDias.add("Martes");
		listaDias.add("Miercoles");
		listaDias.add("Jueves");
		listaDias.add("Viernes");
		listaDias.add("Sabado");
		listaDias.add("Domingo");
		

	}
	
	public List<String> getListaDias() {
		return listaDias;
	}

	public void setListaDias(List<String> listaDias) {
		this.listaDias = listaDias;
	}

	

	public String diaSeleccionado() {
		String seleccion = "";

		switch (dia) {
		case "Dia1":
			seleccion = "Lunes";
			break;
		case "Dia2":
			seleccion = "Martes";
			break;
		case "Dia3":
			seleccion = "Miercoles";
			break;
		case "Dia4":
			seleccion = "Jueves";
			break;
		case "Dia5":
			seleccion = "Viernes";
			break;
		case "Dia6":
			seleccion = "Sabado";
			break;

		case "Dia7":
			seleccion = "Domingo";
			break;

		}

		return seleccion;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
