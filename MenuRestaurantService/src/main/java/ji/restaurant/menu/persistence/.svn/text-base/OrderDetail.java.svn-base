package ji.restaurant.menu.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>15/01/2015</b>
 * <b>Clase que representara a la entidad que alamacena el detalle de cada orden</b>
 * @author Ivan 
 * @version 1.0
 */
@Entity
@Table(name="DetalleOrden")
public class OrderDetail implements Serializable {

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 5931062574159006515L;

	/**
	 * identificador de la entidad
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	


    /**
     * Tabla intermedia entre las entidades <code>OrderDetail</code> y 
     * <code>Dish</code> teniendo la primera como tabla padre
     */
    @ManyToOne(targetEntity=Dish.class)
    @JoinTable(name ="DetalleOrdenPlato",
             //columna tabla papa
    		 joinColumns={@JoinColumn(name="idDetalleOrden")},
    		 //columna tabla hija
             inverseJoinColumns={@JoinColumn(name="idPlato")}
    		)
	private Set<Dish> dishes;
	
    /**
     * Define la cantidad solicitada
     * puede ser platillos o bebidas
     */
    @Column(name="cantidad")
	private int quantity;
	
    /**
     * Define el precio del detalle de la orden
     */
    @Column(name="precioDetalle")
	private double detailPrice;
	
    /**
     * Defien a que orden pertenece el detalle
     */
    @ManyToOne
   	@JoinColumn(name="orden",referencedColumnName="idOrden")
	private Order order;
	
    /**
     * Tabla intermedia entre las entidades <code>OrderDetail</code> y 
     * <code>Drink</code> teniendo la primera como tabla padre
     */
    @ManyToOne(targetEntity=Drink.class )
   	@JoinTable(name="DetalleOrdenBebida",
   	    //Columnas de la tabla intermedia
   		 joinColumns={@JoinColumn(name="idDetalleOrden")}, 
         inverseJoinColumns={@JoinColumn(name="idBebida")}
   	    )
	private Set<Drink> drinks;
	
    /**
     * Define si la orden esta relacionada a la pormoción
     */
    @Column(name="codigoPromocion")
	private String promoCode;

	/**
	 * Devuelve el valor de: id
	 * @return  id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 *Establece el valor de id 
	 * con @param idP 
	 */
	public void setId(int idP) {
		this.id = idP;
	}


	/**
	 * Devuelve el valor de: quantity
	 * @return  quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**
	 *Establece el valor de quantity 
	 * con @param quantityP 
	 */
	public void setQuantity(int quantityP) {
		this.quantity = quantityP;
	}

	/**
	 * Devuelve el valor de: detailPrice
	 * @return  detailPrice
	 */
	public double getDetailPrice() {
		return this.detailPrice;
	}

	/**
	 *Establece el valor de detailPrice 
	 * con @param detailPriceP 
	 */
	public void setDetailPrice(double detailPriceP) {
		this.detailPrice = detailPriceP;
	}

	/**
	 * Devuelve el valor de: order
	 * @return  order
	 */
	public Order getOrder() {
		return this.order;
	}

	/**
	 *Establece el valor de order 
	 * con @param orderP 
	 */
	public void setOrder(Order orderP) {
		this.order = orderP;
	}




	/**
	 * Devuelve el valor de: promoCode
	 * @return  promoCode
	 */
	public String getPromoCode() {
		return this.promoCode;
	}

	/**
	 *Establece el valor de promoCode 
	 * con @param promoCodeP 
	 */
	public void setPromoCode(String promoCodeP) {
		this.promoCode = promoCodeP;
	}

	/**
	 * Devuelve el valor de: drinks
	 * @return  drinks
	 */
	public Set<Drink> getDrinks() {
		return this.drinks;
	}

	/**
	 *Establece el valor de drinks 
	 * con @param drinksP 
	 */
	public void setDrinks(Set<Drink> drinksP) {
		this.drinks = drinksP;
	}

	/**
	 * Devuelve el valor de: dishes
	 * @return  dishes
	 */
	public Set<Dish> getDishes() {
		return this.dishes;
	}

	/**
	 *Establece el valor de dishes 
	 * con @param dishesP 
	 */
	public void setDishes(Set<Dish> dishesP) {
		this.dishes = dishesP;
	}


	
}
