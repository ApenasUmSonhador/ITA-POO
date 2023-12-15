public class Principal {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Pepperoni");
        pizza2.adicionaIngrediente("Cebola");
        pizza2.adicionaIngrediente("Pimentão");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Frango");
        pizza3.adicionaIngrediente("Catupiry");
        pizza3.adicionaIngrediente("Milho");
        pizza3.adicionaIngrediente("Bacon");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        System.out.println("Total do CarrinhoDeCompra: R$" + carrinho.getValorTotal());

        System.out.println("Quantidade utilizada de cada ingrediente:");
        for (String ingrediente : Pizza.getIngredientesTotais().keySet()) {
            System.out.println(ingrediente + ": " + Pizza.getIngredientesTotais().get(ingrediente));
        }
    }
}
