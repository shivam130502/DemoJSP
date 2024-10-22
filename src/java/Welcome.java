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
        String query = "select rollNumber from student ";
        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(url, username, password);
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            
//            rs.next();
//            
//            String name = rs.getString("studentName");
//            System.out.println(name);
//            
//            rs.close();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
        
        if(username.equals("shivam") && password.equals("dhir")){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("About.jsp");
        } else response.sendRedirect("Login.jsp");
    }

}
