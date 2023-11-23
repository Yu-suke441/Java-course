package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PythagorasServlet
 */
@WebServlet("/PythagorasServlet")
public class PythagorasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PythagorasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String strA = request.getParameter("a");

        double a = Double.parseDouble(strA);

        request.setAttribute("a", a);

        String strB = request.getParameter("b");

        double b = Double.parseDouble(strB);

        request.setAttribute("b", b);

        double x = a*a + b*b;
        double c = Math.sqrt(x);
        request.setAttribute("c", c);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/calc.jsp");
        rd.forward(request, response);



    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
