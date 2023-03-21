import java.sql.*;

public class CallAPI {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Établir la connexion à la base de données
            String url = "jdbc:mysql://localhost:3306/mydatabase"; // Remplacez mydatabase par le nom de votre base de données
            String user = "root"; // Remplacez root par votre nom d'utilisateur de la base de données
            String password = "mypassword"; // Remplacez mypassword par votre mot de passe de la base de données
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion à la base de données établie");

            // Écrire votre code pour accéder et manipuler les données de la base de données ici

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connexion à la base de données fermée");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}