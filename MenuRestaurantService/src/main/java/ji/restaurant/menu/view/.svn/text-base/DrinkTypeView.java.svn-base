/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>11/06/2015</b>
 * <b>Vista de la entidad <code>DrinkType</code></b>
 * @author Ivan
 * @version 1.0
 */
public class DrinkTypeView implements Serializable {

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 8592518140623577967L;


	/**
	 * Identificador de la entidad
	 */
	private int idDrinkType;
	
	
	/**
	 * Etiqueta tipo de bebida a seleccionar
	 */
	
	@NotEmpty(message="El  tipo de bebida es requerido")
	private String beverageType;
	
	
	/**
	 * Código único del tipo de bebida(en caso de que la etiq	ueta se deba cambiar)
	 */

	@NotEmpty(message="El  codigo de tipo de bebida  es requerido")
	private String beverageTypeCode;


	/**
	 *Devuleve 
	 * @return the idTipoBebida
	 */
	public int getIdDrinkType() {
		return this.idDrinkType;
	}


	/**
	 * Establece idTipoBebida 
	   @param idDrinkTypeP valor a establecer
	 */
	public void setIdDrinkType(int idDrinkTypeP) {
		this.idDrinkType = idDrinkTypeP;
	}


	/**
	 *Devuleve 
	 * @return the beverageType
	 */
	public String getBeverageType() {
		return this.beverageType;
	}


	/**
	 * Establece tipoDeBebida con  tipoDeBebida
	   @param beverageTypeP 
	 */
	public void setBeverageType(String beverageTypeP) {
		this.beverageType = beverageTypeP;
	}


	/**
	 *Devuleve 
	 * @return the beverageTypeCode
	 */
	public String getBeverageTypeCode() {
		return this.beverageTypeCode;
	}


	/**
	 * Establece codigoTipoBebida con  beverageTypeCodeP
	   @param beverageTypeCodeP 
	 */
	public void setBeverageTypeCode(String beverageTypeCodeP) {
		this.beverageTypeCode = beverageTypeCodeP;
	}
}
