package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>15/01/2015</b>
 * <b>Clase que representara a la entidad que alamacena el detalle de cada orden</b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="DetalleOrden")
public class DetalleOrden implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 5931062574159006515L;

	/**
	 * identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Mes al que pertenece el dia feriado
	 */
	
    @ManyToOne
	@JoinColumn(name="idPlato",referencedColumnName="idPlato")
	private Plato plato;
	
    @Column(name="cantidad")
	private int cantidad;
	
    @Column(name="precioDetalle")
	private double precioDetalle;
	
    @ManyToOne
   	@JoinColumn(name="orden",referencedColumnName="idOrden")
	private Orden orden;
	
    @ManyToOne
   	@JoinColumn(name="bebida",referencedColumnName="idBebida")
	private Drink bebida;
	
    @Column(name="codigoPromocion")
	private String codigoPromocion;

	/**
	 * Devuelve el valor de: id
	 * @return  id
	 */
	public int getId() {
		return id;
	}

	/**
	 *Establece el valor de id 
	 * con @param id 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve el valor de: plato
	 * @return  plato
	 */
	public Plato getPlato() {
		return plato;
	}

	/**
	 *Establece el valor de plato 
	 * con @param plato 
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	/**
	 * Devuelve el valor de: cantidad
	 * @return  cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 *Establece el valor de cantidad 
	 * con @param cantidad 
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Devuelve el valor de: precioDetalle
	 * @return  precioDetalle
	 */
	public double getPrecioDetalle() {
		return precioDetalle;
	}

	/**
	 *Establece el valor de precioDetalle 
	 * con @param precioDetalle 
	 */
	public void setPrecioDetalle(double precioDetalle) {
		this.precioDetalle = precioDetalle;
	}

	/**
	 * Devuelve el valor de: orden
	 * @return  orden
	 */
	public Orden getOrden() {
		return orden;
	}

	/**
	 *Establece el valor de orden 
	 * con @param orden 
	 */
	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	/**
	 * Devuelve el valor de: bebida
	 * @return  bebida
	 */
	public Drink getBebida() {
		return bebida;
	}

	/**
	 *Establece el valor de bebida 
	 * con @param bebida 
	 */
	public void setBebida(Drink bebida) {
		this.bebida = bebida;
	}

	/**
	 * Devuelve el valor de: codigoPromocion
	 * @return  codigoPromocion
	 */
	public String getCodigoPromocion() {
		return codigoPromocion;
	}

	/**
	 *Establece el valor de codigoPromocion 
	 * con @param codigoPromocion 
	 */
	public void setCodigoPromocion(String codigoPromocion) {
		this.codigoPromocion = codigoPromocion;
	}
	
}
