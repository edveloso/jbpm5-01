package br.com.edveloso.business.persistence;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.edveloso.business.entity.Contato;

public interface IContatoDAO<T>{

	@Transactional(propagation=Propagation.REQUIRED)
	void save(Contato contato);

	@Transactional(propagation=Propagation.REQUIRED)
	void remove(Contato contato);

	@Transactional(propagation=Propagation.REQUIRED)
	void update(Contato contato);

	List<Contato> list();

	Contato getById(Integer id);
}
