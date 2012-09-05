package test;


import static org.junit.Assert.assertTrue;
import h2.jpa.JPAManager;
import h2.model.base.HAttribute;
import h2.model.base.HConnection;
import h2.model.base.HObject;
import h2.model.log.HHistoryRecord;
import h2.model.log.HNotes;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.logging.Logger;

import junit.framework.JUnit4TestAdapter;

import org.junit.Before;
import org.junit.Test;

public class TestBase {
	private static Logger log = Logger.getLogger("TestBase.class"); 
	private HConnection obj1  = new  HConnection();
	private HObject obj2  = new  HObject();
	private HObject obj3  = new  HObject();
	private HAttribute attr  = new HAttribute();
	private HAttribute attr2  = new HAttribute();
	
	public static junit.framework.Test suite() { 
	    return new JUnit4TestAdapter(TestBase.class); 
	}
	
	@Before
	public void setUp() throws Exception {
		obj2.setUuid(UUID.randomUUID().toString());
		obj2.setName("new object 2 name");
		obj2.setType("new object 2 type");		
		JPAManager.save(obj2);
		
		
		obj3.setUuid(UUID.randomUUID().toString());
		obj3.setName("new object 2 name");
		obj3.setType("new object 2 type");		
		JPAManager.save(obj3);
		
		
		attr.setName("test ds1");
		attr.setDataType("text");
		attr.setHobject(obj2);
				
		
		attr2.setName("test ds1");
		attr2.setDataType("text");
		attr2.setHobject(obj2);
		
		// add attibutes to the object and save object
		obj2.addAttribute(attr);
		
		HNotes notes = new HNotes();
		notes.setHobject(obj2);
		notes.setCreationDate(new Date());
		notes.setNotes("test notes to objects");

		HHistoryRecord history = new HHistoryRecord();
		history.setHobject(obj2);
		history.setCreationDate(new Date());
		history.setActionDetails("test notes to objects");
		history.setActionType("CREATE");
		JPAManager.save(obj2);
		obj2.addAttribute(attr2);
		JPAManager.update(obj2);
//		JPAManager.save(notes);
//		JPAManager.save(history);		
	}

	@Test public void testConnection() {
			
		
		obj1.setEnabled(true);
		obj1.setPrimaryObjRole("class1");
		obj1.setSecondaryObjRole("class2");
		obj1.setPrimaryObj(obj2);
		obj1.setSecondaryObj(obj3);
		obj1.setEndDate(new Date(System.currentTimeMillis()));
		
		JPAManager.save(obj1);		
		log.info("Connection creation done.");
		HConnection obj5 = (HConnection)JPAManager.findById(HConnection.class, obj1.getId());
		assertTrue(obj5!=null && obj5.getPrimaryObj().getId().intValue()==obj2.getId().intValue() && 
				obj5.getSecondaryObj().getId().intValue()==obj3.getId().intValue() );
		
	}
	
	@Test public void testAttributes() {
		
		HObject obj5 = (HObject)JPAManager.findById(HObject.class, obj2.getId());
		// now get object attributes:
		Collection myAttrs =  obj5.getAttributes();//JPAManager.findByProperty("Hattribute", "hobject", obj1);
		if(myAttrs!=null && !myAttrs.isEmpty()) {
			for (Iterator iterator = myAttrs.iterator(); iterator.hasNext();) {
				HAttribute hattribute = (HAttribute) iterator.next();
				log.info("Attribute name ="+hattribute.getName());
			}
		}
		else
			log.info("No attributes found");	
		
		
		assertTrue(myAttrs.size()==2);
	}	
}
