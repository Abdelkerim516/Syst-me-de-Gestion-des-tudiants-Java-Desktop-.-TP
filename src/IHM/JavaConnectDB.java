
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.Statement;
import javax.swing.JOptionPane;

package IHM;

 

public class JavaConnectDB {
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant?characterEncoding=latin1", "admin", "root");
             return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
