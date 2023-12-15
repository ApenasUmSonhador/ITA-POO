import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {

    private CarrinhoDeCompras carrinho;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizzaSemIngredientes;

    @BeforeEach
    public void setup() {
        carrinho = new CarrinhoDeCompras();
        pizza1 = new Pizza();
        pizza2 = new Pizza();
        pizzaSemIngredientes = new Pizza();

        // Configurar ingredientes para as pizzas 1 e 2
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");

        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Presunto");
        pizza2.adicionaIngrediente("Tomate");
    }

    @Test
    public void testAdicionaPizzaComIngredientes() {
        carrinho.adicionaPizza(pizza1);
        assertEquals(15, carrinho.getValorTotal());
    }

    @Test
    public void testAdicionaDuasPizzasDiferentes() {
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        assertEquals(35, carrinho.getValorTotal());
    }

    @Test
    public void testAdicionaPizzaSemIngredientes() {
        carrinho.adicionaPizza(pizzaSemIngredientes);
        assertEquals(0, carrinho.getValorTotal());
    }

    @Test
    public void testAdicionaPizzaSemPreco() {
        Pizza pizzaSemPreco = new Pizza(); // Pizza sem ingredientes e sem preço
        carrinho.adicionaPizza(pizzaSemPreco);
        assertEquals(0, carrinho.getValorTotal());
    }
}
