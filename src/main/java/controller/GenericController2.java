package controller;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dao.GenericDAO2;
//import dao.GenericDAO;
//import entity.GenericEntity;
import model.GenericModel1;
import model.GenericModel2;


/**
 * Essa classe vai expor os nosso métodos para serem acessasdos via http
 * 
 * @Path - Caminho para a chamada da classe que vai representar o nosso serviço
 * */
@Path("/webapi")
public class GenericController2 {
		
	private final  GenericDAO2 genericDAO2 = new GenericDAO2();

	/**
	 * @Consumes - determina o formato dos dados que vamos postar
	 * @Produces - determina o formato dos dados que vamos retornar
	 * 
	 * Esse método cadastra uma nova pessoa
	 * */
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testar() {
        return "Passou";
    }
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pessoa/homens")
	public String listHomens(){
		List<GenericModel2> lista;
		lista = genericDAO2.listarHomens();
		Gson gson = new Gson();
		return gson.toJson(lista);
	}
	
		
}
