import java.sql.*;

public class ConnectDatabase {
    
    public static void main (String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "admin";
        String query = "select * from student";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        rs.next();
        rs.next();
        String name = rs.getString("studentName");
        
        System.out.println(name);
        
    }
    
}
