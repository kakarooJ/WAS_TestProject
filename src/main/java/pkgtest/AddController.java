package pkgtest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddController extends Controller{
	
	public AddController(HttpServletRequest req, HttpServletResponse res) {
		super(req, res);
	}
	
	public String execute() {
		return "/WEB-INF/add.jsp";
	}
}
