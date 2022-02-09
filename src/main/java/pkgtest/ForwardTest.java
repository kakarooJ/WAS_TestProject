package pkgtest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ForwardTest
 */
@WebServlet("/forward")
public class ForwardTest extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Forward doGet");
		response.setContentType("text/plain");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		
		String param = request.getParameter("name");
		System.out.println(param);
		PrintWriter out = response.getWriter();
		out.print(param);
		
		if(param != null) {
			request.setAttribute("result1", Integer.parseInt(param)+10);
			ServletContext app = this.getServletContext();
			RequestDispatcher dispatcher = app.getRequestDispatcher("/regres.jsp");
			try {
		       dispatcher.forward(request, response);
			} catch (ServletException e) {
		       out.println(e);
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
