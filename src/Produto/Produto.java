package Produto;

public abstract class Produto {
	
	public double preco;
	public int quantidade;
	public long cod_barra;
	
	public double calcprecovendar(double preco, double lucro){
		return this.preco + lucro;
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

	public long getCod_barra() {
		return cod_barra;
	}

	public void setCod_barra(long cod_barra) {
		this.cod_barra = cod_barra;
	}

}
