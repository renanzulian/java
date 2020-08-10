import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Database connected!");
        conn.close();
    }
}
