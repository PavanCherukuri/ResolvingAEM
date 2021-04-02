<<<<<<< HEAD
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
public class FooterComponent {
	@SlingObject
	private Resource currentResource;
	@SlingObject
	private ResourceResolver resourceResolver;

	private List<Page> rootChildPages = new ArrayList<>();
	private List<Page> moreChildPages = new ArrayList<>();

	private Page rootPage;

	@PostConstruct
	protected void init() {

		PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
		Page currentPage = pageManager.getContainingPage(currentResource);

		rootPage = currentPage.getAbsoluteParent(2);
		Page morePage = pageManager.getPage("/content/O2Store_Project/en");

		if (rootPage == null) {
			rootPage = currentPage;
		}

		if (morePage == null) {
			morePage = currentPage;
		}

		Iterator<Page> rootChildList = rootPage.listChildren();
		while (rootChildList.hasNext()) {
			rootChildPages.add(rootChildList.next());

		}

		Iterator<Page> moreChildList = morePage.listChildren();
		while (moreChildList.hasNext()) {
			moreChildPages.add(moreChildList.next());
		}

	}

	public Page getRootPage() {
		return rootPage;
	}

	public List<Page> getRootChildPages() {
		return rootChildPages;
	}

	public List<Page> getMoreChildPages() {
		return moreChildPages;
	}

}
=======
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
public class FooterComponent {
	@SlingObject
	private Resource currentResource;
	@SlingObject
	private ResourceResolver resourceResolver;

	private List<Page> rootChildPages = new ArrayList<>();
	private List<Page> moreChildPages = new ArrayList<>();

	private Page rootPage;

	@PostConstruct
	protected void init() {

		PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
		Page currentPage = pageManager.getContainingPage(currentResource);

		rootPage = currentPage.getAbsoluteParent(2);
		Page morePage = pageManager.getPage("/content/O2Store_Project/en");

		if (rootPage == null) {
			rootPage = currentPage;
		}

		if (morePage == null) {
			morePage = currentPage;
		}

		Iterator<Page> rootChildList = rootPage.listChildren();
		while (rootChildList.hasNext()) {
			rootChildPages.add(rootChildList.next());

		}

		Iterator<Page> moreChildList = morePage.listChildren();
		while (moreChildList.hasNext()) {
			moreChildPages.add(moreChildList.next());
		}

	}

	public Page getRootPage() {
		return rootPage;
	}

	public List<Page> getRootChildPages() {
		return rootChildPages;
	}

	public List<Page> getMoreChildPages() {
		return moreChildPages;
	}

}
>>>>>>> branch 'master' of https://glcgitlab.southindia.cloudapp.azure.com/playground/Dec-2020/projects/aem/o2-store/O2Store_Project.git
