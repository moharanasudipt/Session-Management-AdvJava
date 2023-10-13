import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class url2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        PrintWriter pw=response.getWriter();       
        String Str= request.getParameter("user");
        
        pw.println("<body><center><h1>");
        pw.println("Welcome "+Str +" Have a Great Day..");  
        pw.println("</h1></center></body>");
        
        }
        catch(Exception f){
            f.printStackTrace();
        }
    }
}
