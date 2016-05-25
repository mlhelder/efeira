package efeira;

import java.util.ArrayList;
import java.util.List;

import efeira.Produto;

public class Estoque {
	// lista de produtos
	private List<Produto> listaProdutos;

	public Estoque() {
		listaProdutos = new ArrayList<Produto>();
	}

	// Listar produtos em estoque
	public void listarProdutos() {
		for (int i = 0; i < listaProdutos.size(); i++) {
			// imprime os produtos da lista
			System.out.println("Indice: ");
			System.out.println( i + ". Produto: " + listaProdutos.get(i).getNome() + "| Quantidade: "
					+ listaProdutos.get(i).getQuantidade() + "| Preco: " + listaProdutos.get(i).getValor());
		}
	}

	// remover produto
	public void removeProduto(String nomeProduto) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			if (listaProdutos.get(i).getNome().equalsIgnoreCase(nomeProduto)) {
				// Executa acao
				listaProdutos.remove(i);
			} else {
				// nao faz nada
				System.out.println("Produto n�o encontrado");
			}

		}
	}

	// Add produto
	public void addProduto(String nome, Double valor, int quantidade) {
		// cria novo produto
		Produto prdto = new Produto(nome, valor, quantidade);
		// add produto na lista
		listaProdutos.add(prdto);
	}

	// retorna produto
	public Produto retornaProduto(String name) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			// verificar se existe o produto
			if (listaProdutos.get(i).getNome().equalsIgnoreCase(name)) {
				// retorna produto desejado
				return listaProdutos.get(i);
			}
		}

		return null;
	}

	// alterar quantidade do produto
	public void alteraQuantidadeEmEstoque(String name, int quantidade) {
		// pega obj produto
		Produto produtoNovo = retornaProduto(name);
		// altera quantidade do produto desejado
		produtoNovo.alteraQuantidade(quantidade);
	}

	//retorna a lista com os produtos
	public List<Produto> getListaDeProtudos() {
		return listaProdutos;
	}
	
	

}