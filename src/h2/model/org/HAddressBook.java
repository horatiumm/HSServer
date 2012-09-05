package h2.model.org;

import java.util.Collection;
import java.util.Vector;

import h2.model.base.HPicklistItem;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class HAddressBook {
	@Id
	@GeneratedValue
	private Integer id;
	private String addressName;
	private String taxID;
	private String adressType;
	
	private String mailingName;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressLine4;
	
	private String city;
	private String state;
	private String country;
	private String county;
	private String postalCode;
	private String region;
	private String latitude;
	private String longitude;
	private String googleMapUrl;

	private String classificationCode1;
	private String classificationCode2;
	private String classificationCode3;
	
	private String ticker;
	private String stockXchange;
	private String duns;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private HAddressBook parentAddress;
 	@OneToMany(targetEntity=h2.model.org.HAddressBook.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parentAddress")
    @OrderBy
	private Collection<HAddressBook> relatedAddress;
	
 	@ManyToOne(fetch=FetchType.EAGER)
	private HParty party;
		
	public HAddressBook() {
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAdressType() {
		return adressType;
	}

	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HParty getParty() {
		return party;
	}

	public void setParty(HParty party) {
		this.party = party;
	}

	public String getGoogleMapUrl() {
		return googleMapUrl;
	}

	public void setGoogleMapUrl(String googleMapUrl) {
		this.googleMapUrl = googleMapUrl;
	}

	public Collection<HAddressBook> getRelatedAddress() {
		return relatedAddress;
	}

	public void setRelatedAddress(Collection<HAddressBook> relatedAddress) {
		this.relatedAddress = relatedAddress;
	}
	
	public void addRelatedAddress(HAddressBook value) {
		if(relatedAddress== null)
			relatedAddress = new Vector<HAddressBook>();
		this.relatedAddress.add(value);
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public String getMailingName() {
		return mailingName;
	}

	public void setMailingName(String mailingName) {
		this.mailingName = mailingName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getClassificationCode1() {
		return classificationCode1;
	}

	public void setClassificationCode1(String classificationCode1) {
		this.classificationCode1 = classificationCode1;
	}

	public String getClassificationCode2() {
		return classificationCode2;
	}

	public void setClassificationCode2(String classificationCode2) {
		this.classificationCode2 = classificationCode2;
	}

	public String getClassificationCode3() {
		return classificationCode3;
	}

	public void setClassificationCode3(String classificationCode3) {
		this.classificationCode3 = classificationCode3;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getStockXchange() {
		return stockXchange;
	}

	public void setStockXchange(String stockXchange) {
		this.stockXchange = stockXchange;
	}

	public String getDuns() {
		return duns;
	}

	public void setDuns(String duns) {
		this.duns = duns;
	}

	public HAddressBook getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(HAddressBook parentAddress) {
		this.parentAddress = parentAddress;
	}
}
