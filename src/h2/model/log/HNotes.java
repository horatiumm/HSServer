package h2.model.log;

import java.util.Date;

import h2.model.base.HObject;
import h2.model.org.HPerson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class HNotes implements java.io.Serializable {

    @Id 
    @GeneratedValue	
     private Integer id;

    private String username;	
    private String email;    
    private String subject;	
    @Column(length = 3000)
	private String notes;	    	
    
    private Date creationDate;
     @ManyToOne(fetch=FetchType.EAGER)
 	private HPerson creator;
     @ManyToOne(fetch=FetchType.EAGER)
	private HObject hobject;
     
     
     /** default constructor */
     public HNotes() {
     }

 	/** minimal constructor */
     public HNotes(Integer id) {
         this.id = id;
     }
     
     public Integer getId() {
 		return id;
 	}
 	public void setId(Integer id) {
 		this.id = id;
 	}
 	public String getNotes() {
 		return notes;
 	}
 	public void setNotes(String notes) {
 		this.notes = notes;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
