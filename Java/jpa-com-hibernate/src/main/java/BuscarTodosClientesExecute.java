import configuration.DB;
import dao.ClienteDAO;
import entity.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BuscarTodosClientesExecute {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DB.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            List<Cliente> clientes = clienteDAO.buscarTodosOsClientes();
            System.out.println(clientes);
        }
    }
}