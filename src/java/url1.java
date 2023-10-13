import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class url1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        PrintWriter pw=response.getWriter();
        
        
        String Str= request.getParameter("usr");
        
        pw.println("<body><center><h1>");
        pw.println("Welcome "+Str +" Gd Morning</h1>");  
        pw.println("<a href='url2?user="+Str+"'>VISIT</a>");
        pw.println("</center></body>");
        
        }
        catch(Exception f){
            f.printStackTrace();
        }
    }
}
