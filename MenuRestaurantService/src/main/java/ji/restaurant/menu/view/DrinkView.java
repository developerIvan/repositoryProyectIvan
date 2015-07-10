/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>11/06/2015</b>
 * <b>Vista de la entidad <code>Drink</code></b>
 * @author Ivan
 * @version 1.0
 */
public class DrinkView implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -7031453886567723594L;

	/**
	 * Identificador único de la entidad
	 */
	private int idDrink;
	
	/**
	 * Etiqueta que define a la bebida
	 */
	@NotEmpty(message="El  nombre de la bebida es requerido")
	private String drink;
	
	/**
	 * Codigo unica que cada bebida tiene
	 */
	private int drinkCode;
	/**
	 * Enlace con el tipo de bebida que define en que categoria pertenece
	 */
	private DrinkTypeView drinkType;
	
	/**
	 *
	 *Define el url de la imagen platillo
	 */
	private String imageUrl;
	
	/**
	 * Define el precio de la bebida
	 */
	private BigDecimal drinkPrice;
	
	/**
	 * Devuelve el valor de: idDrink
	 * @return  idDrink
	 */
	public int getIdDrink() {
		return this.idDrink;
	}
	/**
	 *Establece el valor de idDrink 
	 * con @param idDrinkP 
	 */
	public void setIdDrink(int idDrinkP) {
		this.idDrink = idDrinkP;
	}
	/**
	 * Devuelve el valor de: drink
	 * @return  drink
	 */
	public String getDrink() {
		return this.drink;
	}
	/**
	 *Establece el valor de drink 
	 * con @param drinkP 
	 */
	public void setDrink(String drinkP) {
		this.drink = drinkP;
	}
	/**
	 * Devuelve el valor de: drinkCode
	 * @return  drinkCode
	 */
	public int getDrinkCode() {
		return this.drinkCode;
	}
	/**
	 *Establece el valor de drinkCode 
	 * con @param drinkCodeP 
	 */
	public void setDrinkCode(int drinkCodeP) {
		this.drinkCode = drinkCodeP;
	}
	/**
	 * Devuelve el valor de: drinkType
	 * @return  drinkType
	 */
	public DrinkTypeView getDrinkType() {
		return this.drinkType;
	}
	/**
	 *Establece el valor de drinkType 
	 * con @param drinkTypeP 
	 */
	public void setDrinkType(DrinkTypeView drinkTypeP) {
		this.drinkType = drinkTypeP;
	}
	
	/**
	 * Devuelve el valor de: imageUrl
	 * @return  imageUrl
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}

	/**
	 *Establece el valor de imageUrl 
	 * con @param imageUrlP 
	 */
	public void setImageUrl(String imageUrlP) {
		this.imageUrl = imageUrlP;
	}
	
	
	/**
	 * Devuelve el valor de: drinkPrice
	 * @return  drinkPrice
	 */
	public BigDecimal getDrinkPrice() {
		return this.drinkPrice;
	}
	/**
	 *Establece el valor de drinkPrice 
	 * con @param drinkPriceP 
	 */
	public void setDrinkPrice(BigDecimal drinkPriceP) {
		this.drinkPrice = drinkPriceP;
	}
}
