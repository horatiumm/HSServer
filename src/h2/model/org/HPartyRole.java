package h2.model.org;

import h2.model.base.HConnection;

public class HPartyRole extends HConnection{
	/**
	 * primary object Party
	 * secondary object Role
	 */
	private static final long serialVersionUID = 1L;
	public static String PARTY_ROLE_CONNECTION = "PartyRoleConnection";

	public void setParty(HParty party) {
		primaryObj = party;
	}
	
	public void setRole(HRole party) {
		secondaryObj = party;
	}
	
	public HParty getParty( ) {
		return (HParty)primaryObj ;
	}
	
	public HRole getRole( ) {
		return (HRole)secondaryObj;
	}
}
