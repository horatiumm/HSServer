package h2.model.base;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 * @stereotype moment-interval
 */

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class HConnection implements Serializable,ICreationDateLog{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	protected Integer id;
	
	@ManyToOne(optional=false)
	protected HObject primaryObj;
	protected String primaryObjRole;
	@ManyToOne(optional=false)
	protected HObject secondaryObj;
	protected String secondaryObjRole;
	@ManyToOne
	protected HObject connectionData;
	
	private Date creationDate;	
	private Date startDate;
	private Date endDate;
	
	private Boolean enabled = new Boolean(true);
	private String connectionType = "Generic";
	
	
	public HConnection() {

	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getPrimaryObjRole() {
		return primaryObjRole;
	}
	public void setPrimaryObjRole(String primaryObjRole) {
		this.primaryObjRole = primaryObjRole;
	}
	public String getSecondaryObjRole() {
		return secondaryObjRole;
	}
	public void setSecondaryObjRole(String secondaryObjRole) {
		this.secondaryObjRole = secondaryObjRole;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public HObject getPrimaryObj() {
		return primaryObj;
	}

	public void setPrimaryObj(HObject primaryObj) {
		this.primaryObj = primaryObj;
	}

	public HObject getSecondaryObj() {
		return secondaryObj;
	}

	public void setSecondaryObj(HObject secondaryObj) {
		this.secondaryObj = secondaryObj;
	}

	public HObject getConnectionData() {
		return connectionData;
	}

	public void setConnectionData(HObject connectionData) {
		this.connectionData = connectionData;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getConnectionType() {
		return connectionType;
	}
	
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * This check the validity of the connection at runtime.
	 * @return
	 */
	
	public boolean isValid() {
		boolean result = true;
		
		if(startDate!=null && startDate.after(new Date (System.currentTimeMillis())))
			return false;
		if(endDate!=null && endDate.before(new Date (System.currentTimeMillis())))
			return false;
		
		return result;
	}
	
	public boolean isValid(Date adate) {
		boolean result = true;
		
		if(startDate!=null && startDate.after(adate))
			return false;
		if(endDate!=null && endDate.before(adate))
			return false;
		
		return result;
	}
}
