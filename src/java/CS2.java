import jakarta.servlet.http.Cookie;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class CS2 extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
            try{
            PrintWriter p= res.getWriter();
            Cookie c[]=req.getCookies();
            p.println("<body><center><div>");
            p.println("<h2>Hello "+c[0].getValue()+"</h2>");
            p.println("</div></center></body>");
            p.close();
            }
            catch(IOException r){
                System.out.println(r.getMessage());
            }
        }
}