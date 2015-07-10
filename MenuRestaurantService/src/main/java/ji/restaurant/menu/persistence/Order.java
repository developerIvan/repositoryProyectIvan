package ji.restaurant.menu.persistence;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Orden")
public class Order implements Serializable{
   
	/**
	 * Serial generado 
	 */
	private static final long serialVersionUID = -206451338798679719L;

	/**
	 * Identificador
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="idOrden")
	private int idOrder;
   
	/**
	 * colamda Identificador
	 */
    @Column(name="fechaOrden",nullable = false) 
	@NotEmpty(message="Es necesaria la fecha de la orden")
	private Calendar orderDate;
	
    /**
	 * Columna que registra el impuesto de venta
	 */
    @Column(name="impuesto",nullable = false) 
  	@NotEmpty(message="Es necesario el impuesto de ventas")  
	private double taxes;
	
    /**
	 * Columnua que registra el precio sin aplicar descuentos o impuestos
	 */
    @Column(name="precioBruto") 
	private double grossPrice;
	
    /**
	 * Columnua que registra el precio con impuesto y7o con descuentos
	 */
    @Column(name="precioNeto") 
	private double netPrice;
	/**
	 * Enlace que define cual es el cliente que solicito la orden
	 */
	@JoinColumn(name="cliente",referencedColumnName="idCliente",nullable=false)
	private Customer customer;
	
	/**
	 * Enlace que define cual es el restaurante que emite la orden
	 */
	@JoinColumn(name="restaurante",referencedColumnName="idRestaurante",nullable=false)
	private Restaurant retaurant;

	/**
	 * Define la mesa en donde se da la orden(en caso de orden en el local )
	 */
	@ManyToOne
	@JoinColumn(name="mesa",referencedColumnName="idMesa",nullable=true)
	private RestaurantTable table;
	
	/**
	 * Define el tipo de orden(domicilio o local )
	 */
	@ManyToOne
	@JoinColumn(name="tipoDeOrden",referencedColumnName="idTipo")
	private OrderType orderType;
	
	/**
	 * Define el cajero que atendio al cliente
	 */
	@ManyToOne
	@JoinColumn(name="idCajero",referencedColumnName="id")
	private Cashier cashier; 
	
	/**
	 * Define si el pago fue con tarjeta o con efectivo
	 */
	@ManyToOne
	@JoinColumn(name="tipoDePago",referencedColumnName="codigoTipoDePago")
	private PaymentType paymentType;

	/**
	 * Registra el descuento que hay en caso de que la orden tuviera promoción
	 */
    @Column(name="descuento") 
	private double discount;
    
    /**
	 * Registra el dinero restanto al cliente en caso de pago en efectivo y la cantidad sea mayor al costo de la orden
	 */
    @Column(name="vuelto") 
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
	 * con @param idOrderP 
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
	 * con @param orderDateP 
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
	 * con @param taxesP 
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
	 * con @param grossPriceP 
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
	 * con @param netPriceP 
	 */
	public void setNetPrice(double netPriceP) {
		this.netPrice = netPriceP;
	}

	/**
	 * Devuelve el valor de: customer
	 * @return  customer
	 */
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 *Establece el valor de customer 
	 * con @param customer 
	 */
	public void setCustomer(Customer customerP) {
		this.customer = customerP;
	}

	/**
	 * Devuelve el valor de: retaurant
	 * @return  retaurant
	 */
	public Restaurant getRetaurant() {
		return this.retaurant;
	}

	/**
	 *Establece el valor de retaurant 
	 * con @param retaurant 
	 */
	public void setRetaurant(Restaurant retaurantP) {
		this.retaurant = retaurantP;
	}

	/**
	 * Devuelve el valor de: table
	 * @return  table
	 */
	public RestaurantTable getTable() {
		return this.table;
	}

	/**
	 *Establece el valor de table 
	 * con @param table 
	 */
	public void setTable(RestaurantTable tableP) {
		this.table = tableP;
	}

	/**
	 * Devuelve el valor de: orderType
	 * @return  orderType
	 */
	public OrderType getOrderType() {
		return this.orderType;
	}

	/**
	 *Establece el valor de orderType 
	 * con @param orderType 
	 */
	public void setOrderType(OrderType orderTypeP) {
		this.orderType = orderTypeP;
	}

	/**
	 * Devuelve el valor de: cashier
	 * @return  cashier
	 */
	public Cashier getCashier() {
		return this.cashier;
	}

	/**
	 *Establece el valor de cashier 
	 * con @param cashier 
	 */
	public void setCashier(Cashier cashierP) {
		this.cashier = cashierP;
	}

	/**
	 * Devuelve el valor de: paymentType
	 * @return  paymentType
	 */
	public PaymentType getPaymentType() {
		return this.paymentType;
	}

	/**
	 *Establece el valor de paymentType 
	 * con @param paymentType 
	 */
	public void setPaymentType(PaymentType paymentTypeP) {
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
	 * con @param discount 
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
	 * con @param moneyBack 
	 */
	public void setMoneyBack(double moneyBackP) {
		this.moneyBack = moneyBackP;
	}
    
	
}
