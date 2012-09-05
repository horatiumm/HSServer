package h2.model.org;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.ManyToOne;

/**
 * @stereotype thing
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class HOrgUnit extends HParty {
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 1L;
	public static String TYPE_ORGANIZATION = "Organization";
	public static String TYPE_GROUP = "Group";
	public static String TYPE_DIVISION = "Division";
	public static String TYPE_DEPARTMENT = "Department";		
	public static String TYPE_CUSTOMER = "Customer";
	public static String TYPE_SUPPLIER = "Supplier";	
	public static String TYPE_OEM = "OEM";
	
	
	private String unitType;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@OrderBy
	private HOrgUnit parent;
	
	public HOrgUnit() {
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public HOrgUnit getParent() {
		return parent;
	}
	public void setParent(HOrgUnit parent) {
		this.parent = parent;
	}
	
}
