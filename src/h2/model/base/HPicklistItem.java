package h2.model.base;

import java.util.Collection;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class HPicklistItem implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields    
    @Id 
    @GeneratedValue	
     private Integer id;
     private String name;
     private String description;
     private Integer sequence = new Integer(0);
     @ManyToOne(fetch=FetchType.EAGER)
	private HPicklistItem parentItem;
 	@OneToMany(targetEntity=h2.model.base.HPicklistItem.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parentItem")
	@OrderBy
	private Collection<HPicklistItem> values;
    // Constructors

    /** default constructor */
    public HPicklistItem() {
    }

	/** minimal constructor */
    public HPicklistItem(Integer id) {
        this.id = id;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public HPicklistItem getParentItem() {
		return parentItem;
	}

	public void setParentItem(HPicklistItem parentItem) {
		this.parentItem = parentItem;
	}
	
	public Collection<HPicklistItem> getValues() {
		return values;
	}

	public void setValues(Collection<HPicklistItem> values) {
		this.values = values;
	}
	
	public void addValue(HPicklistItem value) {
		if(values== null)
			values = new Vector<HPicklistItem>();
		this.values.add(value);
	}		
    
}
