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
 * <b>Fecha:</b> 03-01-2015</b>
 * <b>Define el tipo de plato que el cliente va a pedir</b>
 * @author JIM
 * @version 1.0
 */
@Entity
@Table(name="TipoDePlato")
public class TipoDePlato implements Serializable {

	/**
	 * Serial generado por el ide
	 */
	private static final long serialVersionUID = 3255083862463879150L;

	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTipo;

	/**
	 * Etiqueta del tipo de palto a selecionar
	 */
	@Column(name="tipoDePlato",nullable = false) 
	@NotEmpty(message="El  tipo es requerido")
	private String tipoDeplato;

	/**
	 * codígo único del tipo de palto a selecionar(esto en caso de que sea necesario modificar la etiqueta)
	 */
	@Column(name="codigoTipoDePlato",nullable = false) 
	@NotEmpty(message="El codigo de tipo es requerido")
	private String codigoTipoDeplato;

	/**
	 *Devuleve 
	 * @return the tipoDeplato
	 */
	public String getTipoDeplato() {
		return tipoDeplato;
	}

	/**
	 * Establece tipoDeplato con  tipoDeplato
	   @param tipoDeplato 
	 */
	public void setTipoDeplato(String tipoDeplato) {
		this.tipoDeplato = tipoDeplato;
	}

	/**
	 *Devuleve 
	 * @return the idtipo
	 */
	public int getIdTipo() {
		return this.idTipo;
	}

	/**
	 * Establece idtipo con  idtipo
	   @param idtipo 
	 */
	public void setIdTipo(int idtipo) {
		this.idTipo = idtipo;
	}

	/**
	 *Devuleve 
	 * @return the codigoTipoDeplato
	 */
	public String getCodigoTipoDeplato() {
		return this.codigoTipoDeplato;
	}

	/**
	 * Establece codigoTipoDeplato con  codigoTipoDeplato
	   @param codigoTipoDeplato 
	 */
	public void setCodigoTipoDeplato(String codigoTipoDeplato) {
		this.codigoTipoDeplato = codigoTipoDeplato;
	}
}
