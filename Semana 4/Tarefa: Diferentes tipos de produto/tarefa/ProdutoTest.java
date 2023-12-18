package tarefa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testEqualsAndHashCode() {
        Produto produto1 = new Produto("Camiseta", 1, 20.0);
        Produto produto2 = new Produto("Calça", 1, 30.0);

        assertEquals(produto1, produto2);
        assertEquals(produto1.hashCode(), produto2.hashCode());

        Produto produto3 = new Produto("Sapato", 2, 50.0);

        assertNotEquals(produto1, produto3);
        assertNotEquals(produto1.hashCode(), produto3.hashCode());
    }
}
