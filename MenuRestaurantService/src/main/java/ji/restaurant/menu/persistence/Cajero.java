/**
 * 
 */
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
 * <b>Fecha:</b>03/06/2015</b>
 * <b>Registra a la persona encargada de atender al cliente</b>
 * @author Ivan
 * @version 1.0
 */
@Entity
@Table(name="Cajero")
public class Cajero implements Serializable{

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -3094244939302482740L;

	/**
	 * identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Define el nombre del cajero
	 */
	@Column(name="nombre",nullable = false )
	@NotEmpty(message="El nombre del cajero es requerido")
	private String nombre;
	
	/**
	 * Define la identificaci{on del cajero
	 */
	@Column(name="cedula",nullable = false )
	@NotEmpty(message="La cedula del cajero es requerida")
	private String cedula;

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
	 * Devuelve el valor de: nombre
	 * @return  nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *Establece el valor de nombre 
	 * con @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor de: cedula
	 * @return  cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 *Establece el valor de cedula 
	 * con @param cedula 
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
