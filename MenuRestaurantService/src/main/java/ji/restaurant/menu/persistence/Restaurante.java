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
 * <b></b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="Restaurante")
public class Restaurante implements Serializable {


	/**
	 * serial id generado por el IDE
	 */
	private static final long serialVersionUID = -8932274111977087576L;

	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idRestaurante;
    
	/**
	 * etiqueta del restaurante
	 */
	@Column(name="nombreRestaurante",nullable= false)
	@NotEmpty(message="El nombre es requerido")
	private String nombreRestaurante;
	
	/**
	 * Identificador del resaurante
	 */
	@Column(name="cedulaJuridica",nullable= false)
	@NotEmpty(message="la cedula es requerida")
	private String cedulaJuridica;
	
	/**
	 * Telefono de contacto
	 */
	@Column(name="telefono",nullable= false)
	@NotEmpty(message="el telefono es requerido")
	private String telefono;
	
	/**
	 *Devuleve 
	 * @return the idRestaurante
	 */
	public int getIdRestaurante() {
		return idRestaurante;
	}

	/**
	 * Establece idRestaurante con  idRestaurante
	   @param idRestauranteP 
	 */
	public void setIdRestaurante(int idRestauranteP) {
		this.idRestaurante = idRestauranteP;
	}

}
