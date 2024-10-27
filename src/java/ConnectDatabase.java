import java.sql.*;

public class ConnectDatabase {
    
    public static void main (String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "admin";
        int rollNumber = 7;
        String studentName = "Zlatan";
        String query = "insert into student values (?, ?)";
      //System.out.println(query);
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, rollNumber);
        st.setString(2, studentName);
        int rowsAffected = st.executeUpdate(); // when using prepared statement, we don't need to pass the query to the executeUpdate() method
        
      // Statement st = con.createStatement();
      //  ResultSet rs = st.executeQuery(query); // executeQuery() is used when fetching data from database
      //  int rowsAffected = st.executeUpdate(query); // executeUpdate() is used when inserting values into database
       
        System.out.println(rowsAffected + "row(s) affected");
        
    }
    
}
