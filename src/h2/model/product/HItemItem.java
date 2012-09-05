package h2.model.product;

import h2.model.base.HConnection;
import h2.model.base.HObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class HItemItem extends HConnection{
	private static final long serialVersionUID = 1L;	
	public Float qty;
	public String qtyUom;
	public Integer sequenceOrder;
	public String viewType;
	public String description;
	
	@ManyToOne(fetch=FetchType.EAGER)
	public HObject viewContext;
	
	public HItemItem() {
		
	}

	public Float getQty() {
		return qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}

	public String getQtyUom() {
		return qtyUom;
	}

	public void setQtyUom(String qtyUom) {
		this.qtyUom = qtyUom;
	}

	public Integer getSequenceOrder() {
		return sequenceOrder;
	}

	public void setSequenceOrder(Integer sequenceOrder) {
		this.sequenceOrder = sequenceOrder;
	}

	public String getViewType() {
		return viewType;
	}

	public void setViewType(String viewType) {
		this.viewType = viewType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HObject getViewContext() {
		return viewContext;
	}

	public void setViewContext(HObject viewContext) {
		this.viewContext = viewContext;
	}
}
