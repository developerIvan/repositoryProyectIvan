package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>03/01/2015</b>
 * <b>Representa en la memoria el tipo de bebida a seleccionar ,esto durante la persistenca</b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="TipoBebida")
public class DrinkType implements Serializable{

	
	/**
	 * serial id generado por el IDE
	 */
	private static final long serialVersionUID = -6680799331275948722L;


	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDrinkType;
	
	
	/**
	 * Etiqueta tipo de bebida a seleccionar
	 */
	@Column(name="tipoDeBebida",nullable = false) 
	@NotEmpty(message="El  tipo de bebida es requerido")
	private String beverageType;
	
	
	/**
	 * Código único del tipo de bebida(en caso de que la etiq	ueta se deba cambiar)
	 */
	@Column(name="codigoTipoBebida",nullable = false,unique = true) 
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
	public void setTipoDeBebida(String beverageTypeP) {
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
