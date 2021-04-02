package com.mindtree.O2Store_Project.core.services;

import java.util.List;
import com.mindtree.O2Store_Project.core.bean.Product;


public interface AllCategories {
	public List<Product> readAllPlantsData();

	public List<Product> readMedicinalData();

	public List<Product> readFloweringData();

	public List<Product> readFoilageData();

	public List<Product> readPlantersData();

	public List<Product> readFertilizerData();

	public List<Product> readAccessoriesData();

	public List<Product> readMaterialsData();

	public List<Product> readSeedsData();
}
