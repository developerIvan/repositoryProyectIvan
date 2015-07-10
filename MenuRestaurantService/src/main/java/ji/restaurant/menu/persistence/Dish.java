package ji.restaurant.menu.persistence;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



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
public class Dish  implements Serializable{
    
	/**
	 * Serial generado por el IDE
	 */
	private static final long serialVersionUID = 2633220423887355149L;

	/**
	 * Identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idPlato")
	private int idDish;
    
	/**
	 * Etiqueta del platillo
	 */
	@Column(name="nombrePlatillo",nullable = false )
	private String dishName;
	
	/**
	 * identificador o numero del platillo en el menu
	 */
	@Column(name="numeroPlatillo",nullable = false )
	private int dishNumber;
	
	/**
	 * Precio  del platillo
	 */
	@Column(name="precio",nullable = false )
	private double price;

	/**
	 * Enlace con el tipo de platillo que define en que categoria pertenece
	 */
	@JoinColumn(name="tipoPlato",referencedColumnName="idTipo",nullable=false)
	private DishType dishType;
	
	
	/**
	 * Relacion a la tabla intermedia entre <code>Dish</code>
	 * y <code>OrderDetail</code> siendo la primera subordinada a  <code>OrderDetail</code> 
	 */
	@ManyToMany(mappedBy="dishes",fetch = FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},targetEntity=OrderDetail.class)
	private Set<OrderDetail>ordersDetails;
	
	/**
	 * Alamcena el url de la imagen 
	 */
	@Column(name="imagenUrl" )
	private String imageUrl;
	/**
	 *Devuleve 
	 * @return the idDish
	 */
	public int getIdDish() {
		return idDish;
	}

	/**
	 * Establece idDish con  idDishP
	   @param idDishP 
	 */
	public void setIdDish(int idDishP) {
		this.idDish = idDishP;
	}

	/**
	 *Devuleve 
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}

	/**
	 * Establece dishName con  dishNameP
	   @param dishNameP 
	 */
	public void setDishName(String dishNameP) {
		this.dishName = dishNameP;
	}

	/**
	 *Devuleve 
	 * @return the dishNumber
	 */
	public int getDishNumber() {
		return dishNumber;
	}

	/**
	 * Establece dishNumber con  dishNumberP
	   @param dishNumberP 
	 */
	public void setNumeroDePlatillo(int dishNumberP) {
		this.dishNumber = dishNumberP;
	}

	/**
	 *Devuleve 
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Establece price con  priceP
	   @param priceP 
	 */
	public void setPrice(double priceP) {
		this.price = priceP;
	}

	/**
	 *Devuleve 
	 * @return the dishType
	 */
	public DishType getDishType() {
		return dishType;
	}

	/**
	 * Establece dishType con  dishType
	   @param dishTypeP 
	 */
	public void setDishType(DishType dishTypeP) {
		this.dishType = dishTypeP;
	}

	/**
	 * Devuelve el valor de: ordersDetails
	 * @return  ordersDetails
	 */
	public Set<OrderDetail> getOrdersDetails() {
		return this.ordersDetails;
	}

	/**
	 *Establece el valor de ordersDetails 
	 * con @param ordersDetailsP 
	 */
	public void setOrdersDetails(Set<OrderDetail> ordersDetailsP) {
		this.ordersDetails = ordersDetailsP;
	}

	/**
	 *Establece el valor de dishNumber 
	 * con @param dishNumberP 
	 */
	public void setDishNumber(int dishNumberP) {
		this.dishNumber = dishNumberP;
	}

	/**
	 * Devuelve el valor de: imageUrl
	 * @return  imageUrl
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}

	/**
	 *Establece el valor de imageUrl 
	 * con @param imageUrlP 
	 */
	public void setImageUrl(String imageUrlP) {
		this.imageUrl = imageUrlP;
	}
	
	
}
