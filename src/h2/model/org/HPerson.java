package h2.model.org;

import h2.model.base.HObject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Embeddable;
import javax.persistence.InheritanceType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @stereotype thing
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class HPerson extends HParty {
	
	private String username;
	private String password;
	private Date passExpDate;
	private Boolean enabled;	
	private String firstName;
	private String lastName;
	private String middleName="";
	private Date dob;
	private Integer dobDay;
	private Integer dobMonth;
	private Integer dobYear;	
	private String email1;	
	private String email2;	
	private String email3;	
	private String phone1;	
	private String phone2;
	private String phone3;
	
	public HPerson() {

	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getPassExpDate() {
		return passExpDate;
	}
	public void setPassExpDate(Date passExpDate) {
		this.passExpDate = passExpDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getDobDay() {
		return dobDay;
	}
	public void setDobDay(Integer dobDay) {
		this.dobDay = dobDay;
	}
	public Integer getDobMonth() {
		return dobMonth;
	}
	public void setDobMonth(Integer dobMonth) {
		this.dobMonth = dobMonth;
	}
	public Integer getDobYear() {
		return dobYear;
	}
	public void setDobYear(Integer dobYear) {
		this.dobYear = dobYear;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean male) {
		this.enabled = male;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEmail3() {
		return email3;
	}
	public void setEmail3(String email3) {
		this.email3 = email3;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	
}
