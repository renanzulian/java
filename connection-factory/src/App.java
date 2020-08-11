import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Database connected!");
        String query = "INSERT INTO contatos"+
        " (nome, email, endereco, dataNascimento)"+
        " values(?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, "Renan");
        stmt.setString(2, "renanzulian@gmail.com");
        stmt.setString(3, "rua jose dos santos 19");
        stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
        stmt.execute();
        stmt.close();
        System.out.println("Contato has been saved!");
        conn.close();
    }
}
