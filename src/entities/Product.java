package entities;

public class Product {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade*preco;
	}
	
	public void AddProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void RemoverProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: $ "
			+ String.format("%.2f", ValorTotalEmEstoque());
	}
	
	
}
