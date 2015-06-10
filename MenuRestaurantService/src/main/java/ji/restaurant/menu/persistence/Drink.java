package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>10/01/2015</b>
 * <b>representación en memoria de la tabla que define las bebidas que ofrecera el restaurante</b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="Bebida")
public class Drink implements Serializable {

	/**
	 * Serial implementado por el IDE
	 */
	private static final long serialVersionUID = -8623709093664754871L;

	/**
	 * Identificador único de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBebida;
	
	/**
	 * Etiqueta que define a la bebida
	 */
	@Column(name="bebida",nullable = false )
	@NotEmpty(message="El  nombre de la bebida es requerido")
	private String bebida;
	
	/**
	 * Codigo unica que cada bebida tiene
	 */
	@Column(name="codigoBebida",nullable = false )
	private int codigoBebida;
	/**
	 * Enlace con el tipo de bebida que define en que categoria pertenece
	 */
	@JoinColumn(name="tipoDeBebida",referencedColumnName="idTipo",nullable=false)
	private DrinkType tipoDeBebida;
	/**
	 *Devuleve 
	 * @return the idBebida
	 */
	public int getIdBebida() {
		return idBebida;
	}
	/**
	 * Establece idBebida con  idBebida
	   @param idBebida 
	 */
	public void setIdBebida(int idBebida) {
		this.idBebida = idBebida;
	}
	/**
	 *Devuleve 
	 * @return the bebida
	 */
	public String getBebida() {
		return bebida;
	}
	/**
	 * Establece bebida con  bebida
	   @param bebida 
	 */
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	/**
	 *Devuleve 
	 * @return the codigoBebida
	 */
	public int getCodigoBebida() {
		return codigoBebida;
	}
	/**
	 * Establece codigoBebida con  codigoBebida
	   @param codigoBebida 
	 */
	public void setCodigoBebida(int codigoBebida) {
		this.codigoBebida = codigoBebida;
	}
	/**
	 *Devuleve 
	 * @return the tipoDeBebida
	 */
	public DrinkType getTipoDeBebida() {
		return tipoDeBebida;
	}
	/**
	 * Establece tipoDeBebida con  tipoDeBebida
	   @param tipoDeBebida 
	 */
	public void setTipoDeBebida(DrinkType tipoDeBebida) {
		this.tipoDeBebida = tipoDeBebida;
	}
	
}
