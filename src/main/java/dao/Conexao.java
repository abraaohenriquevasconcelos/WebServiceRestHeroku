package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

	private static final String banco = 
			"jdbc:postgresql://ec2-184-73-174-10.compute-1.amazonaws.com:5432/da8fc6sl6v645d?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
	
	private static final String driver = "org.postgresql.Driver";
	
	private static final String usuario = "xomvkiorsjipsa";
	
    private static final String senha = "44f70a2bfc7f636e2c5cf44638420e2706ad0af6c41d7b53b04750d4ad8ca4d9";
    
    private static Connection con = null;
    
    public static Connection getConexao(){
    	if(con == null){   		
    		try{
	    		// defino a classe do driver a ser usado
	            Class.forName(driver);
	            con = DriverManager.getConnection( banco, usuario, senha);
    		}catch(ClassNotFoundException e){
    			 System.out.println("Não encontrou o driver");
    		}catch(SQLException e){
    			 System.out.println("Erro ao conectar: "+e.getMessage());
    		}
    	}
    	return con;
    }
    
    
    public static PreparedStatement getPreparedStatement(String sql){
    	 // testo se a conexão já foi criada
    	if(con == null){
    		// cria a conexão
            con = getConexao();
    	}
    	try{
    		// retorna um objeto java.sql.PreparedStatement
    		return con.prepareStatement(sql);
    	}catch(SQLException e){
    		 System.out.println("Erro ao conectar: "+e.getMessage());
    	}
    	return null;
    }
    
    
    
}
