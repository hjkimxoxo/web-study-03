package web_study_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		result(request, response);
	}
	
	
	private void result(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int age=Integer.parseInt(request.getParameter("age"));
		
		if(age <= 19) {
			JOptionPane.showMessageDialog(null, "19세미만");
			response.getWriter()
			.append("<html><script type='text/javascript'>")
			.append("history.go(-1)")
			.append("</script></html>");
			
		}else {
			request.setAttribute("age", age);
			request.setAttribute("name", "성윤정");
			
			RequestDispatcher dispatcher =request.getRequestDispatcher("11_forwardResult.jsp"); 
			dispatcher.forward(request, response);
		}
		
		 
	
	}

}
