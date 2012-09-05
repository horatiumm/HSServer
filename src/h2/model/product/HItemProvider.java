package h2.model.product;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import h2.model.base.HConnection;
import h2.model.org.HOrgUnit;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class HItemProvider extends HConnection {
	private static final long serialVersionUID = 1L;	
	// primary is the item
	// secondary is the OrgUnit
	public String providerItemNumber;
	public String providerItemRevision;
	public String providerItemName;
	public String providerItemDescription;
	public Float totalCost;
	public String currency;
	public String drawingNumber;
	
	@ManyToOne(fetch=FetchType.EAGER)
	public HOrgUnit provider;
	
	public HItemProvider(){
		
	}

	public String getProviderItemNumber() {
		return providerItemNumber;
	}

	public void setProviderItemNumber(String providerItemNumber) {
		this.providerItemNumber = providerItemNumber;
	}

	public String getProviderItemRevision() {
		return providerItemRevision;
	}

	public void setProviderItemRevision(String providerItemRevision) {
		this.providerItemRevision = providerItemRevision;
	}

	public String getProviderItemName() {
		return providerItemName;
	}

	public void setProviderItemName(String providerItemName) {
		this.providerItemName = providerItemName;
	}

	public String getProviderItemDescription() {
		return providerItemDescription;
	}

	public void setProviderItemDescription(String providerItemDescription) {
		this.providerItemDescription = providerItemDescription;
	}

	public Float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Float totalCost) {
		this.totalCost = totalCost;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDrawingNumber() {
		return drawingNumber;
	}

	public void setDrawingNumber(String drawingNumber) {
		this.drawingNumber = drawingNumber;
	}

	public HOrgUnit getProvider() {
		return provider;
	}

	public void setProvider(HOrgUnit provider) {
		this.provider = provider;
	}
}
