package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class PaymentType implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 1008910686645265610L;

	/**
	 * Define codigo identificador del tipo de pago
	 */
	@Id
	@Column(name="codigoTipoDePago")
	private String paymentTypeCode;
	
	/**
	 * Define el tipo de pago
	 */
	@Column(name="paymentType",nullable = false )
	private String paymentType;
	
	/**
	 * Define el amount pagado
	 */
	@Column(name="amount" )
	private double amount;

	
	
	/**
	 * Devuelve el valor de: paymentTypeCode
	 * @return  paymentTypeCode
	 */
	public String getPaymentTypeCode() {
		return paymentTypeCode;
	}

	/**
	 *Establece el valor de paymentTypeCode 
	 * con @param paymentTypeCodeP 
	 */
	public void setPaymentTypeCode(String paymentTypeCodeP) {
		this.paymentTypeCode = paymentTypeCodeP;
	}

	/**
	 * Devuelve el valor de: paymentType
	 * @return  paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 *Establece el valor de paymentType 
	 * con @param paymentType 
	 */
	public void setTipoDePago(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * Devuelve el valor de: amount
	 * @return  amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 *Establece el valor de amount 
	 * con @param amount 
	 */
	public void setMonto(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
