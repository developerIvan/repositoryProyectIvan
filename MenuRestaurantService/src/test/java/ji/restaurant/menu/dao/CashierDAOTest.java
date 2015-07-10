package ji.restaurant.menu.dao;

import java.util.List;

import ji.restaurant.menu.persistence.Cashier;
import ji.restaurant.menu.services.util.ServiceUtil;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;



/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>08/06/2015</b>
 * <b>clase con pruebas unitarias para la interfaz <code>CashierDAO</code></b>
 * @author Ivan
 * @version 1.0
 */
@ContextConfiguration(locations={
"classpath:/META-INF/spring/app-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CashierDAOTest {

	@Autowired
	private ICashierDAO cashierDAO;
	
	
	@Test
	@Transactional
	public void testInsertCashier(){
		
		Cashier cashier = new Cashier();
		cashier.setCardId("435345345");
		cashier.setName("Alfonso Rojo");
		
		cashierDAO.saveEntity(cashier);
		
		cashier = new Cashier();
		cashier.setCardId("435345444");
		cashier.setName("E Inda");
		
		cashierDAO.saveEntity(cashier);
		
		List<Cashier> cashiers = cashierDAO.findAllEntity(cashier);
		
		Assert.assertFalse(ServiceUtil.isEmptyOrNull(cashiers));
		
	}
	
	
}
