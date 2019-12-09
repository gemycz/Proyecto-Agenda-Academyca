package com.espe.dao;

import com.espe.model.Asignatura;
import com.espe.model.JPAUtil;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.espe.idao.IAsignaturaDao;;

public class AsignaturaDao implements IAsignaturaDao{

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	@Override
	public void guardar(Asignatura asignatura) {
		// TODO Auto-generated method stub
		
		entity.getTransaction().begin();
		entity.persist(asignatura);
		entity.getTransaction().commit();
		
	}

	@Override
	public void editar(Asignatura asignatura) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(asignatura);
		entity.getTransaction().commit();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Asignatura a = new Asignatura();
		a = entity.find(Asignatura.class, id);
		
		entity.getTransaction().begin();
		entity.remove(a);
		entity.getTransaction().commit();
	}
	
	@Override
	public Asignatura buscar(int id) {
		// TODO Auto-generated method stub
		Asignatura a = new Asignatura();
		a = entity.find(Asignatura.class, id);
		
		return a;
	}

	@Override
	public List<Asignatura> obtenerAsignatura() {
		// TODO Auto-generated method stub
		List<Asignatura> listaAsignatura = new ArrayList<Asignatura>();
		Query q = entity.createQuery("SELECT a FROM Asignatura a");
		listaAsignatura = q.getResultList();
		
		return listaAsignatura;
	}


	

}
