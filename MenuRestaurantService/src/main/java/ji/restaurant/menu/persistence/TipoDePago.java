package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>03/06/2015</b>
 * <b>Representación de la tabla que registra el tipo de pago(efectivo o tarjeta)</b>
 * @author Ivan
 * @version (1.0)
 */
@Entity
@Table(name="TipoDePago")
public class TipoDePago implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 1008910686645265610L;

	/**
	 * Define codigo identificador del tipo de pago
	 */
	@Id
	private String codigoTipoDePago;
	
	/**
	 * Define el tipo de pago
	 */
	@Column(name="tipoDePago",nullable = false )
	@NotEmpty(message="Es necesario definir el tipo de pago")
	private String tipoDePago;
	
	/**
	 * Define el monto pagado
	 */
	@Column(name="monto" )
	private double monto;

	
	
	/**
	 * Devuelve el valor de: codigotipoDepago
	 * @return  codigotipoDepago
	 */
	public String getCodigotipoDepago() {
		return codigoTipoDePago;
	}

	/**
	 *Establece el valor de codigotipoDepago 
	 * con @param codigoTipoDePago 
	 */
	public void setCodigotipoDepago(String codigoTipoDePago) {
		this.codigoTipoDePago = codigoTipoDePago;
	}

	/**
	 * Devuelve el valor de: tipoDePago
	 * @return  tipoDePago
	 */
	public String getTipoDePago() {
		return tipoDePago;
	}

	/**
	 *Establece el valor de tipoDePago 
	 * con @param tipoDePago 
	 */
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}

	/**
	 * Devuelve el valor de: monto
	 * @return  monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 *Establece el valor de monto 
	 * con @param monto 
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
	
}
