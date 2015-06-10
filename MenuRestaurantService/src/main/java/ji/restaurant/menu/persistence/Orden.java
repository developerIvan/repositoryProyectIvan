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
public class Orden implements Serializable{
   
	/**
	 * Serial generado 
	 */
	private static final long serialVersionUID = -206451338798679719L;

	/**
	 * Identificador
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO )
	private int idOrden;
   
	/**
	 * colamda Identificador
	 */
    @Column(name="fechaOrden",nullable = false) 
	@NotEmpty(message="Es necesaria la fecha de la orden")
	private Calendar fechaOrden;
	
    /**
	 * Columna que registra el impuesto de venta
	 */
    @Column(name="impuesto",nullable = false) 
  	@NotEmpty(message="Es necesario el impuesto de ventas")  
	private double impuesto;
	
    /**
	 * Columnua que registra el precio sin aplicar descuentos o impuestos
	 */
    @Column(name="precioBruto") 
	private double precioBruto;
	
    /**
	 * Columnua que registra el precio con impuesto y7o con descuentos
	 */
    @Column(name="precioNeto") 
	private double precioNeto;
	/**
	 * Enlace que define cual es el cliente que solicito la orden
	 */
	@JoinColumn(name="cliente",referencedColumnName="idCliente",nullable=false)
	private Cliente cliente;
	
	/**
	 * Enlace que define cual es el restaurante que emite la orden
	 */
	@JoinColumn(name="restaurante",referencedColumnName="idRestaurante",nullable=false)
	private Restaurante restaurante;

	/**
	 * Define la mesa en donde se da la orden(en caso de orden en el local )
	 */
	@ManyToOne
	@JoinColumn(name="mesa",referencedColumnName="idMesa",nullable=true)
	private Mesa mesa;
	
	/**
	 * Define el tipo de orden(domicilio o local )
	 */
	@ManyToOne
	@JoinColumn(name="tipoDeOrden",referencedColumnName="idTipo")
	private TipoDeOrden tipoDeOrden;
	
	/**
	 * Define el cajero que atendio al cliente
	 */
	@ManyToOne
	@JoinColumn(name="idCajero",referencedColumnName="id")
	private Cajero cajero; 
	
	/**
	 * Define si el pago fue con tarjeta o con efectivo
	 */
	@ManyToOne
	@JoinColumn(name="tipoDePago",referencedColumnName="codigoTipoDePago")
	private TipoDePago tipoPago;

	/**
	 * Registra el descuento que hay en caso de que la orden tuviera promoción
	 */
    @Column(name="descuento") 
	private double descuento;
    
    /**
	 * Registra el dinero restanto al cliente en caso de pago en efectivo y la cantidad sea mayor al costo de la orden
	 */
    @Column(name="vuelto") 
   	private double vuelto;
    
	/**
	 *Devuleve 
	 * @return the idOrden
	 */
	public int getIdOrden() {
		return idOrden;
	}

	/**
	 * Establece idOrden con  idOrden
	   @param idOrden 
	 */
	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	/**
	 *Devuleve 
	 * @return the fechaOrden
	 */
	public Calendar getFechaOrden() {
		return fechaOrden;
	}

	/**
	 * Establece fechaOrden con  fechaOrden
	   @param fechaOrden 
	 */
	public void setFechaOrden(Calendar fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	/**
	 *Devuleve 
	 * @return the impuesto
	 */
	public double getImpuesto() {
		return impuesto;
	}

	/**
	 * Establece impuesto con  impuesto
	   @param impuesto 
	 */
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	/**
	 *Devuleve 
	 * @return the precioBruto
	 */
	public double getPrecioBruto() {
		return precioBruto;
	}

	/**
	 * Establece precioBruto con  precioBruto
	   @param precioBruto 
	 */
	public void setPrecioBruto(double precioBruto) {
		this.precioBruto = precioBruto;
	}

	/**
	 *Devuleve 
	 * @return the precioNeto
	 */
	public double getPrecioNeto() {
		return precioNeto;
	}

	/**
	 * Establece precioNeto con  precioNeto
	   @param precioNeto 
	 */
	public void setPrecioNeto(double precioNeto) {
		this.precioNeto = precioNeto;
	}

	/**
	 *Devuleve 
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Establece cliente con  cliente
	   @param cliente 
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 *Devuleve 
	 * @return the restaurante
	 */
	public Restaurante getRestaurante() {
		return restaurante;
	}

	/**
	 * Establece restaurante con  restaurante
	   @param restaurante 
	 */
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	/**
	 * Devuelve el valor de: mesa
	 * @return  mesa
	 */
	public Mesa getMesa() {
		return mesa;
	}

	/**
	 *Establece el valor de mesa 
	 * con @param mesa 
	 */
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	/**
	 * Devuelve el valor de: tipoDeOrden
	 * @return  tipoDeOrden
	 */
	public TipoDeOrden getTipoDeOrden() {
		return tipoDeOrden;
	}

	/**
	 *Establece el valor de tipoDeOrden 
	 * con @param tipoDeOrden 
	 */
	public void setTipoDeOrden(TipoDeOrden tipoDeOrden) {
		this.tipoDeOrden = tipoDeOrden;
	}

	/**
	 * Devuelve el valor de: cajero
	 * @return  cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 *Establece el valor de cajero 
	 * con @param cajero 
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	/**
	 * Devuelve el valor de: tipoPago
	 * @return  tipoPago
	 */
	public TipoDePago getTipoPago() {
		return tipoPago;
	}

	/**
	 *Establece el valor de tipoPago 
	 * con @param tipoPago 
	 */
	public void setTipoPago(TipoDePago tipoPago) {
		this.tipoPago = tipoPago;
	}

	/**
	 * Devuelve el valor de: descuento
	 * @return  descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 *Establece el valor de descuento 
	 * con @param descuento 
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	/**
	 * Devuelve el valor de: vuelto
	 * @return  vuelto
	 */
	public double getVuelto() {
		return vuelto;
	}

	/**
	 *Establece el valor de vuelto 
	 * con @param vuelto 
	 */
	public void setVuelto(double vuelto) {
		this.vuelto = vuelto;
	}
}
