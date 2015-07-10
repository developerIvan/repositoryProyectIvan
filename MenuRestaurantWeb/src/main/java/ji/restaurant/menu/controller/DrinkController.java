package ji.restaurant.menu.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ji.restaurant.menu.services.IDrinkService;
import ji.restaurant.menu.services.IDrinkTypeService;
import ji.restaurant.menu.services.util.ServiceUtil;
import ji.restaurant.menu.util.MenuServiceUtil;
import ji.restaurant.menu.view.DrinkTypeView;
import ji.restaurant.menu.view.DrinkView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ivan
 *
 */
@Controller
public class DrinkController {

	
	/**
	 *  Vista de las bebidas
	 */
	private static final String ALL_DRINKS_VIEW = "AllDrinks";
	
	
	/**
	 * tipos de Bebida
	 */
	private static final String DRINK_TYPES_MODEL_ATT = "drinksType";
	
	
	

	/**
	 * mapa con las bebidas par ala vista
	 */
	private static final String DRINK_MAP_MODEL_ATT = "drinksMap";
	/**
	 * Bean del servicio para la vista <code>DrinkTypeView</code>
	 */
	@Autowired
	private IDrinkTypeService drinkTypeService;
	
	/**
	 * Bean del servicio para la vista <code>DrinkTypeView</code>
	 */
	@Autowired
	private IDrinkService drinkService;
	
	
	/**
	 * Devulve todas las bebidas disponibles
	 * @return
	 */
	@RequestMapping("/AllDrinks")
	public ModelAndView queryDrinks(){
		//Datos
		List<DrinkTypeView> typesOfDrink;
		
		Map<Integer,List<DrinkView>>drinksMap; 
		ModelAndView model = new ModelAndView(ALL_DRINKS_VIEW);
		
		//Consulta por el tipo de bebidas
		typesOfDrink = drinkTypeService.getAllDrinksType();
		
		//Carga del mapa para las bebidas
		if(!ServiceUtil.isEmptyOrNull(typesOfDrink)){
			drinksMap = new HashMap<Integer,List<DrinkView>>(typesOfDrink.size());
			
			for (DrinkTypeView drinkTypeView : typesOfDrink) {
				DrinkView drinkV = new DrinkView();
				drinkV.setDrinkType(drinkTypeView);
				drinksMap.put(drinkTypeView.getIdDrinkType(), drinkService.getDrinks(drinkV));
				
			}
			model.addObject(DRINK_MAP_MODEL_ATT, drinksMap);
		}
		
		
		model.addObject(DRINK_TYPES_MODEL_ATT, typesOfDrink);
		
		return model;
	}
	
	
	
}
