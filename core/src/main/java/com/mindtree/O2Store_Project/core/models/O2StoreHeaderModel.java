package com.mindtree.O2Store_Project.core.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(adaptables = Resource.class)
public class O2StoreHeaderModel {

	@SlingObject
	private Resource currentResource;
	@SlingObject
	private ResourceResolver resourceResolver;

	private List<Page> rootChildPages = new ArrayList<>();
	
	

	private Page rootPage;

	@PostConstruct
	protected void init() {

		PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
		Page currentPage = pageManager.getContainingPage(currentResource);

<<<<<<< HEAD
		rootPage = currentPage.getAbsoluteParent(2);
=======
		rootPage = currentPage.getAbsoluteParent(3);
>>>>>>> branch 'master' of https://glcgitlab.southindia.cloudapp.azure.com/playground/Dec-2020/projects/aem/o2-store/O2Store_Project.git

		if (rootPage == null) {
			rootPage = currentPage;
		}

		

		Iterator<Page> rootChildList = rootPage.listChildren();
		while (rootChildList.hasNext()) {
			rootChildPages.add(rootChildList.next());
		}
	}
	

	public Page getRootPage() {
		return rootPage;
	}

	public List<Page> getRootChildPages() {
		return rootChildPages;
	}


	

}
