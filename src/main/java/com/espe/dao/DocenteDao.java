package com.espe.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.espe.idao.IDocenteDao;
import com.espe.model.Docente;
import com.espe.model.JPAUtil;

public class DocenteDao implements IDocenteDao {

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	@Override
	public void guardar(Docente docente) {
		// TODO Auto-generated method stub

		entity.getTransaction().begin();
		entity.persist(docente);
		entity.getTransaction().commit();

	}

	@Override
	public void editar(Docente docente) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(docente);
		entity.getTransaction().commit();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Docente d = new Docente();
		d = entity.find(Docente.class, id);

		entity.getTransaction().begin();
		entity.remove(d);
		entity.getTransaction().commit();
	}

	@Override
	public Docente buscar(int id) {
		// TODO Auto-generated method stub
		Docente d = new Docente();
		d = entity.find(Docente.class, id);

		return d;
	}

	@Override
	public List<Docente> obtenerDocente() {
		// TODO Auto-generated method stub
		List<Docente> listaDocente = new ArrayList<Docente>();
		Query q = entity.createQuery("SELECT d FROM Docente d");
		listaDocente = q.getResultList();

		return listaDocente;
	}

}
