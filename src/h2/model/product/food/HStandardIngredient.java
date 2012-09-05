package h2.model.product.food;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

/**
 * HAttribute entity. @author MyEclipse Persistence Tools
 */
@Entity

public class HStandardIngredient implements java.io.Serializable {
    @Id 
    @GeneratedValue	
     private Integer id;
    
	String	description;
//	String Water;
//	String Energ_Kcal;
//	String Protein;
//	String Lipid_Tot;
//	String Ash;
//	String Carbohydrt;
//	String Fiber_TD;
//	String Sugar_Tot;
//	String Calcium;
//	String Iron;
//	String Magnesium;
//	String Phosphorus;
//	String Potassium;
//	String Sodium;
//	String Zinc;
//	String Copper;
//	String Manganese;
//	String Selenium;
//	String Vit_C;
//	String Thiamin;
//	String Riboflavin;
//	String Niacin;
//	String Panto_acid;
//	String Vit_B6;
//	String Folate_Tot;
//	String Folic_acid;
//	String Food_Folate;
//	String Folate_DFE;
//	String Vit_B12;
//	String Vit_A_IU;
//	String Vit_A_RAE;
//	String Retinol;
//	String Vit_E;
//	String Vit_K;
//	String Alpha_Carot;
//	String Beta_Carot;
//	String Beta_Crypt;
//	String Lycopene;
//	String LutZea;
//	String FA_SAT;
//	String FA_Mono;
//	String FA_Poly;
//	String Cholesterl;
//	String GmWt_1;
//	String GmWt_Desc1;
//	String GmWt_2;
//	String GmWt_Desc2;
//	String Refuse_Pct;
	
    /** default constructor */
    public HStandardIngredient() {
    }

