package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>05/01/2015</b>
 * <b></b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="Restaurante")
public class Restaurant implements Serializable {


	/**
	 * serial id generado por el IDE
	 */
	private static final long serialVersionUID = -8932274111977087576L;

	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idRestaurante")
	private int idRestaurant;
    
	/**
	 * etiqueta del restaurante
	 */
	@Column(name="nombreRestaurante",nullable= false)
    private String restaurantName;
	
	/**
	 * Identificador del resaurante
	 */
	@Column(name="cedulaJuridica",nullable= false)
	private String legalIdentityCard;
	
	/**
	 * Telefono de contacto
	 */
	@Column(name="telefono",nullable= false)
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
