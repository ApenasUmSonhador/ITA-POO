package tarefa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoComTamanhoTest {

    @Test
    void testEqualsAndHashCode() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", 1, 20.0, "M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", 1, 20.0, "G");

        assertNotEquals(produto1, produto2);
        assertNotEquals(produto1.hashCode(), produto2.hashCode());

        ProdutoComTamanho produto3 = new ProdutoComTamanho("Calça", 1, 30.0, "M");

        assertEquals(produto1, produto3);
        assertEquals(produto1.hashCode(), produto3.hashCode());
    }
}
