package tarefa;

import java.util.HashMap;
import java.util.Map;

class CarrinhoDeCompras {
    private Map<Produto, Integer> produtosNoCarrinho;

    public CarrinhoDeCompras() {
        this.produtosNoCarrinho = new HashMap<>();
    }

    public void adicionaProduto(Produto produto, int quantidade) {
        produtosNoCarrinho.put(produto, produtosNoCarrinho.getOrDefault(produto, 0) + quantidade);
    }

    public void removeProduto(Produto produto, int quantidade) {
        int qtdAtual = produtosNoCarrinho.getOrDefault(produto, 0);
        if (qtdAtual <= quantidade) {
            System.out.println("ERROR Você está removendo além da quantidade de produtos no carrinho!");
            System.out.println("Zeramos o " + produto.getNome() + " em seu carrinho.");
            produtosNoCarrinho.remove(produto);
        } else {
            produtosNoCarrinho.put(produto, qtdAtual - quantidade);
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : produtosNoCarrinho.entrySet()) {
            total += entry.getKey().getPreco() * entry.getValue();
        }
        return total;
    }
}