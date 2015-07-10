/**
 * 
 */
package ji.restaurant.menu.view;
import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>10/06/2015</b>
 * <b>Representa la vista de la entidad <code>Cashier</code></b>
 * @author Ivan
 * @version 1.0
 */
public class CashierView implements Serializable {


	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 3720190283380470507L;

	/**
	 * identificador de la entidad
	 */
	private int id;

	/**
	 * Define el nombre del cajero
	 */
	@NotEmpty(message="El nombre del cajero es requerido")
	private String name;

	/**
	 * Define la identificaci{on del cajero
	 */

	@NotEmpty(message="La cedula del cajero es requerida")
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
