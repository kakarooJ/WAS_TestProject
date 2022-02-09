package pkgtest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddHandler implements CommandHandler {
	
	public String handlerAction(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		String aVal = req.getParameter("a");
		String bVal = req.getParameter("b");
		if(aVal == null || bVal == null) {
			res.getWriter().println("계산할 인자가 없습니다.");
			return null;
		}
		int n1 = Integer.parseInt(aVal);
		int n2 = Integer.parseInt(bVal);
		
		int result = n1 + n2;
		req.setAttribute("result", result);
		return "/WEB-INF/add.jsp";
	}

}
