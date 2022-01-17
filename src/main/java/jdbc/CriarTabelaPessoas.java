package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "create table TB_PESSOAS\r\n"
				+ "(\r\n"
				+ "	CODIGO SERIAL primary key,\r\n"
				+ "	NOME VARCHAR(80) not null\r\n"
				+ ");\r\n"
				+ "\r\n"
				+ "";
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute(sql);
		
		System.out.println("Tabela Criada com Sucesso");
		conexao.close();
		
		
		
	}

}
