package com.app.backend.business;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.backend.business.Message;
import com.app.backend.datastore.DAOClient;
import com.app.backend.model.Client;

@SuppressWarnings("serial")
@WebServlet(
	    name = "ApiClientSave",
	    urlPatterns = {"/_ah/api/client/save"}
	)
public class ApiClientSave extends HttpServlet {

	DAOClient service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Message msg = new Message();
		Client client = new Client();
		client.setName(req.getParameter("name"));
		client.setDescription(req.getParameter("description"));
		
		try {
			service = new DAOClient();
			service.create(client);
			msg.setMessage("Save...");
		} catch (Exception e) {
			msg.setMessage("Fail...");
		}		
		
	}
}
