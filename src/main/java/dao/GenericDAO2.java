package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.GenericModel2;




public class GenericDAO2 {


	
	public List<GenericModel2> listarHomens(){
		String sql = "SELECT * FROM pessoa WHERE pes_sexo = 'M'";
		List<GenericModel2> homens = new ArrayList<>();
		
		PreparedStatement preparedStatement = Conexao.getPreparedStatement(sql);
		
		try{
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				GenericModel2 homem = new GenericModel2();
				homem.setId(resultSet.getInt("pes_id"));
				homem.setNome(resultSet.getString("pes_nome"));
				homem.setSexo(resultSet.getString("pes_sexo"));
				homens.add(homem);
			}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return homens;
	}
	
	
	
	
}