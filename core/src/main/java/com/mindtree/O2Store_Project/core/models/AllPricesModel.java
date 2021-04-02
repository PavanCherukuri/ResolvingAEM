package com.mindtree.O2Store_Project.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;


import com.mindtree.O2Store_Project.core.bean.Product;
import com.mindtree.O2Store_Project.core.services.AllPrices;

@Model(adaptables = Resource.class)
public class AllPricesModel {
	
	@OSGiService
	private AllPrices allPrices;
	
	List<Product> range1Plants;
	List<Product> range2Plants;
	List<Product> range3Plants;
	
	@PostConstruct
	protected void init() {
		range1Plants= allPrices.readRange1Data();
		range2Plants= allPrices.readRange2Data();
		range3Plants= allPrices.readRange3Data();
	}

	public List<Product> getRange1Plants() {
		return range1Plants;
	}

	public List<Product> getRange2Plants() {
		return range2Plants;
	}

	public List<Product> getRange3Plants() {
		return range3Plants;
	}
	
	
	

}
