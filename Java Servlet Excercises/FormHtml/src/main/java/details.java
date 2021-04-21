

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class details
 */
@WebServlet("/details")
public class details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name = request.getParameter("uname");
		String curs = request.getParameter("pwd");
	    PrintWriter out = response.getWriter();
	    out.println("<HTML>");
	    out.println("<HEAD><TITLE>Details</TITLE></HEAD>");
	    out.println("<BODY style='background-color:black;margin-top:100px'><div style = 'border:2px solid white;border-radius:15px;background-color:black;color:white;'><H1 align = \"center\">Details:</H1>" );
	    out.println("<H1 align = \"center\" >" + "Name: "+ name + "</H1>" );
	    out.println("<H1 align = \"center\" >" + "Password: " +curs + "</H1></div>" );
	    out.println("</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
