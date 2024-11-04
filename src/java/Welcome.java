import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.login.ValidateLogin;

public class Welcome extends HttpServlet { 
    
    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ValidateLogin login = new ValidateLogin();
            
        try {
            if(login.validateLogin(username, password)){
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("About.jsp");
            } else response.sendRedirect("Login.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
