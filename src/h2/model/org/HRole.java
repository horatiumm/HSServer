package h2.model.org;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import h2.model.base.HObject;

/**
 * @stereotype role
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class HRole extends HObject{

	private Boolean active = new Boolean(true);
	
		
	public HRole() {
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
