package h2.model.product;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import h2.model.base.HObject;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class HItem extends HObject{
	private static final long serialVersionUID = 1L;	
	private String itemNumber;
	private String legacyItemNumber;	
	private String majorRevision;
	private String minorRevision;
	private Integer itemVersion;
	
	private String state;
	private Boolean frozen;
	private String primaryCategory;
	private String secondaryCategory;
	private String tertiaryCategory;
		
	private Float totalCost;
	private String currency;
	
	public HItem() {
	}

	
	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}


	public String getLegacyItemNumber() {
		return legacyItemNumber;
	}


	public void setLegacyItemNumber(String legacyItemNumber) {
		this.legacyItemNumber = legacyItemNumber;
	}


	public String getMajorRevision() {
		return majorRevision;
	}


	public void setMajorRevision(String majorRevision) {
		this.majorRevision = majorRevision;
	}


	public String getMinorRevision() {
		return minorRevision;
	}


	public void setMinorRevision(String minorRevision) {
		this.minorRevision = minorRevision;
	}


	public Integer getItemVersion() {
		return itemVersion;
	}


	public void setItemVersion(Integer itemVersion) {
		this.itemVersion = itemVersion;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Boolean getFrozen() {
		return frozen;
	}


	public void setFrozen(Boolean frozen) {
		this.frozen = frozen;
	}


	public String getPrimaryCategory() {
		return primaryCategory;
	}


	public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}


	public String getSecondaryCategory() {
		return secondaryCategory;
	}


	public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}


	public String getTertiaryCategory() {
		return tertiaryCategory;
	}


	public void setTertiaryCategory(String tertiaryCategory) {
		this.tertiaryCategory = tertiaryCategory;
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
	
	

}
