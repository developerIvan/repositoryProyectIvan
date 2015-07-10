/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>10/06/2015</b>
 * <b>Vista de la entidad <code>DishType</code></b>
 * @author Ivan
 * @version 1.0
 */
public class DishTypeView implements Serializable {

	
	/**
	 * 
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 1702677635441394090L;

	/**
	 * Identificador de la entidad
	 */
	private int idType;

	/**
	 * Etiqueta del tipo de palto a selecionar
	 */
	@NotEmpty(message="El tipo de plato es requerido")
	private String typeOfDish;

	/**
	 * codígo único del tipo de palto a selecionar(esto en caso de que sea necesario modificar la etiqueta)
	 */
	@NotEmpty(message="El codigo de tipo es requerido")
	private String dishTypeCode;

	/**
	 *Devuleve 
	 * @return the typeOfDish
	 */
	public String getTypeOfDish() {
		return typeOfDish;
	}

	/**
	 * Establece typeOfDish con  typeOfDishP
	   @param typeOfDishP 
	 */
	public void setTypeOfDish(String typeOfDishP) {
		this.typeOfDish = typeOfDishP;
	}

	/**
	 *Devuleve 
	 * @return the idType
	 */
	public int getIdType() {
		return this.idType;
	}

	/**
	 * Establece idType con  idTypeP
	   @param idTypeP 
	 */
	public void setIdType(int idTypeP) {
		this.idType = idTypeP;
	}

	/**
	 *Devuleve 
	 * @return the dishTypeCode
	 */
	public String getDishTypeCode() {
		return this.dishTypeCode;
	}

	/**
	 * Establece dishTypeCode con  dishTypeCodeP
	   @param dishTypeCodeP 
	 */
	public void setDishTypeCode(String dishTypeCodeP) {
		this.dishTypeCode = dishTypeCodeP;
	}
}
