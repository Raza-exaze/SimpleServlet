import java.sql.*;

public class SQLDatabase
{
    public static boolean checking(String name,String pass) {
        boolean status = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "systemroot@786");
            PreparedStatement stm = con.prepareStatement("select * from login where user=? and password=?");
            stm.setString(1, name);
            stm.setString(2, pass);
            ResultSet rs = stm.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}

