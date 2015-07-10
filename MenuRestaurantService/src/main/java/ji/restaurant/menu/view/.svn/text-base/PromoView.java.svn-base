/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import java.sql.Date;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>12/06/2015</b>
 * <b>Vista de la entidad <code>Promo</code></b>
 * @author Ivan
 * @version 1.0
 */
public class PromoView implements Serializable {

	/**
	 * Serial 
	 */
	private static final long serialVersionUID = -8401894319024240585L;

	/**
	 * Codigo 
	 */
	private String code;
	
	@NotEmpty(message="Es necesario definir el porcentaje de la promocion")
	private float percentage;
	
	/**
	 * Describe la promoción
	 */
	@NotEmpty(message="Es necesario definir la promocion")
	private String description;
	
	/**
	 * Define la fecha de vencimiento
	 */
	private Date expirationDate;
	
	/**
	 * Define si la promocion esta vigente o no
	 */
	private boolean overduePromo;

	/**
	 * Define si la promocion contiene un plato en especifico
	 */
	private DishView dish;
	
	/**
	 * Define si la promocion contiene una bebida
	 */
	private DrinkView drink;

	/**
	 * Devuelve el valor de: code
	 * @return  code
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 *Establece el valor de code 
	 * con @param codeP 
	 */
	public void setCode(String codeP) {
		this.code = codeP;
	}

	/**
	 * Devuelve el valor de: percentage
	 * @return  percentage
	 */
	public float getPercentage() {
		return this.percentage;
	}

	/**
	 *Establece el valor de percentage 
	 * con @param percentageP 
	 */
	public void setPercentage(float percentageP) {
		this.percentage = percentageP;
	}

	/**
	 * Devuelve el valor de: description
	 * @return  description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 *Establece el valor de description 
	 * con @param descriptionP 
	 */
	public void setDescription(String descriptionP) {
		this.description = descriptionP;
	}

	/**
	 * Devuelve el valor de: expirationDate
	 * @return  expirationDate
	 */
	public Date getExpirationDate() {
		return this.expirationDate;
	}

	/**
	 *Establece el valor de expirationDate 
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
		return this.overduePromo;
	}

	/**
	 *Establece el valor de overduePromo 
	 * con @param overduePromoP 
	 */
	public void setOverduePromo(boolean overduePromoP) {
		this.overduePromo = overduePromoP;
	}

	/**
	 * Devuelve el valor de: dish
	 * @return  dish
	 */
	public DishView getDish() {
		return this.dish;
	}

	/**
	 *Establece el valor de dish 
	 * con @param dishP 
	 */
	public void setDish(DishView dishP) {
		this.dish = dishP;
	}

	/**
	 * Devuelve el valor de: drink
	 * @return  drink
	 */
	public DrinkView getDrink() {
		return this.drink;
	}

	/**
	 *Establece el valor de drink 
	 * con @param drinkP 
	 */
	public void setDrink(DrinkView drinkP) {
		this.drink = drinkP;
	}
}
