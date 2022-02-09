package pkgtest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface CommandHandler {

	public String handlerAction(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException ;

}
