package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
public static void main(String[] args) throws SQLException{
		
//		String url = "jdbc:postgresql://localhost:5432/postgres";
//		String usuario = "root";
//		String senha = "12345678";
//		
//		Connection conexao = DriverManager
//					.getConnection(url,usuario,senha);
	
		Connection conexao = FabricaConexao.getConexao();
		

		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		
		System.out.println("Banco Criado com Sucesso !");
		
		
		
		conexao.close();

		
	}


}
