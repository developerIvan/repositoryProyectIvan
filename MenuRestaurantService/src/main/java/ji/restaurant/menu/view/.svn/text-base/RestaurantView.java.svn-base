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
 * <b>vista de la entidad <code>Restaurant</code></b>
 * @author Ivan
 * @version 1.0
 */
public class RestaurantView implements Serializable {

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -4074668634808523605L;

	/**
	 * Identificador de la entidad
	 */

	private int idRestaurant;
    
	/**
	 * etiqueta del restaurante
	 */
	@NotEmpty(message="El nombre es requerido")
	private String restaurantName;
	
	/**
	 * Identificador del resaurante
	 */
	@NotEmpty(message="la cedula es requerida")
	private String legalIdentityCard;
	
	/**
	 * Telefono de contacto
	 */
	@NotEmpty(message="el telefono es requerido")
	private String phone;

	/**
	 * Devuelve el valor de: idRestaurant
	 * @return  idRestaurant
	 */
	public int getIdRestaurant() {
		return idRestaurant;
	}

	/**
	 *Establece el valor de idRestaurant 
	 * con @param idRestaurant 
	 */
	public void setIdRestaurant(int idRestaurant) {
		this.idRestaurant = idRestaurant;
	}

	/**
	 * Devuelve el valor de: restaurantName
	 * @return  restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}

	/**
	 *Establece el valor de restaurantName 
	 * con @param restaurantName 
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	/**
	 * Devuelve el valor de: legalIdentityCard
	 * @return  legalIdentityCard
	 */
	public String getLegalIdentityCard() {
		return legalIdentityCard;
	}

	/**
	 *Establece el valor de legalIdentityCard 
	 * con @param legalIdentityCard 
	 */
	public void setLegalIdentityCard(String legalIdentityCard) {
		this.legalIdentityCard = legalIdentityCard;
	}

	/**
	 * Devuelve el valor de: phone
	 * @return  phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 *Establece el valor de phone 
	 * con @param phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
