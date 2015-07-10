/**
 * 
 */
package ji.restaurant.menu.dao.implementations;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ji.restaurant.menu.dao.IRestaurantTableDAO;
import ji.restaurant.menu.data.base.impl.BaseDao;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>08/06/2015</b>
 * <b>contiene las funciones de persistencia de la entidad <code>RestaurantTable</code></b>
 * @author Ivan
 * @version 1.0
 */

@Repository
@Transactional
public class RestaurantTableDAO extends BaseDao implements IRestaurantTableDAO {

	
}
