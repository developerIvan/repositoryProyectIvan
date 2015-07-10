package ji.restaurant.menu.view;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>10/06/2015</b>
 * <b>vista de la entidad <code>Customer</code></b>
 * @author Ivan
 * @version 1.0
 */
public class CustomerView implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 1402649117513797008L;


	/**
	 * Identificador de la entidad
	 */
	private int idCustomer;
	
	
	/**
	 * Etiqueta del nombre del cliente
	 */
	
	@NotEmpty(message="El  nombre es requerido")
	private String fisrtName;
	
	/**
	 * Etiqueta apellidos del cliete
	 */
	private String lastName;
	
	/**
	 * Representa la identificaci{on del cliente
	 */
	@NotEmpty(message="la identificación es requerida")
	private String idCard;

	/**
	 * Devuelve el valor de: idCustomer
	 * @return  idCustomer
	 */
	public int getIdCustomer() {
		return this.idCustomer;
	}

	/**
	 *Establece el valor de idCustomer 
	 * con @param idCustomerP 
	 */
	public void setIdCustomer(int idCustomerP) {
		this.idCustomer = idCustomerP;
	}

	/**
	 * Devuelve el valor de: fisrtName
	 * @return  fisrtName
	 */
	public String getFisrtName() {
		return this.fisrtName;
	}

	/**
	 *Establece el valor de fisrtName 
	 * con @param fisrtNameP 
	 */
	public void setFisrtName(String fisrtNameP) {
		this.fisrtName = fisrtNameP;
	}

	/**
	 * Devuelve el valor de: lastName
	 * @return  lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 *Establece el valor de lastName 
	 * con @param lastNameP 
	 */
	public void setLastName(String lastNameP) {
		this.lastName = lastNameP;
	}

	/**
	 * Devuelve el valor de: idCard
	 * @return  idCard
	 */
	public String getIdCard() {
		return this.idCard;
	}

	/**
	 *Establece el valor de idCard 
	 * con @param idCardP 
	 */
	public void setIdCard(String idCardP) {
		this.idCard = idCardP;
	}

}
