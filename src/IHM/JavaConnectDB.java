package IHM;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JavaConnectDB {

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gestion_etudiant?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8",
                "admin",
                "root"
            );

            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de connexion : " + e.getMessage());
            return null;
        }
    }
}
