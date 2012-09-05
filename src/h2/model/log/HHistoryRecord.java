package h2.model.log;

import h2.model.base.HObject;
import h2.model.org.HPerson;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class HHistoryRecord implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
    @GeneratedValue	
    private Integer id;    
	private String actionType;	
	@Column(length = 3000)
	private String actionDetails;
	private Date creationDate;
    @ManyToOne(fetch=FetchType.EAGER)
 	private HPerson creator;
    @ManyToOne(fetch=FetchType.EAGER)
	private HObject hobject;
    
    /** default constructor */
    public HHistoryRecord() {
    }

	/** minimal constructor */
    public HHistoryRecord(Integer id) {
        this.id = id;
    }    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getActionDetails() {
		return actionDetails;
	}
	public void setActionDetails(String actionDetails) {
		this.actionDetails = actionDetails;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public HPerson getCreator() {
		return creator;
	}
	public void setCreator(HPerson creator) {
		this.creator = creator;
	}
	public HObject getHobject() {
		return hobject;
	}
	public void setHobject(HObject hobject) {
		this.hobject = hobject;
	}
}
