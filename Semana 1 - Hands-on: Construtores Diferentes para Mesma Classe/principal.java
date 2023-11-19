public class principal {

    public static void main(String[] args) {
        compra c1 = new compra(1000);
        compra c2 = new compra(4, 250);

        System.out.println("Em c1, o valor total é: " + c1.getValorTotal());
        System.out.println("Em c1, o número de parcelas total é: " + c1.getNumeroParcelas());
        System.out.println("Cada uma no valor de: " + c1.getValorParcela());

        System.out.println("Em c2, o valor total é: " + c2.getValorTotal());
        System.out.println("Em c2, o número de parcelas total é: " + c2.getNumeroParcelas());
        System.out.println("Cada uma no valor de: " + c2.getValorParcela());
    }
}