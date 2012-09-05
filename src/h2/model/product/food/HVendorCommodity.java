package h2.model.product.food;

import h2.model.base.HObject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class HVendorCommodity {
    @Id 
    @GeneratedValue	
     private Integer id;
	String ingredient;
	String description;
	Double total;
	Double pcnn;
	String UoM;
	Double amount;
	String currency;
	Date date;
	String format;
	String supplier;
    @ManyToOne(fetch=FetchType.EAGER)
	private HObject hobject;
    
	public HVendorCommodity() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HObject getHobject() {
		return hobject;
	}

	public void setHobject(HObject hobject) {
		this.hobject = hobject;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getPcnn() {
		return pcnn;
	}

	public void setPcnn(Double pcnn) {
		this.pcnn = pcnn;
	}

	public String getUoM() {
		return UoM;
	}

	public void setUoM(String uoM) {
		UoM = uoM;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
}
