/**
 * 
 */
package ji.restaurant.menu.view;

import java.io.Serializable;
import java.util.Set;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>15/06/2015</b>
 * <b>Vista de la enitdad <code>OrderDetail</code></b>
 * @author Ivan
 * @version 1.0
 */
public class OrderDetailView implements Serializable {

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 2769988750486383617L;



	/**
	 * identificador de la entidad
	 */
	private int id;
	


    /**
     * Vista de la Tabla intermedia entre las entidades <code>OrderDetail</code> y 
     * <code>Dish</code> teniendo la primera como tabla padre
     */
	private Set<DishView> dishes;
	
  
	/**
	 * Indica la cantidad solicitada en un detalle especifico
	 */
	private int quantity;
	
   
	/**
	 * Precio del detalle en especifico
	 */
	private double detailPrice;
	

	/**
	 * Defien a que orden va asociado
	 */
	private OrderView order;
	
    /**
     *Vista de la Tabla intermedia entre las entidades <code>OrderDetail</code> y 
     * <code>Drink</code> teniendo la primera como tabla padre
     */
	private Set<DrinkView> drinks;
	
    /**
     * Define si la orden esta relacionada a la pormoción
     */
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
	 * Devuelve el valor de: dishes
	 * @return  dishes
	 */
	public Set<DishView> getDishes() {
		return this.dishes;
	}

	/**
	 *Establece el valor de dishes 
	 * con @param dishesP 
	 */
	public void setDishes(Set<DishView> dishesP) {
		this.dishes = dishesP;
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
	public OrderView getOrder() {
		return this.order;
	}

	/**
	 *Establece el valor de order 
	 * con @param order 
	 */
	public void setOrder(OrderView orderP) {
		this.order = orderP;
	}

	/**
	 * Devuelve el valor de: drinks
	 * @return  drinks
	 */
	public Set<DrinkView> getDrinks() {
		return this.drinks;
	}

	/**
	 *Establece el valor de drinks 
	 * con @param drinks 
	 */
	public void setDrinks(Set<DrinkView> drinksP) {
		this.drinks = drinksP;
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
	 * con @param promoCode 
	 */
	public void setPromoCode(String promoCodeP) {
		this.promoCode = promoCodeP;
	}
}
