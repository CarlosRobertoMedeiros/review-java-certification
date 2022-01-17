package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Informe o códido da pessoa");
		int codigo = entrada.nextInt();
		
		String selectSQL = "SELECT codigo,nome FROM tb_pessoas WHERE codigo = ?";
		String updateSQL ="UPDATE tb_pessoas SET nome = ? where codigo = ? ";
		Connection connection = FabricaConexao.getConexao();
		PreparedStatement stmt = connection.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		
		ResultSet res = stmt.executeQuery();
		
		if (res.next()) {
			Pessoa p = new Pessoa(res.getInt(1), res.getString(2));
			System.out.println("O nome atual é:  "+p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			
			stmt = connection.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();
			System.out.println("Pessoa Alterada com Sucesso");

		}else {
			System.out.println("Pessoa não encontrada!");
		}
		
		connection.close();
		entrada.close();
	}

}
