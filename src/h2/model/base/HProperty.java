package h2.model.base;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * @stereotype thing
 */

@Entity
public class HProperty implements Serializable{
    @Id 
    @GeneratedValue	
     private Integer id;
	private String name;
	private String description;	
	private String quantityUom;
	private Double quantity;
	private String valueUom;
	private String value;
    @ManyToOne(fetch=FetchType.EAGER)
	private HObject hobject;	
		
	public HProperty() {
	}
	/** minimal constructor */
    public HProperty(Integer id) {
        this.id = id;
    }	
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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

	public String getValueUom() {
		return valueUom;
	}

	public void setValueUom(String valueUom) {
		this.valueUom = valueUom;
	}

	public String getValue() {
		return value;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public HObject getHobject() {
		return hobject;
	}

	public void setHobject(HObject hobject) {
		this.hobject = hobject;
	}
}
