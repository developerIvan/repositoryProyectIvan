package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>05/01/2015</b>
 * <b>clase que representa a la entidad o tabla Cliente de la base de datos</b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="Cliente")
public class Cliente implements Serializable{

	
	/**
	 * serial id generado por el IDE
	 */
	private static final long serialVersionUID = 5651205359692369580L;


	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCliente;
	
	
	/**
	 * Etiqueta del nombre del cliente
	 */
	@Column(name="nombre",nullable = false) 
	@NotEmpty(message="El  nombre es requerido")
	private String nombre;
	
	/**
	 * Etiqueta apellidos del cliete
	 */
	@Column(name="apellidos") 
	
	private String apellidos;
	
	/**
	 * 
	 */
	@Column(name="identificacion",unique = true,nullable=false ) 
	@NotEmpty(message="la identificación es requerida")
	private String identificacion;

	/**
	 *Devuleve 
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return this.idCliente;
	}


	/**
	 * Establece idCliente con  idCliente
	   @param idCliente 
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	/**
	 *Devuleve 
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}


	/**
	 * Establece nombre con  nombre
	   @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 *Devuleve 
	 * @return the apellidos
	 */
	public String getApellidos() {
		return this.apellidos;
	}


	/**
	 * Establece apellidos con  apellidos
	   @param apellidos 
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 *Devuleve 
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return this.identificacion;
	}


	/**
	 * Establece identificacion con  identificacion
	   @param identificacion 
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
}



