package h2.model.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;
import javax.persistence.InheritanceType;
import javax.persistence.Inheritance;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)

@NamedQueries({
@NamedQuery(name="HObject.findAll",
            query="SELECT e FROM HObject e"),
@NamedQuery(name="HObject.findByPrimaryKey",
            query="SELECT e FROM HObject e WHERE e.id = :id"),
@NamedQuery(name="HObject.findByName",
            query="SELECT e FROM HObject e WHERE e.name = :name")
})
public class HObject implements Serializable,ICreationDateLog{

	
	/**
	 * @clientCardinality 1
	 * @directed true
	 * @supplierCardinality 0..*
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String uuid;
	private String type;
	private String name;
	private String description;	
	private Boolean discarded = new Boolean(false);
	private String objClassName;
	private Date creationDate;

	@OneToMany(targetEntity=h2.model.base.HAttribute.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hobject")
	@OrderBy
	private Collection attributes;
	
	public HObject() {		
		objClassName = this.getClass().getSimpleName();
	}
	
	/** minimal constructor */
    public HObject(Integer id) {
        this.id = id;
    }	
    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection getAttributes() {
		return attributes;
	}

	public void setAttributes(Collection attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(HAttribute attribute) {
		if(attributes== null)
			attributes = new Vector();
		this.attributes.add(attribute);
	}	
	
	public Boolean isDiscarded() {
		return discarded;
	}

	public void setDiscarded(Boolean discarded) {
		this.discarded = discarded;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
    public String getObjClassName() {
		return objClassName;
	}

	public void setObjClassName(String objClassName) {
		this.objClassName = objClassName;
	}

	public Boolean getDiscarded() {
		return discarded;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof HObject)) {
            return false;
        }
        HObject other = (HObject) obj;
        return getUuid().equals(other.getUuid());
    }


 }
