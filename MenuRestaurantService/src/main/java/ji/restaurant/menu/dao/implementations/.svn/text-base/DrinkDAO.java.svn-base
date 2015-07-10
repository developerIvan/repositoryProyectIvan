/**
 * 
 */
package ji.restaurant.menu.dao.implementations;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ji.restaurant.menu.dao.IDrinkDAO;
import ji.restaurant.menu.data.base.impl.BaseDao;
import ji.restaurant.menu.persistence.Drink;
import ji.restaurant.menu.services.util.ServiceUtil;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>08/06/2015</b>
 * <b>Contiene las funciones de persistencia de la entidad <code>Drink</code></b>
 * @author Ivan
 * @version 1.0
 */
@Repository
@Transactional
public class DrinkDAO extends BaseDao implements IDrinkDAO {

	/**
	 * Representa el id del tipo de bebida a buscar
	 */
	private static final String DRINK_TYPE_ID = "drinkType.id";
	/**
	 * Motor de busqueda
	 */
	private  Criteria criteria;

	public List<Drink> getDrinksByObject(Drink drink) {
		criteria = currentSession().createCriteria(Drink.class);
		
		//filtro por tipo de bebida
		if(!ServiceUtil.isNullObject(drink.getDrinkType())&&drink.getDrinkType().getIdDrinkType()>0){
			criteria.add(Restrictions.eq(DRINK_TYPE_ID, drink.getDrinkType().getIdDrinkType()));
		}
		
		return criteria.list();
	}
	
	
    
	
	
}
