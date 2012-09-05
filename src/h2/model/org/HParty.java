package h2.model.org;

import java.util.Collection;
import java.util.Vector;

import h2.model.base.HAttribute;
import h2.model.base.HObject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.InheritanceType;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.ManyToMany;

/**
 * @stereotype party
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class HParty extends HObject{
	private static final long serialVersionUID = 1L;
	private String displayName;	
	private Boolean enabled;
	private HAddressBook primaryAddress;
	
	@OneToMany(targetEntity=h2.model.org.HAddressBook.class, mappedBy = "party", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<HAddressBook> adresses;
	
	public HParty() {
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean active) {
		this.enabled = active;
	}

	public Collection<HAddressBook> getAdresses() {
		return adresses;
	}

	public void setAdresses(Collection<HAddressBook> adresses) {
		this.adresses = adresses;
	}
	
	public void addAddresss(HAddressBook adresse) {
		if(adresses== null)
			adresses = new Vector<HAddressBook>();
		this.adresses.add(adresse);
	}

	public void setPrimaryAddress(HAddressBook primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public HAddressBook getPrimaryAddress() {
		return primaryAddress;
	}
}
