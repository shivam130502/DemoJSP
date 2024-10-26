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
        
        while(rs.next()){
            System.out.println(rs.getInt(1) + " : " + rs.getString(2));
        }
        
        System.out.println("Connection Established");
        
    }
    
}
