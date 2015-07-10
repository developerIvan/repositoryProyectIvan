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
 * <b>Fecha:</b> 03-01-2015</b>
 * <b>Define el tipo de plato que el cliente va a pedir</b>
 * @author JIM
 * @version 1.0
 */
@Entity
@Table(name="TipoDePlato")
public class DishType implements Serializable {

	/**
	 * Serial generado por el ide
	 */
	private static final long serialVersionUID = 3255083862463879150L;

	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idTipo")
	private int idType;

	/**
	 * Etiqueta del tipo de palto a selecionar
	 */
	@Column(name="tipoDePlato",nullable = false) 
	private String typeOfDish;

	/**
	 * codígo único del tipo de palto a selecionar(esto en caso de que sea necesario modificar la etiqueta)
	 */
	@Column(name="codigoTipoDePlato",nullable = false) 
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
