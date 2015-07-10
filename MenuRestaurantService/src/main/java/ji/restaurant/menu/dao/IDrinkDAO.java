/**
 * 
 */
package ji.restaurant.menu.dao;



import java.util.List;

import ji.restaurant.menu.data.base.IBaseDao;
import ji.restaurant.menu.persistence.Drink;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>08/06/2015</b>
 * <b>interfaz para realizar las operaciones CRUD en la entidad <code>Drink</code></b>
 * @author Ivan
 * @version 1.0
 */
public interface IDrinkDAO extends IBaseDao {

	
	
	public List<Drink> getDrinksByObject(Drink drink);
	
}
