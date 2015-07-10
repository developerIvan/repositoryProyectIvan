package ji.restaurant.menu.services;

import java.util.List;

import ji.restaurant.menu.services.util.ServiceUtil;
import ji.restaurant.menu.view.DrinkTypeView;
import ji.restaurant.menu.view.DrinkView;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations={
"classpath:/META-INF/spring/app-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DrinkServiceTest {

	
	
	/**
	 * Inyeccion de dependencia
	 */
	@Autowired
	private IDrinkService drinkService;
	
	
	/**
	 * Test para validar la busqueda de registro
	 */
	@Test
	public void testQueryDrinks(){
		//Variables
		DrinkView drinkV = new DrinkView();
		DrinkTypeView drinkTypeV = new DrinkTypeView();
		List<DrinkView> drinksResult = null;
		
		//Funcionaldiad
		drinkTypeV.setIdDrinkType(1);
		drinkV.setDrinkType(drinkTypeV);
		drinksResult =drinkService.getDrinks(drinkV);
		
		//Assert
		Assert.assertFalse(ServiceUtil.isEmptyOrNull(drinksResult));
	}
}
