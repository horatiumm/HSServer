package h2.model.product.food;

import java.util.Collection;
import java.util.Vector;

import h2.model.base.HAttribute;
import h2.model.base.HObject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class HIngredientItem extends HObject{
	private String quantityUom;
	private Double quantity;
	private String vendorName;
	private String countryOfOrigin;
	private String qaTests;
	private String qaTestsFreq;
	private String specifications;
	private String certifications;
	private String comments;
	private String synonim;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private HIngredientItem parentItem;	
	@OneToMany(targetEntity=h2.model.product.food.HIngredientItem.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parentItem")
	@OrderBy
	private Collection childItems;
    
	public HIngredientItem() {
	}

	public String getQuantityUom() {
		return quantityUom;
	}
	public void setQuantityUom(String quantityUom) {
		this.quantityUom = quantityUom;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public HIngredientItem getParentItem() {
		return parentItem;
	}

	public void setParentItem(HIngredientItem parentItem) {
		this.parentItem = parentItem;
	}
		
	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getQaTests() {
		return qaTests;
	}

	public void setQaTests(String qaTests) {
		this.qaTests = qaTests;
	}

	public String getQaTestsFreq() {
		return qaTestsFreq;
	}

	public void setQaTestsFreq(String qaTestsFreq) {
		this.qaTestsFreq = qaTestsFreq;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public Collection getChildItems() {
		return childItems;
	}

	public void setChildItems(Collection childItems) {
		this.childItems = childItems;
	}
	
	public void addChildItem(HAttribute childItem) {
		if(childItems== null)
			childItems = new Vector();
		this.childItems.add(childItem);
	}
	
	public Integer getParentId() {
		if(this.parentItem!=null)
			return parentItem.getId();
		return null;
	}
}
