package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class conexaoBD {
	
	Connection connection = null;
	
	try {

		private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		Class.forName(DRIVER);

		
		private static final String URL = "jdbc:mysql://localhost:3306/pet?useTimezone=true&serverTimezone=UTC";
		private static final String USER = "root";
		private static final String PASSWORD = "123456";
		
		 // Estabelecendo a conexão

		connection =  DriverManager.getConnection(URL, USER, PASSWORD);

		}catch(SQLException ex){ // Tratamento de Exceções

			String r = "";

		}
}
	