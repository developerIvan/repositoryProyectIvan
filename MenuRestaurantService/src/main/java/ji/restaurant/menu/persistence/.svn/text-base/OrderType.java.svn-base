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
 * <b>Representa a la tabla TipoDeOrden en la base de datos  </b>
 * <b>Define si la orden es a domicilio o en el local</b>
 * @author Ivan
 * @version 1.0
 */
@Entity
@Table(name="TipoDeOrden")
public class OrderType implements Serializable{

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -9061459615453779935L;

	/**
	 * identificador del tipo de orden
	 */
	@Id
	@Column(name="idTipo")
	private int idOrderType;
	
	/**
	 * definicion de tipo de orden (a domicilio o en el local)
	 */
	
	@Column(name="tipoDeOrden")
	private String orderType;
	
	/**
	 * Define el cost por el tipo de orden(costo de trasporte o impuesto de servicio)
	 */
	@Column(name="costes")
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
