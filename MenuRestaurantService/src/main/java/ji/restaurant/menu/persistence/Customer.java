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
public class Customer implements Serializable{

	
	/**
	 * serial id generado por el IDE
	 */
	private static final long serialVersionUID = 5651205359692369580L;


	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCliente")
	private int idCustomer;
	
	
	/**
	 * Etiqueta del nombre del cliente
	 */
	@Column(name="nombre",nullable = false) 
	@NotEmpty(message="El  nombre es requerido")
	private String fisrtName;
	
	/**
	 * Etiqueta apellidos del cliete
	 */
	@Column(name="apellidos") 
	private String lastName;
	
	/**
	 * 
	 */
	@Column(name="identificacion",unique = true,nullable=false ) 
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



