import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjectionExample {
    public void getUser(String username) {
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        try {
            Connection connection = DriverManager.getConnection("jdbc:your_database_url", "user", "password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Process the result set
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
