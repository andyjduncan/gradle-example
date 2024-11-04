import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class XSSExample {
    public void renderUserInput(HttpServletResponse response, String userInput) throws Exception {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>User Input</h1>");
        out.println(userInput); // Vulnerable line
        out.println("</body></html>");
    }
}
