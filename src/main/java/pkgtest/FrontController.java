package pkgtest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
       
    @Override
    public void init() throws ServletException {
    	commandHandlerMap.put("/add", new AddHandler());
    	commandHandlerMap.put("/mul", new MulHandler());
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
    	System.out.println("요청 분석");
    	String requestURI = req.getRequestURI().toString();
    	System.out.println("요청 URI: " + requestURI);
    	
    	String command = requestURI.substring(req.getContextPath().length());
    	System.out.println("요청 command: " + command);
    	
    	CommandHandler handler = null;
    	String viewPage = null;
    	
    	if(requestURI.indexOf(req.getContextPath()) == 0) {
    		handler = commandHandlerMap.get(command);
    		viewPage = handler.handlerAction(req, res);
    		System.out.println("Model(Business Logic) 실행");
    	}
    	System.out.println("Controller가 결과 데이터를 보여줄 뷰로 포워딩");
    	req.getRequestDispatcher(viewPage).forward(req, res);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
