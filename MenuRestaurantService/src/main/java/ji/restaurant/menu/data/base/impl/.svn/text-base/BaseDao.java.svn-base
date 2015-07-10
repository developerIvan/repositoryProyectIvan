package ji.restaurant.menu.data.base.impl;

import java.util.List;

import ji.restaurant.menu.data.base.IBaseDao;



import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>04/06/2015</b>
 * <b>Implementacion de las funciones genericas para las </b>
 * <b></b>
 * @author Ivan
 * @version 1.0
 */
@Repository
public class BaseDao implements IBaseDao {

	/**
	 * Bean para implementar el session factory de hibernate
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	
	/**
	 * Devulve la session de hibernaste para realizar las operaciones
	 * CRUD
	 * @return session de hibernaste
	 */
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public <T> void saveEntity(T entity) {
		currentSession().save(entity);

	}

	public <T> void updateEntity(T entity) {
	     currentSession().update(entity);
	}

	public <T> void deleteEntity(T entity) {
		currentSession().delete(entity);
	}

	public <T> T getEntityById(long id, T entity) {
		T t = (T) currentSession().get(entity.getClass(),id);
		return t;
	}

	public <T> List<T> findAllEntity(T entity) {
		 List<T> list =	currentSession().createCriteria(entity.getClass()).list();
		return list;
	}

}
