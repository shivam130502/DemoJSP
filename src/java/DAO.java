import java.sql.*;

public class DAO {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Student student = new Student();
        classDao dao = new classDao();
        student.rollNumber = 3;
        student.studentName = "Golu";
        dao.connect();
        dao.addStudent(student);
        //dao.removeStudent(1);
    }
}

class Student {
    
    int rollNumber;
    String studentName;
    
}

class classDao {
    
    Connection con = null;
    
    public void connect () throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "admin";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, username, password);
    }
    
    public void addStudent(Student student) throws SQLException {
        
        String query = "insert into class values (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, student.rollNumber);
            ps.setString(2, student.studentName);
            ps.executeUpdate();
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    public void removeStudent(int rollNumber) throws SQLException {
        String query = "delete from class where rollNumber = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, rollNumber);
            int rowsAffected = ps.executeUpdate();
            System.out.println("rows affected : " + rowsAffected);
        } catch (Exception ex) {
            
        }
    }
    
}