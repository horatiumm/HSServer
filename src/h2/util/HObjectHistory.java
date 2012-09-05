package h2.util;

import java.io.Serializable;
import java.util.Date;

import h2.model.org.HPerson;

/**
 * @stereotype thing
 */

public class HObjectHistory implements Serializable{
	private static final long serialVersionUID = 1L;

	private java.lang.Integer id;
	
	private Integer objectId;
	private String objectClass;
	private java.lang.String actionType;
	private java.lang.String details;
	private java.util.Date creationDate;	
	private HPerson createdBy;
	
	public HObjectHistory() {
	}
	
	public HObjectHistory(Integer id, Integer objectId, String objectClass, String actionType, String details, Date creationDate, HPerson createdBy) {
		super();
		this.id = id;
		this.objectId = objectId;
		this.objectClass = objectClass;
		this.actionType = actionType;
		this.details = details;
		this.creationDate = creationDate;
		this.createdBy = createdBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final HObjectHistory other = (HObjectHistory) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}
	public String getObjectClass() {
		return objectClass;
	}
	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}
	public java.lang.String getActionType() {
		return actionType;
	}
	public void setActionType(java.lang.String actionType) {
		this.actionType = actionType;
	}
	public java.lang.String getDetails() {
		return details;
	}
	public void setDetails(java.lang.String details) {
		this.details = details;
	}
	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}
	public HPerson getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(HPerson createdBy) {
		this.createdBy = createdBy;
	}	
}
