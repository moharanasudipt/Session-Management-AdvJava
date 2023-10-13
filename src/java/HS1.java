import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class HS1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        PrintWriter pw=response.getWriter();
        
        String S= request.getParameter("usr");
        System.out.println(S);
        
        HttpSession sess= request.getSession();
        sess.setAttribute("key", S);
        
        pw.println("<body><center><a href='HS2'>VISIT</a></center></body>");
        }
        catch(Exception f){
            f.printStackTrace();
        }
    }
}
