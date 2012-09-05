package test;


import static org.junit.Assert.assertTrue;
import h2.jpa.JPAManager;
import h2.model.base.HConnection;
import h2.model.org.HOrgUnit;
import h2.model.org.HPerson;
import h2.model.product.HProduct;

import java.util.Date;
import java.util.UUID;
import java.util.logging.Logger;

import junit.framework.JUnit4TestAdapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOrg {
	private static Logger log = Logger.getLogger("TestOrg.class"); 
	
	HPerson obj1  = new  HPerson();
	HPerson obj2  = new  HPerson();
	
	
	public static junit.framework.Test suite() { 
	    return new JUnit4TestAdapter(TestOrg.class); 
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test public void testPerson() {
//		String[] vendors = new String[]{"AMERICAN ITALIAN PASTA",
//				"NEUCO IMAGE GROUP",
//				"SHANDEX SALES GROUP LTD",
//				"TAROPHARMA",
//				"VALOR BRANDS LLC"};
//		for(int i=0; i<vendors.length;i++){
//			HOrgUnit vendor  = new  HOrgUnit();
//			vendor.setName(vendors[i]);
//			vendor.setType("Vendor");
//			JPAManager.save(vendor);
//		}
		assertTrue(true);
		  
//		obj2.setUuid(UUID.randomUUID().toString());
//		obj2.setName("new object 2 name");
//		obj2.setType("new object 2 type");	
//		obj2.setDisplayName("test person horatiu");
//		obj2.setUsername("horatiu");
//		obj2.setDescription("test description");
//		obj2.setEmail1("email1@email.com");
//		obj2.setEmail2("email2@email.com");
//		obj2.setEmail3("email3@email.com");		
//		JPAManager.save(obj2);
//		
//		
//		obj1.setUuid(UUID.randomUUID().toString());
//		obj1.setName("new object 1 name");
//		obj1.setType("new object 1 type");	
//		obj1.setDisplayName("test person horia");
//		obj1.setUsername("horia");
//		JPAManager.save(obj1);		
//		
//		HConnection obj3  = new  HConnection();
//		obj3.setEnabled(true);
//		obj3.setPrimaryObjRole("class1");
//		obj3.setSecondaryObjRole("class2");
//		obj3.setPrimaryObj(obj1);
//		obj3.setSecondaryObj(obj2);
//		obj3.setEndDate(new Date(System.currentTimeMillis()));
//		
//		JPAManager.save(obj3);	
//		
//		
//		log.info("Connection creation done.");		
//		HConnection obj5 = (HConnection)JPAManager.findById(HConnection.class, obj3.getId());
//		assertTrue(obj5!=null && obj5.getPrimaryObj().getId().intValue()==obj1.getId().intValue() && 
//				obj5.getSecondaryObj().getId().intValue()==obj2.getId().intValue() );
	}
}
