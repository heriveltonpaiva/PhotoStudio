package br.unirn.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/agenda";
		String usuario = "postgres";
		String senha = "280394";
		    

	    try{
	    	Class.forName("org.postgresql.Driver");
	   	    
	   System.out.println("Conectado no banco");
	    return DriverManager.getConnection(url, usuario, senha);
	    
	    }catch(ClassNotFoundException e){
	  System.out.println("Não Conectado no banco");
	   
	   throw new SQLException(e.getMessage());
	    }
	    
	    
	    }
	
}
