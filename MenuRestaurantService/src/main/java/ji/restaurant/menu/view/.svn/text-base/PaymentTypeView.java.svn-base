/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>13/06/2015</b>
 * <b>Vista del tipo de pago</b>
 * @author Ivan
 * @version 1.0
 */
public class PaymentTypeView implements Serializable {

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -7483582195111476869L;

	/**
	 * Define codigo identificador del tipo de pago
	 */
	@NotEmpty(message="Es necesario definir el codigo de tipo e pago")
	private String paymentTypeCode;
	
	/**
	 * Define el tipo de pago
	 */
	@NotEmpty(message="Es necesario definir el tipo de pago")
	private String paymentType;
	
	/**
	 * Define el amount pagado
	 */
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
