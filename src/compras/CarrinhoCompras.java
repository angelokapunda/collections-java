package compras;

import list.ListaTarefas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    List<Item> itens = new ArrayList<>();

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionaCarrinho(String nome, double preco, int quantidade) {
        itens.add(new Item(nome,preco,quantidade));
    }

    public void removeDoCarrinho(String nomes) {
        List<Item> sairDoCarrinho = new ArrayList<>();
        for (Item nome : itens) {
            if (nome.getNome().equalsIgnoreCase(nomes)) {
                sairDoCarrinho.add(nome);
            }
        }
        itens.removeAll(sairDoCarrinho);
    }

    public int quantidadeItens() {
        return itens.size();
    }

    public void descricaoProduto() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println("O numero de itens no carrinho: " + carrinhoCompras.quantidadeItens());

        carrinhoCompras.adicionaCarrinho("Cuca", 15.56, 5);
        carrinhoCompras.adicionaCarrinho("Nocal", 43.56, 2);
        carrinhoCompras.adicionaCarrinho("Cuca", 32.56, 7);
        carrinhoCompras.adicionaCarrinho("Eka", 1.56, 11);
        System.out.println("O numero de itens no carrinho: " + carrinhoCompras.quantidadeItens());

        carrinhoCompras.removeDoCarrinho("Eka");
        System.out.println("O numero de itens no carrinho: " + carrinhoCompras.quantidadeItens());

        carrinhoCompras.descricaoProduto();
    }
}
