package application.model;

public class usuarioModel {
	private int id;
	private String NomeCompleto;
	private String Login;
	private String Senha;
	
	public usuarioModel(int id,String NomeCompleto,String Login,String Senha) {
		this.id=id;
		this.NomeCompleto=NomeCompleto;
		this.Login=Login;
		this.Senha=Senha;
	}
	//getters e setters
	public int getID() {return id;}
	public void setID(int id) {this.id=id;}
	
	public String getNomeCompleto() {return NomeCompleto;}
	public void setNomeCompleto(String NomeCompleto) {this.NomeCompleto=NomeCompleto;}
	
	public String getLogin() {return Login;}
	public void setLogin(String Login) {this.Login=Login;}	
	
	public String getSenha() {return Senha;}
	public void setSenha(String Senha) {this.Senha=Senha;}
	
}