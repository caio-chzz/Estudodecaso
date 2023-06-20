package modelo;

public class Passagem {
	
	private String nome;
	private Long telefone;
	private String email;
	private Long cpf;
	private Integer pesobagagem;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public String getPesobagagem(String pesobagagem) {
		return pesobagagem;
	}
	
	public void setPesobagagem(Integer pesobagagem) {
		this.pesobagagem = pesobagagem;
	}
}
