import java.util.HashMap;

public class CarrinhoDeCompras {
    private final HashMap<Pizza, Integer> pizzas = new HashMap<>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.getPreco() > 0 && pizza.getIngredientes().size() > 0) {
            pizzas.merge(pizza, 1, Integer::sum);
        } else {
            System.out.println("Não é possível adicionar uma pizza sem ingredientes.");
        }
    }

    public int getValorTotal() {
        int total = 0;
        for (Pizza pizza : pizzas.keySet()) {
            total += pizza.getPreco() * pizzas.get(pizza);
        }
        return total;
    }
}
