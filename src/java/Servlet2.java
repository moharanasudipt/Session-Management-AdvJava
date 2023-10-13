import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Servlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        PrintWriter pw=res.getWriter();
	int id=Integer.parseInt(req.getParameter("t1"));
        String name=req.getParameter("t2");
        pw.println("<body><center><h1>");
        pw.println("Id:"+id+"<br>");
        pw.println("Name:"+name);
        pw.println("</h1></center></body>");
    }
}