package h2.model.product;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class HPart extends HItem {
	private static final long serialVersionUID = 1L;
	private Float length;
	private Float width;
	private Float height;
	private String surfaceArea;
	private Float thickness;
	private Float diameter;
	private Float volume;
	private String volumeUom;
	private Float weight;
	private String weightUom;
	private Float density;
	
	public HPart() {
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public String getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(String surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Float getThickness() {
		return thickness;
	}

	public void setThickness(Float thickness) {
		this.thickness = thickness;
	}

	public Float getDiameter() {
		return diameter;
	}

	public void setDiameter(Float diameter) {
		this.diameter = diameter;
	}

	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public String getVolumeUom() {
		return volumeUom;
	}

	public void setVolumeUom(String volumeUom) {
		this.volumeUom = volumeUom;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getWeightUom() {
		return weightUom;
	}

	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}

	public Float getDensity() {
		return density;
	}

	public void setDensity(Float density) {
		this.density = density;
	}
}
