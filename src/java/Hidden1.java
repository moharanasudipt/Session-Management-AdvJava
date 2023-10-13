import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hidden1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PrintWriter pw = response.getWriter();
            String Str = request.getParameter("usr");

            pw.println("<body><center><h1>");
            pw.println("Welcome " + Str + " Have a Great Day..</h1>");
            pw.println("" + "<form action='Hidden2' method='post'>"
                    + "<input type='hidden' name='username' value='" + Str + "'/>"
                    + "<button type='submit'>Submit</button>"
                    + "</form>");
            pw.println("</center></body>");

        } catch (Exception f) {
            f.printStackTrace();
        }
    }
}