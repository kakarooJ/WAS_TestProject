package pkgtest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DispatcherServlet
 */
//@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DispatcherServlet doGet");
		
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		String[] uris = uri.split("/");
		String module = uris[1];
		
		Controller controller = null;
		
		if(module.equals("add")) {
			controller = new AddController(request, response);
		} else if(module.equals("mul")) {
			controller = new MulController(request, response);
		}
		
		String rst = controller.execute();
		if(rst != null) {
			request.getRequestDispatcher(rst).forward(request, response);
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
