/**
 * 
 */
package ji.restaurant.menu.services.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ji.restaurant.menu.converter.DrinkConverter;
import ji.restaurant.menu.dao.IDrinkDAO;

import ji.restaurant.menu.persistence.Drink;
import ji.restaurant.menu.services.IDrinkService;
import ji.restaurant.menu.services.util.ServiceUtil;
import ji.restaurant.menu.view.DrinkView;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>06/07/2015</b>
 * <b>Implementación del servicio de las funciones de persistencia de la  entidad <code>Drink</code> </b>
 * @author Ivan
 * @version 1.0
 */
@Service  
@Transactional
public class DrinkService implements IDrinkService {

	 /**
     * Dependecia de la base de datos
     */
    @Autowired
	private IDrinkDAO drinkDAO; 
	/* (non-Javadoc)
	 * @see ji.restaurant.menu.services.IDrinkService#getDrinks(ji.restaurant.menu.view.DrinkView)
	 */
	public List<DrinkView> getDrinks(DrinkView drinkV) {
		Drink drinkDTOQuery = DrinkConverter.convert(drinkV);
	     List<DrinkView> viewResult = null;
	     List<Drink>  drinksDTOList = null;
		
	     //consulta de las bebidas 
	     if(!ServiceUtil.isNullObject(drinkDTOQuery)){
	    	 drinksDTOList = drinkDAO.getDrinksByObject(drinkDTOQuery);
	     }
	     
	     
	     //Tranformacion de las bebidas a la vista
	     if(!ServiceUtil.isEmptyOrNull(drinksDTOList)){
	    	 viewResult = new ArrayList<DrinkView>(drinksDTOList.size());
	    	 
	    	 for (Drink drink : drinksDTOList) {
	    		 viewResult.add(DrinkConverter.convert(drink));
			}
	     }
	     
		
		return viewResult;
	}

}
