

package member;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MemberController extends HttpServlet {
	private static final long serialversionUID = 1L;
	
	MemberDAO dao;
	
	
	public void init(servletConfig config) throws ServletException {
		super.init(config);
		
	}
}
