package efeira;

public class Produto {
	private String nome;
	private double valor;
	private int quantidade;

	// construtor
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	// alterar a quantidade
	public void alteraQuantidade(int novaQuantidade) {
		if (quantidade < novaQuantidade) {
			System.out.println("Quantidade invalida");
		} else {
			this.quantidade = quantidade - novaQuantidade;
		}
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

}