	/** minimal constructor */
    public HStandardIngredient(Integer id) {
        this.id = id;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setName(String description) {
		this.description = description;
	}	
//
//	public String getWater() {
//		return Water;
//	}
//
//	public void setWater(String water) {
//		Water = water;
//	}
//
//	public String getEnerg_Kcal() {
//		return Energ_Kcal;
//	}
//
//	public void setEnerg_Kcal(String energ_Kcal) {
//		Energ_Kcal = energ_Kcal;
//	}
//
//	public String getProtein() {
//		return Protein;
//	}
//
//	public void setProtein(String protein) {
//		Protein = protein;
//	}
//
//	public String getLipid_Tot() {
//		return Lipid_Tot;
//	}
//
//	public void setLipid_Tot(String lipid_Tot) {
//		Lipid_Tot = lipid_Tot;
//	}
//
//	public String getAsh() {
//		return Ash;
//	}
//
//	public void setAsh(String ash) {
//		Ash = ash;
//	}
//
//	public String getCarbohydrt() {
//		return Carbohydrt;
//	}
//
//	public void setCarbohydrt(String carbohydrt) {
//		Carbohydrt = carbohydrt;
//	}
//
//	public String getFiber_TD() {
//		return Fiber_TD;
//	}
//
//	public void setFiber_TD(String fiber_TD) {
//		Fiber_TD = fiber_TD;
//	}
//
//	public String getSugar_Tot() {
//		return Sugar_Tot;
//	}
//
//	public void setSugar_Tot(String sugar_Tot) {
//		Sugar_Tot = sugar_Tot;
//	}
//
//	public String getCalcium() {
//		return Calcium;
//	}
//
//	public void setCalcium(String calcium) {
//		Calcium = calcium;
//	}
//
//	public String getIron() {
//		return Iron;
//	}
//
//	public void setIron(String iron) {
//		Iron = iron;
//	}
//
//	public String getMagnesium() {
//		return Magnesium;
//	}
//
//	public void setMagnesium(String magnesium) {
//		Magnesium = magnesium;
//	}
//
//	public String getPhosphorus() {
//		return Phosphorus;
//	}
//
//	public void setPhosphorus(String phosphorus) {
//		Phosphorus = phosphorus;
//	}
//
//	public String getPotassium() {
//		return Potassium;
//	}
//
//	public void setPotassium(String potassium) {
//		Potassium = potassium;
//	}
//
//	public String getSodium() {
//		return Sodium;
//	}
//
//	public void setSodium(String sodium) {
//		Sodium = sodium;
//	}
//
//	public String getZinc() {
//		return Zinc;
//	}
//
//	public void setZinc(String zinc) {
//		Zinc = zinc;
//	}
//
//	public String getCopper() {
//		return Copper;
//	}
//
//	public void setCopper(String copper) {
//		Copper = copper;
//	}
//
//	public String getManganese() {
//		return Manganese;
//	}
//
//	public void setManganese(String manganese) {
//		Manganese = manganese;
//	}
//
//	public String getSelenium() {
//		return Selenium;
//	}
//
//	public void setSelenium(String selenium) {
//		Selenium = selenium;
//	}
//
//	public String getVit_C() {
//		return Vit_C;
//	}
//
//	public void setVit_C(String vit_C) {
//		Vit_C = vit_C;
//	}
//
//	public String getThiamin() {
//		return Thiamin;
//	}
//
//	public void setThiamin(String thiamin) {
//		Thiamin = thiamin;
//	}
//
//	public String getRiboflavin() {
//		return Riboflavin;
//	}
//
//	public void setRiboflavin(String riboflavin) {
//		Riboflavin = riboflavin;
//	}
//
//	public String getNiacin() {
//		return Niacin;
//	}
//
//	public void setNiacin(String niacin) {
//		Niacin = niacin;
//	}
//
//	public String getPanto_acid() {
//		return Panto_acid;
//	}
//
//	public void setPanto_acid(String panto_acid) {
//		Panto_acid = panto_acid;
//	}
//
//	public String getVit_B6() {
//		return Vit_B6;
//	}
//
//	public void setVit_B6(String vit_B6) {
//		Vit_B6 = vit_B6;
//	}
//
//	public String getFolate_Tot() {
//		return Folate_Tot;
//	}
//
//	public void setFolate_Tot(String folate_Tot) {
//		Folate_Tot = folate_Tot;
//	}
//
//	public String getFolic_acid() {
//		return Folic_acid;
//	}
//
//	public void setFolic_acid(String folic_acid) {
//		Folic_acid = folic_acid;
//	}
//
//	public String getFood_Folate() {
//		return Food_Folate;
//	}
//
//	public void setFood_Folate(String food_Folate) {
//		Food_Folate = food_Folate;
//	}
//
//	public String getFolate_DFE() {
//		return Folate_DFE;
//	}
//
//	public void setFolate_DFE(String folate_DFE) {
//		Folate_DFE = folate_DFE;
//	}
//
//	public String getVit_B12() {
//		return Vit_B12;
//	}
//
//	public void setVit_B12(String vit_B12) {
//		Vit_B12 = vit_B12;
//	}
//
//	public String getVit_A_IU() {
//		return Vit_A_IU;
//	}
//
//	public void setVit_A_IU(String vit_A_IU) {
//		Vit_A_IU = vit_A_IU;
//	}
//
//	public String getVit_A_RAE() {
//		return Vit_A_RAE;
//	}
//
//	public void setVit_A_RAE(String vit_A_RAE) {
//		Vit_A_RAE = vit_A_RAE;
//	}
//
//	public String getRetinol() {
//		return Retinol;
//	}
//
//	public void setRetinol(String retinol) {
//		Retinol = retinol;
//	}
//
//	public String getVit_E() {
//		return Vit_E;
//	}
//
//	public void setVit_E(String vit_E) {
//		Vit_E = vit_E;
//	}
//
//	public String getVit_K() {
//		return Vit_K;
//	}
//
//	public void setVit_K(String vit_K) {
//		Vit_K = vit_K;
//	}
//
//	public String getAlpha_Carot() {
//		return Alpha_Carot;
//	}
//
//	public void setAlpha_Carot(String alpha_Carot) {
//		Alpha_Carot = alpha_Carot;
//	}
//
//	public String getBeta_Carot() {
//		return Beta_Carot;
//	}
//
//	public void setBeta_Carot(String beta_Carot) {
//		Beta_Carot = beta_Carot;
//	}
//
//	public String getBeta_Crypt() {
//		return Beta_Crypt;
//	}
//
//	public void setBeta_Crypt(String beta_Crypt) {
//		Beta_Crypt = beta_Crypt;
//	}
//
//	public String getLycopene() {
//		return Lycopene;
//	}
//
//	public void setLycopene(String lycopene) {
//		Lycopene = lycopene;
//	}
//
//	public String getLutZea() {
//		return LutZea;
//	}
//
//	public void setLutZea(String lutZea) {
//		LutZea = lutZea;
//	}
//
//	public String getFA_SAT() {
//		return FA_SAT;
//	}
//
//	public void setFA_SAT(String fa_sat) {
//		FA_SAT = fa_sat;
//	}
//
//	public String getFA_Mono() {
//		return FA_Mono;
//	}
//
//	public void setFA_Mono(String mono) {
//		FA_Mono = mono;
//	}
//
//	public String getFA_Poly() {
//		return FA_Poly;
//	}
//
//	public void setFA_Poly(String poly) {
//		FA_Poly = poly;
//	}
//
//	public String getCholesterl() {
//		return Cholesterl;
//	}
//
//	public void setCholesterl(String cholesterl) {
//		Cholesterl = cholesterl;
//	}
//
//	public String getGmWt_1() {
//		return GmWt_1;
//	}
//
//	public void setGmWt_1(String gmWt_1) {
//		GmWt_1 = gmWt_1;
//	}
//
//	public String getGmWt_Desc1() {
//		return GmWt_Desc1;
//	}
//
//	public void setGmWt_Desc1(String gmWt_Desc1) {
//		GmWt_Desc1 = gmWt_Desc1;
//	}
//
//	public String getGmWt_2() {
//		return GmWt_2;
//	}
//
//	public void setGmWt_2(String gmWt_2) {
//		GmWt_2 = gmWt_2;
//	}
//
//	public String getGmWt_Desc2() {
//		return GmWt_Desc2;
//	}
//
//	public void setGmWt_Desc2(String gmWt_Desc2) {
//		GmWt_Desc2 = gmWt_Desc2;
//	}
//
//	public String getRefuse_Pct() {
//		return Refuse_Pct;
//	}
//
//	public void setRefuse_Pct(String refuse_Pct) {
//		Refuse_Pct = refuse_Pct;
//	}

}
