/**
 * 
 */
package ji.restaurant.menu.services;

import java.util.List;

import ji.restaurant.menu.services.util.ServiceUtil;
import ji.restaurant.menu.view.DrinkTypeView;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>01/07/2015</b>
 * <b>Contiene pruebas unitarias para el servicio de la entidad <code>DrinkType</code></b>
 * @author Ivan
 * @version 1.0
 */

@ContextConfiguration(locations={
"classpath:/META-INF/spring/app-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DrinkTypeServiceTest {

	@Autowired
	private IDrinkTypeService drinkTypeService;
	
	
	@Test
	public void testDrinkService(){
		//variables
		DrinkTypeView drinkType = null;
		List<DrinkTypeView> drinksType = null;
		//Funcionalidad 
		
		drinkType = new DrinkTypeView();
		drinkType.setBeverageTypeCode("1");
		drinkType.setBeverageType("Caliente");
	//	drinkTypeService.saveDrinkType(drinkType);
		
		drinkType = new DrinkTypeView();
		drinkType.setBeverageTypeCode("2");
		drinkType.setBeverageType("Fria");
		//drinkTypeService.saveDrinkType(drinkType);
		
		drinksType = drinkTypeService.getAllDrinksType();
		
		
		//Assert
		Assert.assertFalse(ServiceUtil.isEmptyOrNull(drinksType));
		
		
	}
	
	
}
