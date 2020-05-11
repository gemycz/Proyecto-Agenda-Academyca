package com.espe.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.espe.idao.ITareasDao;
import com.espe.model.Tareas;

import com.espe.model.JPAUtil;
import com.espe.model.HibernateUtil;

import com.espe.model.Asignatura;

public class TareasDao implements ITareasDao {

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	@Override
	public void guardar(Tareas tareas) {
		// TODO Auto-generated method stub

		entity.getTransaction().begin();
		entity.persist(tareas);
		entity.getTransaction().commit();

	}

	@Override
	public void editar(Tareas tareas) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(tareas);
		entity.getTransaction().commit();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Tareas t = new Tareas();
		t = entity.find(Tareas.class, id);

		entity.getTransaction().begin();
		entity.remove(t);
		entity.getTransaction().commit();
	}

	@Override
	public Tareas buscar(int id) {
		// TODO Auto-generated method stub
		Tareas t = new Tareas();
		t = entity.find(Tareas.class, id);

		return t;
	}

	@Override
	public List<Tareas> obtenerTareas() {
		// TODO Auto-generated method stub
		List<Tareas> listaTareas = new ArrayList<Tareas>();
		Query q = entity.createQuery("SELECT t FROM Tareas t");
		listaTareas = q.getResultList();

		return listaTareas;
	}

	@Override
	public List<Asignatura> obtenerAsignaturas() {
		List<Asignatura> listaAsignatura = new ArrayList<Asignatura>();
		Query q = entity.createQuery("SELECT a FROM Asignatura a");
		listaAsignatura = q.getResultList();
		// System.out.println(listaAsignatura);
		return listaAsignatura;
	}

	@Override
	public List<Tareas> obtenerTareasFecha() {
		List<Tareas> listaTareasFecha = new ArrayList<Tareas>();
		Query q = entity
				.createQuery("SELECT a FROM Tareas a WHERE FECHA_ENTREGA between '2020-01-27' and '2020-01-31'");
		listaTareasFecha = q.getResultList();
		// System.out.println(listaAsignatura);
		return listaTareasFecha;
	}

	@Override
	public List<Tareas> obtenerTareasFecha1() {
		List<Tareas> listaTareasFecha1 = new ArrayList<Tareas>();
		Query q = entity
				.createQuery("SELECT a FROM Tareas a WHERE FECHA_ENTREGA between '2020-02-01' and '2020-02-07'");
		listaTareasFecha1 = q.getResultList();
		// System.out.println(listaAsignatura);
		return listaTareasFecha1;
	}

	@Override
	public List<Tareas> obtenerTareasFecha2() {
		List<Tareas> listaTareasFecha2 = new ArrayList<Tareas>();
		Query q = entity
				.createQuery("SELECT a FROM Tareas a WHERE FECHA_ENTREGA between '2020-02-08' and '2020-02-15'");
		listaTareasFecha2 = q.getResultList();
		// System.out.println(listaAsignatura);
		return listaTareasFecha2;
	}

	@Override
	public List<Tareas> obtenerTareasFecha3() {
		List<Tareas> listaTareasFecha3 = new ArrayList<Tareas>();
		Query q = entity
				.createQuery("SELECT a FROM Tareas a WHERE FECHA_ENTREGA between '2020-02-16' and '2020-02-23'");
		listaTareasFecha3 = q.getResultList();
		// System.out.println(listaAsignatura);
		return listaTareasFecha3;
	}
	
	@Override
	public List<Tareas> obtenerTareasFecha4() {
		List<Tareas> listaTareasFecha = new ArrayList<Tareas>();
		Query q = entity
				.createQuery("SELECT a FROM Tareas a WHERE FECHA_ENTREGA between '2020-01-03' and '2020-01-28'");
		listaTareasFecha = q.getResultList();
		// System.out.println(listaAsignatura);
		return listaTareasFecha;
	}
}
