package pkgtest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MulController extends Controller{
	
	public MulController(HttpServletRequest req, HttpServletResponse res) {
		super(req, res);
	}
	
	public String execute() {
		return "/WEB-INF/mul.jsp";
	}
}
