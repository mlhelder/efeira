/**
 * 
 */
package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import efeira.*;
import usuarios.*;

/**
 * @author Carolyne
 * 
 */
public class Sistema {

	static Feira feira = new Feira();
	static Estoque estoque = new Estoque();
	private static List<Produto> listaDeCompra;

	// MAIN
	public static void main(String[] args) {
		List listaDecompra = new ArrayList<Produto>();
		criaEstoque();
		// List<Produto> listaDeProdutos = estoque.getListaDeProtudos();
		feira.setListaDeEstoque(estoque.getListaDeProtudos());

		menuInicial();
	}

	public static void menuInicial() {
		System.out.println("\tSistema Efeira");
		System.out.println("0. Fim");
		System.out.println("1. Ver produtos a venda");
		System.out.println("2. Administrar estoque");
		System.out.println("Opcao:");

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				menu1();
				break;

			case 2:
				break;

			case 0:
				break;

			default:
				System.out.println("Opcao invalida.");
			}
		} while (opcao != 0);
	}

	public static void menu1() {
		System.out.println("\n\tSistema Efeira");
		System.out.println("0. Fim");
		System.out.println("1.1 Ver produtos a venda e precos");
		System.out.println("1.2 Comprar produtos (ver lista)");
		System.out.println("1.3 Finalizar compra");
		System.out.println("Opcao:");

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				estoque.listarProdutos();
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			default:
				System.out.println("Opcao invalida.");
			case 0:
				break;
			}
		} while (opcao != 0);

	}

	public static void menu14() {
		System.out.println("\n\tSistema Efeira");
		System.out.println("0. Fim");
		System.out
				.println("1.4.1 Listar Valores totais, valor unitario e subtotal");
		System.out.println("1.4.2 Total da Compra");
		System.out.println("1.4.3 Finalizar compra");
		System.out.println("Opcao:");

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			default:
				System.out.println("Opcaoo invalida.");
			case 0:
				break;
			}
		} while (opcao != 0);

	}

	public static void menu2() {
		System.out.println("\n\tSistema Efeira");
		System.out.println("0. Voltar ao menu Inicial");
		System.out.println("2.1 Organizar Estoque");
		System.out.println("2.2 Rendimento Atual");
		System.out.println("Opcao:");

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				break;

			case 2:
				break;

			default:
				System.out.println("Opcaoo invalida.");
			case 0:
				break;
			}
		} while (opcao != 0);

	}

	public static void menu21() {
		System.out.println("\n\tSistema Efeira");
		System.out.println("0. Fim");
		System.out.println("2.1.1 Adicionar Produto ao estoque");
		System.out.println("2.1.2 Remover produto do estoque");
		System.out.println("2.1.3 Editar produto em estoque");
		System.out.println("Opcao:");

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			default:
				System.out.println("Opcao invalida.");
			case 0:
				break;
			}
		} while (opcao != 0);

	}

	public static void menuDeCompras() {
		System.out.println("\n\tSistema Efeira");
		System.out.println("0. Fim");
		System.out.println("2.1.1 Comprar produto pelo nome");
		System.out.println("2.1.2 Remover produto do estoque");
		System.out.println("2.1.3 Editar produto em estoque");
		System.out.println("Opcao:");

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				estoque.listarProdutos();
				break;

			case 2:
				break;
			default:
				System.out.println("Opcao invalida.");
			case 0:
				break;
			}
		} while (opcao != 0);

	}

	public static void menuComprarItens() {
		System.out.println("\n\tSistema Efeira");
		System.out.println("Digite as informacoes desejadas");
		System.out.println("Opcao:");

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto");
		String name = entrada.next();
		Produto p = estoque.retornaProduto(name);
		
		System.out.println("Digite a quantidade do produto");
		int qtde  = entrada.nextInt();
		
		if (p.getQuantidade() < qtde) {
			System.out.println("Quantidade invalida");
		}else {
			//estoque.alteraQuantidadeEmEstoque(name, qtde);
			//listaDeCompra.add(p);
			listaDeCompra.get(listaDeCompra.indexOf(p)).alteraQuantidade(qtde);
		}
	}

	public void comprarItem(Produto produto) {
		listaDeCompra.add(produto);
	}

	public void listarCompras() {
		for (int i = 0; i < listaDeCompra.size(); i++) {
			System.out.println("Indice: ");
			System.out.println(i + ". Produto: "
					+ listaDeCompra.get(i).getNome() + "| Quantidade: "
					+ listaDeCompra.get(i).getQuantidade() + "| Preco: "
					+ listaDeCompra.get(i).getValor());
		}
	}

	// cria estoque
	public static void criaEstoque() {
		estoque.addProduto("Laran'ja", 2.0, 5);
		estoque.addProduto("Banana", 1.0, 24);
		estoque.addProduto("Maca", 1.5, 20);
		estoque.addProduto("Kiwi", 2.0, 20);
		estoque.addProduto("Melancia", 3.0, 12);
		estoque.addProduto("Mamao", 1.6, 10);
		estoque.addProduto("Castanha", 0.5, 100);
		estoque.addProduto("Abacaxi", 1.0, 12);
		estoque.addProduto("Tomate", 0.8, 36);
		estoque.addProduto("Uva", 1.0, 40);
		estoque.addProduto("Carne", 15.0, 40);
		estoque.addProduto("Frango", 8.0, 80);
		estoque.addProduto("Pera", 1.0, 24);
	}

}
