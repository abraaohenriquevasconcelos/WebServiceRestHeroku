package dao;




/*
package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.GenericEntity;



public class GenericDAO {

	private final EntityManagerFactory entityManagerFactory;
	
	private final EntityManager entityManager;
	
	public GenericDAO(){
		
		//CRIANDO O NOSSO EntityManagerFactory COM AS PORPRIEDADOS DO ARQUIVO persistence.xml 
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_web_service_rest");
		
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	

	public void Salvar(GenericEntity pessoaEntity){
		
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(pessoaEntity);
		this.entityManager.getTransaction().commit();
	}
	

	public void Alterar(GenericEntity pessoaEntity){
		
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(pessoaEntity);
		this.entityManager.getTransaction().commit();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<GenericEntity> TodasPessoas(){
		
		return this.entityManager.createQuery("SELECT p FROM PessoaEntity p ORDER BY p.nome").getResultList();
	}
	
	
	public GenericEntity GetPessoa(Integer codigo){
		
		return this.entityManager.find(GenericEntity.class, codigo);
	}
	
	
	public void Excluir(Integer codigo){
		
		GenericEntity pessoa = this.GetPessoa(codigo);
		
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(pessoa);
		this.entityManager.getTransaction().commit();
		
	}
}
*/