package h2.util;

/**
 * @stereotype thing
 */

public class HLovItem {
	private Integer id;
	
	private String lovName;
	private String description;	
	private Integer parentLov;
	private Integer sequenceLov;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLovName() {
		return lovName;
	}
	public void setLovName(String lovName) {
		this.lovName = lovName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getParentLov() {
		return parentLov;
	}
	public void setParentLov(Integer parentLov) {
		this.parentLov = parentLov;
	}
	public Integer getSequenceLov() {
		return sequenceLov;
	}
	public void setSequenceLov(Integer sequenceLov) {
		this.sequenceLov = sequenceLov;
	}
}
