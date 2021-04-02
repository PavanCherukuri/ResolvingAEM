package com.mindtree.O2Store_Project.core.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

import com.mindtree.O2Store_Project.core.bean.CreditCard;
import com.mindtree.O2Store_Project.core.dao.CreditCardDao;




@Component(service = Servlet.class, property = { "sling.servlet.paths=" + "/bin/CreditCard/CreditCardServlet",
		"sling.servlet.methods=" + HttpConstants.METHOD_POST })
public class CreditCardServlet extends SlingAllMethodsServlet {
	private static final long serialVersionUID = 1L;

	private CreditCardDao creditCardDao;

	public void init() {
		creditCardDao = new CreditCardDao();
	}

	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html");

		String cardnumber = request.getParameter("cardnumber");
		String name = request.getParameter("name");
		String expiry = request.getParameter("expiry");
		String cvv = request.getParameter("cvv");

		CreditCard creditCard = new CreditCard();
		creditCard.setCardnumber(cardnumber);
		creditCard.setName(name);
		creditCard.setExpiry(expiry);
		creditCard.setCvv(cvv);

		try {
			creditCardDao.creditDetails(creditCard);
		} catch (Exception e) {
			e.printStackTrace();
		}}}

