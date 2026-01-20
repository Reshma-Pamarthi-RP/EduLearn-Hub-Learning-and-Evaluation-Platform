package com.ts.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class MaterialDetails {

	@Id@GeneratedValue
	private int materialId;
	private String materialName;
	private String materialDescription;
	private String imageName;
	
	/*@ManyToOne
	@JoinColumn(name="studentId")
	private Student student;*/

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "MaterialDetails [materialId=" + materialId + ", materialName=" + materialName + ", materialDescription="
				+ materialDescription + ", imageName=" + imageName + ",]";
	}
	
}


	
    
	