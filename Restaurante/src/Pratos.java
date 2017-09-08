
public class Pratos {
	
	private String nome;
	private double preco;
	private String descricao;
	
	
	//construtor
	public Pratos(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
				
	}
	
	
	//getters e setters
	
	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getNome() {
		return nome;
	}
	
	

}
