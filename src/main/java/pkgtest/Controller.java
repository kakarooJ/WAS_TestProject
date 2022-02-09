package pkgtest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class Controller {
	private HttpServletRequest req;
	private HttpServletResponse res;
	
	public Controller(HttpServletRequest req, HttpServletResponse res) {
		this.req = req;
		this.res = res;
	}
	
	public abstract String execute();

}
