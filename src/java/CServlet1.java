import jakarta.servlet.http.Cookie;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class CServlet1 extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
            try{
                
            PrintWriter p= res.getWriter();
            String Name = req.getParameter("t1");
                    
            Cookie c= new Cookie("Cname",Name);
            res.addCookie(c);
            
            p.println("<body><center>");
            p.println("<h1>Welcome: "+Name+"</h1>");
            p.println("<form action='CS2' method='get'>");
            p.println("<input type='submit' value='login'></form>");
            p.println("</center></body>");
            p.close();
            }
            catch(IOException e){
            }
        }
}