import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.login.ValidateLogin;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Welcome extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            ValidateLogin login = new ValidateLogin();
            
            if(login.validateLogin(username, password)){
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("About.jsp");
            } else response.sendRedirect("Login.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
