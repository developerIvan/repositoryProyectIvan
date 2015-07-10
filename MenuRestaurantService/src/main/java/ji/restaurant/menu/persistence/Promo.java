package ji.restaurant.menu.persistence;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>03/06/2015</b>
 * <b>representa las promociones en la base de datos</b>
 * @author Ivan
 * @version 1.0
 */
@Entity
@Table(name="Promocion")
public class Promo implements Serializable {

	/**
	 * Constructor por defecto
	 */
	public Promo() {
		
	}

	
    /**
     *
	 * Constructor con id 
     * @param id 
     */
    public Promo(PromoKey id) {
	  this.key = id;	
	}
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 624340821743940875L;

	/**
	 * Id compuesto de la entidad
	 */
	@Id
	private PromoKey key;
	
	/**
	 * Define el procentaje o rebaja al monto de un combo en particular
	 */
	@Column(name="porcentaje" )
	@NotEmpty(message="Es necesario definir el porcentaje de la promocion")
	private float percentage;
	
	/**
	 * Describe la promoción
	 */
	@Column(name="descripcion" )
	@NotEmpty(message="Es necesario definir la promocion")
	private String description;
	
	/**
	 * Define la fecha de vencimiento
	 */
	@Column(name="fechaVencimiento" )
	private Date expirationDate;
	
	/**
	 * Define si la promocion esta vigente o no
	 */
	@Column(name="promocionVencida" )
	private boolean overduePromo;

	/**
	 * Define si la promocion contiene un plato en especifico
	 */
	@JoinColumn(name="idPlato",referencedColumnName="idPlato",nullable = true )
	private Dish dish;
	
	/**
	 * Define si la promocion contiene una bebida
	 */
	@JoinColumn(name="idBebida",referencedColumnName="idBebida",nullable = true  )
	private Drink drink;
	
	/**
	 * Devuelve el valor de: key
	 * @return  key
	 */
	public PromoKey getKey() {
		return key;
	}


	/**
	 *Establece el valor de key 
	 * con @param key 
	 */
	public void setKey(PromoKey key) {
		this.key = key;
	}


	/**
	 * Devuelve el valor de: percentage
	 * @return  percentage
	 */
	public float getPercentage() {
		return percentage;
	}


	/**
	 *Establece el valor de percentage 
	 * con @param percentage 
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}


	/**
	 * Devuelve el valor de: description
	 * @return  description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 *Establece el valor de description 
	 * con @param description 
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Devuelve el valor de: expirationDate
	 * @return  expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}


	/**
	 *Establece el valor de expirationDateP 
	 * con @param expirationDateP 
	 */
	public void setExpirationDate(Date expirationDateP) {
		this.expirationDate = expirationDateP;
	}


	/**
	 * Devuelve el valor de: overduePromo
	 * @return  overduePromo
	 */
	public boolean isOverduePromo() {
		return overduePromo;
	}


	/**
	 *Establece el valor de overduePromo 
	 * con @param overduePromo 
	 */
	public void setOverduePromo(boolean overduePromo) {
		this.overduePromo = overduePromo;
	}


	/**
	 * Devuelve el valor de: dish
	 * @return  dish
	 */
	public Dish getDish() {
		return this.dish;
	}


	/**
	 *Establece el valor de dish 
	 * con @param dishP 
	 */
	public void setDish(Dish dishP) {
		this.dish = dishP;
	}


	/**
	 * Devuelve el valor de: drink
	 * @return  drink
	 */
	public Drink getDrink() {
		return this.drink;
	}


	/**
	 *Establece el valor de drink 
	 * con @param drinkP 
	 */
	public void setDrink(Drink drinkP) {
		this.drink = drinkP;
	}
}
