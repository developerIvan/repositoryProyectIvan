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
 * <b>Vista de la entidad <code>OrderType</code></b>
 * @author Ivan
 * @version 1.0
 */
public class OrderTypeView implements Serializable {

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -8388526468169221228L;

	/**
	 * identificador del tipo de orden
	 */
	
	private int idOrderType;
	
	/**
	 * definicion de tipo de orden (a domicilio o en el local)
	 */
	@NotEmpty(message="Es necesario definir el tipo de orden")
	private String orderType;
	
	/**
	 * Define el cost por el tipo de orden(costo de trasporte o impuesto de servicio)
	 */
	private double cost;

	/**
	 * Devuelve el valor de: idOrderType
	 * @return  idOrderType
	 */
	public int getIdOrderType() {
		return idOrderType;
	}

	/**
	 *Establece el valor de idOrderType 
	 * con @param idOrderType 
	 */
	public void setIdOrderType(int idOrderType) {
		this.idOrderType = idOrderType;
	}

	/**
	 * Devuelve el valor de: orderType
	 * @return  orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 *Establece el valor de orderType 
	 * con @param orderTypeP 
	 */
	public void setOrderType(String orderTypeP) {
		this.orderType = orderTypeP;
	}

	/**
	 * Devuelve el valor de: cost
	 * @return  cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 *Establece el valor de cost 
	 * con @param cost 
	 */
	public void setCost(double costP) {
		this.cost = costP;
	}
}
