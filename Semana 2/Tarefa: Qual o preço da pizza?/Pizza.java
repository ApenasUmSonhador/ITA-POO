import java.util.HashMap;

public class Pizza {
    public HashMap<String, Integer> ingredientes = new HashMap<>();
    public static HashMap<String, Integer> ingredientesTotais = new HashMap<>();

    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
        ingredientes.merge(ingrediente, 1, Integer::sum);
    }

    public static void contabilizaIngrediente(String ingrediente) {
        ingredientesTotais.merge(ingrediente, 1, Integer::sum);
    }

    public int getPreco() {
        int totalIngredientes = ingredientes.size();
        if (totalIngredientes <= 2) {
            return 15;
        } else if (totalIngredientes >= 3 && totalIngredientes <= 5) {
            return 20;
        }
        return 23;
    }

    public static HashMap<String, Integer> getIngredientesTotais() {
        return ingredientesTotais;
    }
}
