package tarefa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeComprasTest {

    @Test
    void testAdicionaProdutoERemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Camiseta", 1, 20.0);
        Produto produto2 = new Produto("Calça", 2, 30.0);

        carrinho.adicionaProduto(produto1, 3);
        carrinho.adicionaProduto(produto2, 2);
        assertEquals(120, carrinho.calcularValorTotal());

        carrinho.removeProduto(produto1, 2);
        assertEquals(80, carrinho.calcularValorTotal());

        carrinho.removeProduto(produto2, 2);
        assertEquals(20, carrinho.calcularValorTotal());

        carrinho.removeProduto(produto1, 1);
        assertEquals(0, carrinho.calcularValorTotal());
    }
}
