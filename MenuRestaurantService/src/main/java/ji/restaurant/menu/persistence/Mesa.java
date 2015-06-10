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
 * <b>Representa la entidad que registra las mesas del resaurante</b>
 * @author Ivan
 * @version 1.0
 */
@Entity
@Table(name="Mesa")
public class Mesa implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -3081601360010512752L;

	/**
	 * identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMesa;
	
	/**
	 * numero de la mesa
	 */
	@Column(name="numeroDeMesa",nullable = false )
	@NotEmpty(message="Es necesario definir el numero de la mesa")
	private int numeroDeMesa;


	/**
	 * Devuelve el valor de: idMesa
	 * @return  idMesa
	 */
	public int getIdMesa() {
		return idMesa;
	}


	/**
	 *Establece el valor de idMesa 
	 * con @param idMesa 
	 */
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}


	/**
	 * Devuelve el valor de: numeroDeMesa
	 * @return  numeroDeMesa
	 */
	public int getNumeroDeMesa() {
		return numeroDeMesa;
	}


	/**
	 *Establece el valor de numeroDeMesa 
	 * con @param numeroDeMesa 
	 */
	public void setNumeroDeMesa(int numeroDeMesa) {
		this.numeroDeMesa = numeroDeMesa;
	}



	
}
