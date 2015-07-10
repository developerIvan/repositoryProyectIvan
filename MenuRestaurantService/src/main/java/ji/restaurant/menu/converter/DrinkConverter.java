package ji.restaurant.menu.converter;

import ji.restaurant.menu.persistence.Drink;
import ji.restaurant.menu.persistence.DrinkType;
import ji.restaurant.menu.services.util.ServiceUtil;
import ji.restaurant.menu.view.DrinkTypeView;
import ji.restaurant.menu.view.DrinkView;

public class DrinkConverter {


	/**
	 * Convierte un objeto <code>Drink</code> a <code>DrinkView</code>
	 * @param drinkDTOP objeto con los valores para tranformar
	 * @return
	 */
	public static DrinkView convert(Drink drinkDTOP){
		DrinkView drinkView = null;
		DrinkTypeView drinkTypeView = null;
		//Conversion
		if(null!=drinkDTOP){
			drinkView = new DrinkView();
			drinkView.setDrink(drinkDTOP.getDrink());
			drinkView.setDrinkCode(drinkDTOP.getDrinkCode());
			drinkView.setIdDrink(drinkDTOP.getIdDrink());
			drinkView.setImageUrl(drinkDTOP.getImageUrl());
			drinkView.setDrinkPrice(drinkDTOP.getDrinkPrice());
			drinkTypeView = new DrinkTypeView();
			drinkTypeView.setIdDrinkType(drinkDTOP.getDrinkType().getIdDrinkType());	
			drinkView.setDrinkType(drinkTypeView);
		}

		return drinkView; 
	}



	/**
	 * Convierte un objeto <code>DrinkView</code> a <code>Drink</code>
	 * @param drinkViewP objeto con los valores para tranformar
	 * @return
	 */
	public static Drink convert(DrinkView drinkViewP){
		Drink drink = null;
		DrinkType drinkType = null;

		//conversion	
		if(null!=drinkViewP){
			drink = new Drink();
			drink.setDrink(drinkViewP.getDrink());
			drink.setDrinkCode(drinkViewP.getDrinkCode());
			drink.setIdDrink(drinkViewP.getIdDrink());

			//Conversión del tipo de bebida
			if(!ServiceUtil.isNullObject(drinkViewP.getDrinkType())){	
				drinkType = new DrinkType();
				drinkType.setIdDrinkType(drinkViewP.getDrinkType().getIdDrinkType());	
				drink.setDrinkType(drinkType);
			}
		}

		return drink; 
	}
}
