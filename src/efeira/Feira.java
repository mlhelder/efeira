/**
 * 
 */
package efeira;

import java.util.ArrayList;
import java.util.List;

import usuarios.Admin;
import usuarios.Cadastro;
import usuarios.Cliente;
import efeira.Estoque;

/**
 * @author Carolyne
 *
 */
public class Feira {
	// lista de usuarios do sistema
	private List<Cadastro> listaUsuarios;

	// lista de historico de vendas
	private List<Produto> listaHistorico;

	// lista de produtos
	private List<Produto> listaDeProdutos;

	// estoque da feira
	private Estoque estoque;

	public Feira() {
		listaUsuarios = new ArrayList<Cadastro>();
		listaDeProdutos = new ArrayList<Produto>();
		listaHistorico = new ArrayList<Produto>();

		criaUsuariosSistemas();
	}

	// metodo para chamar na inicialização do sistema
	public void criaUsuariosSistemas() {
		// cria admin
		Admin adm = new Admin("admin", "admin");

		// cria cliente
		Cliente cliente = new Cliente("cliente", "cliente");

		// add na lista do sistema
		listaUsuarios.add(adm);
		listaUsuarios.add(cliente);
	}

	public Double totalDeGastos() {
		// rendimento do sistema
		double totalGasto = 0;

		totalGasto = valorDeVendas() + valorDoEstoque();

		return totalGasto;
	}

	
	public void setListaDeEstoque(List lista){
		listaDeProdutos = lista;
	}
	
	public List getListaDeEstoque() {
		return listaDeProdutos;
	}
	
	public double valorDoEstoque() {
		// rendimento do estoque
		double rendimentoEstoque = 0;

		// varre a lista de produtos e multiplica a quantidade em estoque pelos
		// valores do mesmos
		if (listaDeProdutos.size() != 0 && listaDeProdutos != null) {
			for (int i = 0; i < listaDeProdutos.size(); i++) {
				rendimentoEstoque += listaDeProdutos.get(i).getValor() * listaDeProdutos.get(i).getQuantidade();
			}
		}
		return rendimentoEstoque;
	}

	public double valorDeVendas() {
		// rendimento do historico
		double rendimentoHistorico = 0;

		// varre a lista de produtos e multiplica a quantidade em estoque pelos
		// valores do mesmos
		if (listaHistorico.size() != 0 && listaHistorico != null) {
			for (int j = 0; j < listaHistorico.size(); j++) {
				rendimentoHistorico += listaHistorico.get(j).getValor() * listaHistorico.get(j).getQuantidade();
			}
		}

		return rendimentoHistorico;
	}

	// calcula o lucro do estabelecimento
	public double calculaLucro() {
		return valorDeVendas() - totalDeGastos();
	}

	// calcula a porcentagem total de lucro
	public double porcentagemTotalDeLucro() {
		// O lucro (em %), calculado por: lucro (em Reais) / valor da compra de
		// todos os produtos
		return calculaLucro() / totalDeGastos();
	}

}
