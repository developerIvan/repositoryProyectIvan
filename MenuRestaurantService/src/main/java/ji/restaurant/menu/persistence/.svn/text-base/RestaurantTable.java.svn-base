package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class RestaurantTable implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -3081601360010512752L;

	/**
	 * identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idMesa")
	private int idTable;
	
	/**
	 * numero de la mesa
	 */
	@Column(name="numeroDeMesa",nullable = false )
	@NotEmpty(message="Es necesario definir el numero de la mesa")
	private int tableNumber;

	@JoinColumn(name="restaurant",referencedColumnName="idRestaurante")
	@ManyToOne(cascade ={CascadeType.ALL} )
	private Restaurant restaurant; 

	/**
	 * Devuelve el valor de: idTable
	 * @return  idTable
	 */
	public int getIdTable() {
		return idTable;
	}


	/**
	 *Establece el valor de idTable 
	 * con @param idTableP 
	 */
	public void setIdTable(int idTableP) {
		this.idTable = idTableP;
	}


	/**
	 * Devuelve el valor de: tableNumber
	 * @return  tableNumber
	 */
	public int getTableNumber() {
		return tableNumber;
	}


	/**
	 *Establece el valor de numeroDeMesa 
	 * con @param numeroDeMesa 
	 */
	public void setTableNumber(int tableNumberP) {
		this.tableNumber = tableNumberP;
	}


	/**
	 * Devuelve el valor de: restaurant
	 * @return  restaurant
	 */
	public Restaurant getRestaurant() {
		return this.restaurant;
	}


	/**
	 *Establece el valor de restaurant 
	 * con @param restaurantP 
	 */
	public void setRestaurant(Restaurant restaurantP) {
		this.restaurant = restaurantP;
	}



	
}
