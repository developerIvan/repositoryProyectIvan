package ji.restaurant.menu.persistence;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>10/01/2015</b>
 * <b>Respresnta  a la tabla de la base de datos que lamacen alos platos disponibles en el restaurante</b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name = "Plato")
public class Plato  implements Serializable{
    
	/**
	 * Serial generado por el IDE
	 */
	private static final long serialVersionUID = 2633220423887355149L;

	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPlato;
    
	/**
	 * Etiqueta del platillo
	 */
	@Column(name="nombrePlatillo",nullable = false )
	@NotEmpty(message="El  nombre del platillo es requerido")
	private String nombrePlatillo;
	
	/**
	 * identificador o numero del platillo en el menu
	 */
	@Column(name="numeroPlatillo",nullable = false )
	private int numeroDePlatillo;
	
	/**
	 * Precio  del platillo
	 */
	@Column(name="precio",nullable = false )
	private double precio;

	/**
	 * Enlace con el tipo de platillo que define en que categoria pertenece
	 */
	@JoinColumn(name="TipoDePlato",referencedColumnName="idTipo",nullable=false)
	private TipoDePlato tipoPlato;
	/**
	 *Devuleve 
	 * @return the idPlato
	 */
	public int getIdPlato() {
		return idPlato;
	}

	/**
	 * Establece idPlato con  idPlato
	   @param idPlato 
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	/**
	 *Devuleve 
	 * @return the nombrePlatillo
	 */
	public String getNombrePlatillo() {
		return nombrePlatillo;
	}

	/**
	 * Establece nombrePlatillo con  nombrePlatillo
	   @param nombrePlatillo 
	 */
	public void setNombrePlatillo(String nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}

	/**
	 *Devuleve 
	 * @return the numeroDePlatillo
	 */
	public int getNumeroDePlatillo() {
		return numeroDePlatillo;
	}

	/**
	 * Establece numeroDePlatillo con  numeroDePlatillo
	   @param numeroDePlatillo 
	 */
	public void setNumeroDePlatillo(int numeroDePlatillo) {
		this.numeroDePlatillo = numeroDePlatillo;
	}

	/**
	 *Devuleve 
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece precio con  precio
	   @param precio 
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 *Devuleve 
	 * @return the tipoPlato
	 */
	public TipoDePlato getTipoPlato() {
		return tipoPlato;
	}

	/**
	 * Establece tipoPlato con  tipoPlato
	   @param tipoPlato 
	 */
	public void setTipoPlato(TipoDePlato tipoPlato) {
		this.tipoPlato = tipoPlato;
	}
	
	
}
