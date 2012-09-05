package h2.model.base;


import java.util.Date;

/**
 * @stereotype thing
 */

// TODO revise this
public class HCapability extends HObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date endTime;
	private Date startTime;
	private String elementType;
	private String location;
		
	public HCapability() {
	}
	
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getElementType() {
		return elementType;
	}
	public void setElementType(String elementType) {
		this.elementType = elementType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
