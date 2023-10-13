
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hidden2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PrintWriter pw = response.getWriter();
            String name = request.getParameter("username");

            pw.println("<body><center><h1>");
            pw.println("Gd Afternoon "+name);
            pw.println("</center></body>");

        } catch (Exception f) {
            f.printStackTrace();
        }
    }
}
