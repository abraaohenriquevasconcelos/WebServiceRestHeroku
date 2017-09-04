package model;

public class GenericModel2 {


	//private int codigo;
	Integer id;
	private String nome;
	private String sexo;
	
	public GenericModel2(){
		
	}
	
	public GenericModel2(int id, String nome, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}

//	public int getCodigo() {
//		return codigo;
//	}
//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getSexo(){
		return sexo;
	}
	public void setSexo(String sexo){
		this.sexo =  sexo;
	}
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
}
