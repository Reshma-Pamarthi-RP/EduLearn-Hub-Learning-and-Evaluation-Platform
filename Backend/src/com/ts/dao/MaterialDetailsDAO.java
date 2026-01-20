package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.MaterialDetails;

public class MaterialDetailsDAO {
private SessionFactory factory = null;
	
	public List<MaterialDetails> getAllMaterialDetails() {
		List<MaterialDetails> materialDetails=(List)HibernateTemplate.getObjectListByQuery("From MaterialDetails");
		return materialDetails;	
	}


	public int addmaterial(MaterialDetails material) {
		// TODO Auto-generated method stub
		System.out.println(material); 
		return HibernateTemplate.addObject(material);
	}
	

}
