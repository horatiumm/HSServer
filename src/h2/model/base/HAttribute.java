package h2.model.base;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

/**
 * HAttribute entity. @author MyEclipse Persistence Tools
 */
@Entity

public class HAttribute  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
    // Fields    
    @Id 
    @GeneratedValue	
     private Integer id;
     private String dataSource;
     private String dataType;
     private String name;
     private String description;
     private String value;
     @ManyToOne(fetch=FetchType.EAGER)
	private HObject hobject;

    // Constructors

    /** default constructor */
    public HAttribute() {
    }

	/** minimal constructor */
    public HAttribute(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public HAttribute(Integer id, String dataSource, String dataType, String name, String value,HObject hobject) {
        this.id = id;
        this.dataSource = dataSource;
        this.dataType = dataType;
        this.name = name;
        this.value = value;
        this.hobject = hobject;    
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDataSource() {
        return this.dataSource;
    }
    
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
    
    public String getDataType() {
        return this.dataType;
    }
    
    public void setDataType(String dataType) {
        this.dataType = dataType;
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

	public HObject getHobject() {
		return hobject;
	}

	public void setHobject(HObject hobject) {
		this.hobject = hobject;
	}
	
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}