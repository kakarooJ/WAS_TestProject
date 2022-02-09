package pkgtest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * Servlet implementation class TestServlet7
 */
@WebServlet(name = "page1", urlPatterns = {"/TestServlet7"})
public class TestServlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("service called");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("doGet called");
		
		response.setContentType("text/plain");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		PrintWriter out = response.getWriter();
		out.println("Hello, world...!");
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	   System.out.println("doPost called");
	   
       response.setContentType("text/html");
       request.setCharacterEncoding("utf8");
       response.setCharacterEncoding("utf8");
       String param = URLDecoder.decode(request.getParameter("text1"), "utf8");
       PrintWriter out = response.getWriter();
       int result = 0;
       try {
           int n = Integer.parseInt(param);
           for (int i = 1; i <= n; i++) {
               result += i;
           }
       } catch (NumberFormatException e) {
           out.println(e);
       }
       request.setAttribute("input", Integer.parseInt(param)+20);
       request.setAttribute("result", result);
       ServletContext app = this.getServletContext();
       RequestDispatcher dispatcher = app.getRequestDispatcher("/index.jsp");
       try {
           dispatcher.forward(request, response);
       } catch (ServletException e) {
           out.println(e);
       }
   }

}
