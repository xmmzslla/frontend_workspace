package part03.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import part03.dao.JoinService;

@WebServlet ("/empDeptJoin")
public class EmpDeptController extends HttpServlet{
	
	private JoinService service;
	
	public EmpDeptController() {
		service = new JoinService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setAttribute("aList", service.emp_deptProcess());
		
		String path = "/part03/empDeptJoin.jsp";
		
		RequestDispatcher dis = req.getRequestDispatcher(path);
		dis.forward(req, resp);
		
		
	}//doget
}//c
