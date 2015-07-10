/**
 * 
 */
package ji.restaurant.menu.dao.implementations;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ji.restaurant.menu.dao.ICustomerDAO;
import ji.restaurant.menu.data.base.impl.BaseDao;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>08/06/2015</b>
 * <b>Clase que implemeta las funciones de persistencia de <code>Customer</code></b>
 * @author Ivan
 * @version 1.0
 */
@Repository
@Transactional
public class CustomerDAO extends BaseDao  implements ICustomerDAO {

	
}
