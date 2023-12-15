import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @BeforeEach
    public void setup() {
        Pizza.ingredientesTotais.clear();
    }

    @Test
    public void testAdicionaIngrediente() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        assertEquals(1, pizza.ingredientes.get("Queijo"));
        assertEquals(1, Pizza.ingredientesTotais.get("Queijo"));
    }

    @Test
    public void testContabilizaIngrediente() {
        Pizza.contabilizaIngrediente("Tomate");
        assertEquals(1, Pizza.ingredientesTotais.get("Tomate"));
    }

    @Test
    public void testPrecoComDoisIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        assertEquals(15, pizza.getPreco());
    }

    @Test
    public void testPrecoComCincoIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Molho");
        pizza.adicionaIngrediente("Presunto");
        pizza.adicionaIngrediente("Azeitona");
        assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testPrecoComMaisDeCincoIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Molho");
        pizza.adicionaIngrediente("Presunto");
        pizza.adicionaIngrediente("Azeitona");
        pizza.adicionaIngrediente("Cebola");
        assertEquals(23, pizza.getPreco());
    }
}
