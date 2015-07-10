/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>13/06/2015</b>
 * <b>Vista de la entidad <code>RestaurantTable</code></b>
 * @author Ivan
 * @version 1.0
 */
public class RestaurantTableView implements Serializable {
    /**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -7382764643928127455L;

	/**
	 * identificador de la entidad
	 */
	private int idTable;
	
	/**
	 * numero de la mesa
	 */

	@NotEmpty(message="Es necesario definir el numero de la mesa")
	private int tableNumber;

	private RestaurantView restaurant;

	/**
	 * Devuelve el valor de: idTable
	 * @return  idTable
	 */
	public int getIdTable() {
		return this.idTable;
	}

	/**
	 *Establece el valor de idTable 
	 * con @param idTable 
	 */
	public void setIdTable(int idTableP) {
		this.idTable = idTableP;
	}

	/**
	 * Devuelve el valor de: tableNumber
	 * @return  tableNumber
	 */
	public int getTableNumber() {
		return this.tableNumber;
	}

	/**
	 *Establece el valor de tableNumber 
	 * con @param tableNumber 
	 */
	public void setTableNumber(int tableNumberP) {
		this.tableNumber = tableNumberP;
	}

	/**
	 * Devuelve el valor de: restaurant
	 * @return  restaurant
	 */
	public RestaurantView getRestaurant() {
		return this.restaurant;
	}

	/**
	 *Establece el valor de restaurant 
	 * con @param restaurant 
	 */
	public void setRestaurant(RestaurantView restaurantP) {
		this.restaurant = restaurantP;
	} 
}
