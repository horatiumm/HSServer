package h2.model.product;

import java.util.Collection;
import java.util.Date;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Transient;

import h2.model.base.HAttribute;
import h2.model.base.HObject;
import h2.model.org.HOrgUnit;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class HProduct extends HObject{
	private static final long serialVersionUID = 1L;
	public static String TYPE_GOOD = "Good";
	public static String TYPE_SERVICE = "Service";
	
	private String itemName;	
	private String sku;
	private String upca;
	private String UPCE;
	private String ISBN;
	private String 	manufacturerId;
	
	private Date introductionDate;
	private Date salesDiscDate;
	private Date supportDiscDate;	
	
	private String category;
	private String subcategory;
	private String unit;
	private Float unitcost;
	private Boolean inStock;	
	
	@Transient
	private String providerName;
	
    @ManyToOne(fetch=FetchType.EAGER)
	private HOrgUnit provider;
    
	@OneToMany(targetEntity=h2.model.product.HProductFeature.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hproduct")
	@OrderBy
	private Collection features;
	

	public HProduct() {
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSKU() {
		return sku;
	}
	public void setSKU(String sku) {
		this.sku = sku;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Float getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(Float unitcost) {
		this.unitcost = unitcost;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

	public String getUPCA() {
		return upca;
	}
	public void setUPCA(String upca) {
		this.upca = upca;
	}
	public String getUPCE() {
		return UPCE;
	}
	public void setUPCE(String upce) {
		this.UPCE = upce;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String isbn) {
		ISBN = isbn;
	}
	public String getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	public String getVendorName() {
		if(provider!=null)
			return provider.getName();
		return "";
	}
	
	public Collection getFeatures() {
		return features;
	}

	public void setFeatures(Collection features) {
		this.features = features;
	}
	
	public void addFeature(HAttribute feature) {
		if(features== null)
			features = new Vector();
		if(!features.contains(feature))
			this.features.add(feature);
	}
	public Date getIntroductionDate() {
		return introductionDate;
	}
	public void setIntroductionDate(Date introductionDate) {
		this.introductionDate = introductionDate;
	}
	public Date getSalesDiscDate() {
		return salesDiscDate;
	}
	public void setSalesDiscDate(Date salesDiscDate) {
		this.salesDiscDate = salesDiscDate;
	}
	public Date getSupportDiscDate() {
		return supportDiscDate;
	}
	public void setSupportDiscDate(Date supportDiscDate) {
		this.supportDiscDate = supportDiscDate;
	}
	public HOrgUnit getVendor() {
		return provider;
	}
	public void setVendor(HOrgUnit vendor) {
		this.provider = vendor;
	}	
}
