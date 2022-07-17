import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {

        Connection conexao = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas_java", "root", "papagaio");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM ALUNO");
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
        }
//        catch (ClassNotFoundException e) {
//            System.out.println("Driver do banco de dados não encontrado. " + e.getMessage());
//        }
        catch (SQLException e) {
            System.out.println("Conexão com o banco de daos falhou: " + e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.out.println("Falha ao fechar a conexão: " + e.getMessage());
                }
            }
        }

    }
}
