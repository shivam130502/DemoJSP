import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "";
        String username = "admin";
        String password = "admin";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
        
        if(username.equals("shivam") && password.equals("dhir")){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("About.jsp");
        } else response.sendRedirect("Login.jsp");
    }

}
