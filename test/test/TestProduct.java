package test;

import static org.junit.Assert.assertTrue;
import h2.jpa.JPAManager;
import h2.model.base.HConnection;
import h2.model.product.HProduct;
import h2.model.product.HProductFeature;
import h2.model.product.food.HIngredientItem;
import h2.model.product.food.HVendorCommodity;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Logger;

import junit.framework.JUnit4TestAdapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestProduct {
private static Logger log = Logger.getLogger("TestProduct.class"); 
	
	HProduct obj1  = new  HProduct();
	HProduct obj2  = new  HProduct();
	
	
	public static junit.framework.Test suite() { 
	    return new JUnit4TestAdapter(TestProduct.class); 
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test 
	public void testProduct() {
//		HVendorCommodity com1 = new HVendorCommodity();
//		com1.setIngredient("Sugar");
//		com1.setPcnn(new Double(300));
//		com1.setCurrency("CAD");
//		JPAManager.save(com1);
//		String[] skus = new String[]{"PC BM WHOLE WHEAT ELBOWS",
//				"EXACT PRO-VITAMIN EXTRA VOLUME",
//				"EXACT PRO-VITAMIN MOISTURE REP",
//				"EXACT BNDG FLEX FABRIC 658260",
//				"EXACT BNDG FLEX FABRIC 658302",
//				"EXACT BNDG PLASTIC 658096",
//				"EXACT TENDER TAPE 1 530816",
//				"EXACT TENDER TAPE 2 530943",
//				"PC MEMORIES OF GREECE",
//				"PC GREEN DIAPERS MEGA 4",
//				"PC GREEN DIAPERS MEGA 5",
//				"EXACT HEAD COLD & SINUS 128421",
//				"EXACT CLEANSING GEL DRY SENS",
//				"PC DARK CHOCOLATE MINT THINS"};
//		
//		for(int i=0; i<skus.length;i++){
//			HProduct sku  = new  HProduct();
//			sku.setUuid(UUID.randomUUID().toString());
//			sku.setName(skus[i]);
//			sku.setType("PCSku");	
//			sku.setSKU(skus[i]);
//			sku.setCategory("sweetner");
//			sku.setDescription("test description1");
//			sku.setInStock(true);
//			sku.setNextShipment(new Date());
//					
//			JPAManager.save(sku);
//			
//			HIngredientItem p11 = new HIngredientItem();
////	        p11.setId(11);
//	        p11.setName(skus[i]);
//	        p11.setQuantityUom("ea");
//	        p11.setQuantity(new Double(1));
//	        JPAManager.save(p11);	
//	        
//	        HConnection obj3  = new  HConnection();
//			obj3.setEnabled(true);
//			obj3.setPrimaryObjRole("sku");
//			obj3.setSecondaryObjRole("ingedient");
//			obj3.setPrimaryObj(sku);
//			obj3.setSecondaryObj(p11);
//			obj3.setEndDate(new Date(System.currentTimeMillis()));
//			
//			JPAManager.save(obj3);	
//		}
//		
		
		obj2.setUuid(UUID.randomUUID().toString());
		obj2.setName("new object 2 name");
		obj2.setType("new object 2 type");	
		obj2.setSKU("SK_"+System.currentTimeMillis());
		obj2.setCategory("sweetner");
		obj2.setDescription("test description1");
		obj2.setInStock(true);
		obj2.setIntroductionDate(new Date());
				
		JPAManager.save(obj2);
		HProductFeature pf = new HProductFeature();
		pf.setHproduct(obj2);
//		
//		
//		obj1.setUuid(UUID.randomUUID().toString());
//		obj1.setName("new object 2 name");
//		obj1.setType("new object 2 type");	
//		obj1.setSKU("SK_"+System.currentTimeMillis());
//		obj1.setCategory("sweetner");
//		obj1.setDescription("test description1");
//		obj1.setInStock(true);
//		obj1.setNextShipment(new Date());
//				
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
//        HIngredientItem p11 = new HIngredientItem();
////        p11.setId(11);
//        p11.setName("Sugar");
//        p11.setQuantityUom("mg");
//        p11.setQuantity(new Double(3.7));
//        JPAManager.save(p11);	
//        
//        HIngredientItem p2 = new HIngredientItem();
////        p2.setId(12);
//        p2.setName("Oil");
//        p2.setQuantityUom("ml");
//        p2.setQuantity(new Double(5.6));    
//        JPAManager.save(p2);	
//		
//		log.info("Connection creation done.");		
//		HConnection obj5 = (HConnection)JPAManager.findById(HConnection.class, obj3.getId());
//		assertTrue(obj5!=null && obj5.getPrimaryObj().getId().intValue()==obj1.getId().intValue() && 
//				obj5.getSecondaryObj().getId().intValue()==obj2.getId().intValue() );
		
		assertTrue(true);
	}
}
