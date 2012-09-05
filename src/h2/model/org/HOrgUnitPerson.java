package h2.model.org;

import h2.model.base.HConnection;

public class HOrgUnitPerson extends HConnection{
	/**
	 * primary obj - OrgUnit
	 * secodary obj - Person
	 */
	private static final long serialVersionUID = 1L;
	public static String ORGUNIT_PERSON_CONNECTION = "OrgUnitPersonConnection";
	
	public void setHOrgUnit(HOrgUnit orgUnit) {
		primaryObj = orgUnit;
	}
	
	public void setRole(HPerson person) {
		secondaryObj = person;
	}
	
	public HParty getHOrgUnit( ) {
		return (HParty)primaryObj ;
	}
	
	public HPerson getPerson( ) {
		return (HPerson)secondaryObj;
	}
}
