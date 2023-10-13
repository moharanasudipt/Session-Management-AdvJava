import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class HS2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        PrintWriter pw=response.getWriter();
        HttpSession sess= request.getSession(false);
        
        String Str= (String)sess.getAttribute("key");
        
        pw.println("<body><center><h1>");
        pw.println("Welcome "+Str +" Have a Great Day..");  
        pw.println("</h1></center></body>");
        
        }
        catch(Exception f){
            f.printStackTrace();
        }
    }
}
