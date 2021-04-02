package com.mindtree.O2Store_Project.core.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import com.mindtree.O2Store_Project.core.bean.Plant;
import com.mindtree.O2Store_Project.core.dao.PriceDao;
import com.google.gson.Gson;




//@SlingServlet(paths="/bin/trainingproject/testservlet")  --Felix SCR Annotation

//OSGI Declarative Service Annotation
@Component(
		service=Servlet.class,
		property={
				"sling.servlet.paths="+ "/bin/orchardTwo/PriceFilteServlet"
		}
)

public class PriceFilterServlet extends SlingAllMethodsServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
    	response.setHeader("Content-Type", "text/html");
    	
    	PriceDao dao = new PriceDao();
    	int price1=Integer.parseInt(request.getParameter("Price1"));
    	int price2=Integer.parseInt(request.getParameter("Price2"));
    	List<Plant> plants = dao.fetchData(price1,price2);
    	Gson gson = new Gson();
    	PrintWriter out = response.getWriter();
		out.print(gson.toJson(plants));
		out.flush();
		out.close();
    } 
	
	
}

