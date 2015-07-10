/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import java.util.Calendar;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>15/06/2015</b>
 * <b>Vista de la enitidad <code>Order</code></b>
 * @author Ivan
 * @version 1.0
 */
public class OrderView implements Serializable {

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 7552397964418999356L;

	/**
	 * Identificador
	 */
	private int idOrder;
   
	/**
	 * colamda Identificador
	 */

	@NotEmpty(message="Es necesaria la fecha de la orden")
	private Calendar orderDate;
	
    /**
	 * Columna que registra el impuesto de venta
	 */
  	@NotEmpty(message="Es necesario el impuesto de ventas")  
	private double taxes;
	
    /**
	 * Columnua que registra el precio sin aplicar descuentos o impuestos
	 */
	private double grossPrice;
	
    /**
	 * Columnua que registra el precio con impuesto y7o con descuentos
	 */
	private double netPrice;
	/**
	 * Enlace que define cual es el cliente que solicito la orden
	 */
	private CustomerView customer;
	
	/**
	 * Enlace que define cual es el restaurante que emite la orden
	 */
	private RestaurantView retaurant;

	/**
	 * Define la mesa en donde se da la orden(en caso de orden en el local )
	 */
	private RestaurantTableView table;
	
	/**
	 * Define el tipo de orden(domicilio o local )
	 */
	private OrderTypeView orderType;
	
	/**
	 * Define el cajero que atendio al cliente
	 */
	private CashierView cashier; 
	
	/**
	 * Define si el pago fue con tarjeta o con efectivo
	 */
	private PaymentTypeView paymentType;

	/**
	 * Registra el descuento que hay en caso de que la orden tuviera promoción
	 */
	private double discount;
    
    /**
	 * Registra el dinero restanto al cliente en caso de pago en efectivo y la cantidad sea mayor al costo de la orden
	 */
   	private double moneyBack;

	/**
	 * Devuelve el valor de: idOrder
	 * @return  idOrder
	 */
	public int getIdOrder() {
		return this.idOrder;
	}

	/**
	 *Establece el valor de idOrder 
	 * con @param idOrder 
	 */
	public void setIdOrder(int idOrderP) {
		this.idOrder = idOrderP;
	}

	/**
	 * Devuelve el valor de: orderDate
	 * @return  orderDate
	 */
	public Calendar getOrderDate() {
		return this.orderDate;
	}

	/**
	 *Establece el valor de orderDate 
	 * con @param orderDate 
	 */
	public void setOrderDate(Calendar orderDateP) {
		this.orderDate = orderDateP;
	}

	/**
	 * Devuelve el valor de: taxes
	 * @return  taxes
	 */
	public double getTaxes() {
		return this.taxes;
	}

	/**
	 *Establece el valor de taxes 
	 * con @param taxes 
	 */
	public void setTaxes(double taxesP) {
		this.taxes = taxesP;
	}

	/**
	 * Devuelve el valor de: grossPrice
	 * @return  grossPrice
	 */
	public double getGrossPrice() {
		return this.grossPrice;
	}

	/**
	 *Establece el valor de grossPrice 
	 * con @param grossPrice 
	 */
	public void setGrossPrice(double grossPriceP) {
		this.grossPrice = grossPriceP;
	}

	/**
	 * Devuelve el valor de: netPrice
	 * @return  netPrice
	 */
	public double getNetPrice() {
		return this.netPrice;
	}

	/**
	 *Establece el valor de netPrice 
	 * con @param netPrice 
	 */
	public void setNetPrice(double netPriceP) {
		this.netPrice = netPriceP;
	}

	/**
	 * Devuelve el valor de: customer
	 * @return  customer
	 */
	public CustomerView getCustomer() {
		return this.customer;
	}

	/**
	 *Establece el valor de customer 
	 * con @param customer 
	 */
	public void setCustomer(CustomerView customerP) {
		this.customer = customerP;
	}

	/**
	 * Devuelve el valor de: retaurant
	 * @return  retaurant
	 */
	public RestaurantView getRetaurant() {
		return this.retaurant;
	}

	/**
	 *Establece el valor de retaurant 
	 * con @param retaurant 
	 */
	public void setRetaurant(RestaurantView retaurantP) {
		this.retaurant = retaurantP;
	}

	/**
	 * Devuelve el valor de: table
	 * @return  table
	 */
	public RestaurantTableView getTable() {
		return this.table;
	}

	/**
	 *Establece el valor de table 
	 * con @param table 
	 */
	public void setTable(RestaurantTableView tableP) {
		this.table = tableP;
	}

	/**
	 * Devuelve el valor de: orderType
	 * @return  orderType
	 */
	public OrderTypeView getOrderType() {
		return this.orderType;
	}

	/**
	 *Establece el valor de orderType 
	 * con @param orderType 
	 */
	public void setOrderType(OrderTypeView orderTypeP) {
		this.orderType = orderTypeP;
	}

	/**
	 * Devuelve el valor de: cashier
	 * @return  cashier
	 */
	public CashierView getCashier() {
		return this.cashier;
	}

	/**
	 *Establece el valor de cashier 
	 * con @param cashier 
	 */
	public void setCashier(CashierView cashierP) {
		this.cashier = cashierP;
	}

	/**
	 * Devuelve el valor de: paymentType
	 * @return  paymentType
	 */
	public PaymentTypeView getPaymentType() {
		return this.paymentType;
	}

	/**
	 *Establece el valor de paymentType 
	 * con @param paymentTypeP 
	 */
	public void setPaymentType(PaymentTypeView paymentTypeP) {
		this.paymentType = paymentTypeP;
	}

	/**
	 * Devuelve el valor de: discount
	 * @return  discount
	 */
	public double getDiscount() {
		return this.discount;
	}

	/**
	 *Establece el valor de discount 
	 * con @param discountP 
	 */
	public void setDiscount(double discountP) {
		this.discount = discountP;
	}

	/**
	 * Devuelve el valor de: moneyBack
	 * @return  moneyBack
	 */
	public double getMoneyBack() {
		return this.moneyBack;
	}

	/**
	 *Establece el valor de moneyBack 
	 * con @param moneyBackP 
	 */
	public void setMoneyBack(double moneyBackP) {
		this.moneyBack = moneyBackP;
	}
}
