
package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



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
public class Cashier implements Serializable{

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
	private String name;
	
	/**
	 * Define la identificaci{on del cajero
	 */
	@Column(name="cedula",nullable = false )
	private String cardId;

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
	 * Devuelve el valor de: name
	 * @return  name
	 */
	public String getName() {
		return name;
	}

	/**
	 *Establece el valor de name 
	 * con @param nameP 
	 */
	public void setName(String nombreP) {
		this.name = nombreP;
	}

	/**
	 * Devuelve el valor de: cardId
	 * @return  cardId
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 *Establece el valor de cardIdP 
	 * con @param cardIdP 
	 */
	public void setCardId(String cardIdP) {
		this.cardId = cardIdP;
	}
}
