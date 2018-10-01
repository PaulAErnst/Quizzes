package quiz2;

//import static org.junit.Assert.*;

//import org.junit.Test;

import quiz2.Quiz2Question1;

class Quiz2Question1Test {

//	@Test
	public void carPaymentPerMonthTest() {
		Quiz2Question1 statStore = new Quiz2Question1();
		statStore.setVars(35000, 0, 60, 10);
//		assertTrue(statStore.carPaymentPerMonth() < 744 && statStore.carPaymentPerMonth() > 743);
		
		statStore.setVars(50000, 15000, 60, 10);
//		assertTrue(statStore.carPaymentPerMonth() < 744 && statStore.carPaymentPerMonth() > 743);
		
		statStore.setVars(30000, 15000, 15, 5);
//		assertTrue(statStore.carPaymentPerMonth() < 1034 && statStore.carPaymentPerMonth() > 1033);
	}
	
//	@Test
	public void totalIntTest() {
		Quiz2Question1 statStore = new Quiz2Question1();
		statStore.setVars(35000, 0, 60, 10);
//		assertTrue(statStore.totalInt() < 9619 && statStore.totalInt() > 9618);
		
		statStore.setVars(50000, 15000, 60, 10);
//		assertTrue(statStore.totalInt() < 9619 && statStore.totalInt() > 9618);
		
		statStore.setVars(30000, 15000, 15, 5);
//		assertTrue(statStore.totalInt() < 505 && statStore.totalInt() > 504);
	}
		
	
	
	

}
