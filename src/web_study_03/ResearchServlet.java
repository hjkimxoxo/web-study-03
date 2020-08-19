package web_study_03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResearchServlet")
public class ResearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		
		if(gender.equals("male")){
			gender ="남자";
		}else {
			gender ="여자";
		}
		request.setAttribute("name", name);
		request.setAttribute("gender", gender);
		
		String seasonArr[] = request.getParameterValues("season");
		String season = "";
		
		for(String s: seasonArr) {
			int n = Integer.parseInt(s);
			switch (n) {
			case 1: season += "봄";
				break;
			case 2: season += "여름";
				break;
			case 3: season += "가을";
				break;
			case 4: season += "겨울";
				break;
			}
		}
		
		request.setAttribute("season", season);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ResearchResult.jsp");
        dispatcher.forward(request, response);
	}
}
