import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.Date;

public class ContatoDao {
    private Connection connection;

    public ContatoDao() {
        this.connection = new ConnectionFactory().getConnection();
        System.out.println("Database connected!");
    }

    public void salvarContato(Contato contato) {
        String query = "INSERT INTO contatos"+
        " (nome, email, endereco, dataNascimento)"+
        " values(?, ?, ?, ?)";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);
            stmt.setString(1, contato.getName());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
            stmt.execute();
            stmt.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
        System.out.println("Contato has been saved!");
    }
    
    public void closeConnection() throws SQLException {
        this.connection.close();
    }
}