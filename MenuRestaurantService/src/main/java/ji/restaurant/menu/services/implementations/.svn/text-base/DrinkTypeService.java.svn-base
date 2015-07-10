/**
 * 
 */
package ji.restaurant.menu.services.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ji.restaurant.menu.converter.DrinkTypeConverter;
import ji.restaurant.menu.dao.IDrinkTypeDAO;
import ji.restaurant.menu.persistence.DrinkType;
import ji.restaurant.menu.services.IDrinkTypeService;
import ji.restaurant.menu.services.util.ServiceUtil;
import ji.restaurant.menu.view.DrinkTypeView;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>01/07/2015</b>
 * <b>Implementacion de las funcionalidades para la entidad<code>IDrinkType</code></b>
 * @author Ivan
 * @version 1.0
 */
@Service  
@Transactional
public class DrinkTypeService implements IDrinkTypeService {

    /**
     * Dependecia de la base de datos
     */
    @Autowired
	private IDrinkTypeDAO drinkTypeDAO; 
	
	public List<DrinkTypeView> getAllDrinksType() {
		
		List<DrinkTypeView> drinksView = null;
		List<DrinkType>drinksType = null;
		
		
		//Consulta los tipos  las bebidas
		drinksType = drinkTypeDAO.findAllEntity(new DrinkType());
		
		//Conversion de los tipos las bebidas
		if(!ServiceUtil.isEmptyOrNull(drinksType)){
			drinksView = new ArrayList<DrinkTypeView>(drinksType.size());
			for(DrinkType d:drinksType){
				drinksView.add(DrinkTypeConverter.convert(d));
			}
			
		}
		return drinksView;
	}

	public void saveDrinkType(DrinkTypeView drinkTypeView) {
		
		DrinkType drinkTypeDTO = DrinkTypeConverter.convert(drinkTypeView) ;
		
		//Persiste el registro
		if(null!=drinkTypeDTO){
			drinkTypeDAO.saveEntity(drinkTypeDTO);
		}
		
	}

}
