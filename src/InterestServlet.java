import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InterestServlet",urlPatterns = "/interest")
public class InterestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double money = Double.parseDouble(request.getParameter("money"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        double interest = (money * rate / 100) * amount ;
        request.setAttribute("interest",interest);
        RequestDispatcher re = request.getRequestDispatcher("/info.jsp");
        re.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
