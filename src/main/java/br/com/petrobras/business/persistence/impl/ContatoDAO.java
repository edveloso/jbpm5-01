package br.com.petrobras.business.persistence.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import br.com.petrobras.business.entity.Contato;
import br.com.petrobras.business.persistence.IContatoDAO;

@Repository
public class ContatoDAO extends HibernateDaoSupport implements IContatoDAO<Contato> {

	@Autowired
	public ContatoDAO(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@Override
	public void save(Contato contato){
		getHibernateTemplate().save(contato);
	}
	
	
	@Override
	public void remove(Contato contato){
		getHibernateTemplate().delete(contato);
	}
	
	
	@Override
	public void update(Contato contato){
		getHibernateTemplate().update(contato);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> list(){
		DetachedCriteria criteria = DetachedCriteria.forClass(Contato.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}
	

	@Override
	public Contato getById(Integer id){
		return getHibernateTemplate().get(Contato.class, id);
	}
	

	
	
}
