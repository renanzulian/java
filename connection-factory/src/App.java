import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scann = new Scanner(System.in);
        Contato contato = new Contato();
        System.out.println("Insira o nome do usuário: ");
        String name = scann.nextLine();
        contato.setName(name);
        System.out.println("Insira o endereço do usuário: ");
        String endereco = scann.nextLine();
        contato.setEndereco(endereco);
        System.out.println("Insira o email do usuário: ");
        String email = scann.next();
        contato.setEmail(email);
        ContatoDao dao = new ContatoDao();
        dao.salvarContato(contato);
        dao.closeConnection();
        scann.close();
    }
}
