package h2.model.product;

import java.util.Date;

import h2.model.base.HObject;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@Entity
public class HProductFeature implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
    // Fields    
    @Id 
    @GeneratedValue	
     private Integer id;

     private String name;
     private String description;
     private String value;
     private String valueUOM;
     private Date fromDate;
     private Date thruDate;
     private Boolean requiredFeature;
     private Boolean standardFeature;
     private Boolean optionalFeature;
     private Boolean selectableFeature;
     
     @ManyToOne(fetch=FetchType.EAGER)
	private HProduct hproduct;

    // Constructors

    /** default constructor */
    public HProductFeature() {
    }

	/** minimal constructor */
    public HProductFeature(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public HProductFeature(Integer id, String name, String description, String value,HProduct hproduct) {
        this.id = id;        
        this.name = name;
        this.description = description;
        this.value = value;
        this.hproduct = hproduct;    
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
       
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
	
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HProduct getHproduct() {
		return hproduct;
	}

	public void setHproduct(HProduct hproduct) {
		this.hproduct = hproduct;
	}

	public String getValueUOM() {
		return valueUOM;
	}

	public void setValueUOM(String valueUOM) {
		this.valueUOM = valueUOM;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getThruDate() {
		return thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

	public Boolean getRequiredFeature() {
		return requiredFeature;
	}

	public void setRequiredFeature(Boolean requiredFeature) {
		this.requiredFeature = requiredFeature;
	}

	public Boolean getStandardFeature() {
		return standardFeature;
	}

	public void setStandardFeature(Boolean standardFeature) {
		this.standardFeature = standardFeature;
	}

	public Boolean getOptionalFeature() {
		return optionalFeature;
	}

	public void setOptionalFeature(Boolean optionalFeature) {
		this.optionalFeature = optionalFeature;
	}

	public Boolean getSelectableFeature() {
		return selectableFeature;
	}

	public void setSelectableFeature(Boolean selectableFeature) {
		this.selectableFeature = selectableFeature;
	}
}
