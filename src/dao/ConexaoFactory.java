package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoFactory {
	
	private static String USUARIO ="root";
	private static String SENHA = "aluno";
	private static String URL = "jdbc:mysql://localhost:3306/vendas";
	
	
	
	public static Connection obtemConexao()throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection obtemConexao = DriverManager.getConnection("jdbc:mysql://localhost/vendas?user=root&password=aluno");
		return obtemConexao;
	}
	
	public static void main(String[]args) throws ClassNotFoundException{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection obtemConexao = ConexaoFactory.obtemConexao();
			System.out.println("conexao ok");
		} catch (SQLException ex) {
			// TODO: handle exception
			System.out.println("nao conectou");
		}
		
	
	}

	
	}

