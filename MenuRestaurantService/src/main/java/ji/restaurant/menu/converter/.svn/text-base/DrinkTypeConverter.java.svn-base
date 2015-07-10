package ji.restaurant.menu.converter;

import ji.restaurant.menu.persistence.DrinkType;
import ji.restaurant.menu.view.DrinkTypeView;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>01/07/2015</b>
 * <b>Contiene las funciones de conversion para la entidad <code>DrinkType<code></b>
 * @author Ivan
 * @version 1.0
 */
public class DrinkTypeConverter {

	
	
	/**
	 * Convierte un objeto <code>DrinkType</code> a <code>DrinkTypeView</code>
	 * @param drinkTypeP
	 * @return
	 */
	public static DrinkTypeView convert(DrinkType drinkTypeP){
		DrinkTypeView drinkTView = null;
		
		if(null!=drinkTypeP){
			drinkTView = new DrinkTypeView();
			drinkTView.setBeverageTypeCode(drinkTypeP.getBeverageTypeCode());
			drinkTView.setIdDrinkType(drinkTypeP.getIdDrinkType());
			drinkTView.setBeverageType(drinkTypeP.getBeverageType());
		}
		
		return drinkTView; 
	}
	
	
	
	/**
	 * Convierte un objeto <code>DrinkTypeView</code> a <code>DrinkType</code>
	 * @param drinkTypeP
	 * @return
	 */
	public static DrinkType convert(DrinkTypeView drinkTypeP){
		DrinkType drinkTypeDTO = null;
		
		if(null!=drinkTypeP){
			drinkTypeDTO = new DrinkType();
			drinkTypeDTO.setBeverageTypeCode(drinkTypeP.getBeverageTypeCode());
			drinkTypeDTO.setIdDrinkType(drinkTypeP.getIdDrinkType());
			drinkTypeDTO.setBeverageType(drinkTypeP.getBeverageType());
		}
		
		return drinkTypeDTO; 
	}
}
