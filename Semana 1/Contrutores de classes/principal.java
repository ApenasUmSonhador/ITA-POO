public class principal {
    public static void main(String[] args) {
        carro c1 = new carro(10, "Corcel");

        carro c2 = new carro(15, "Carango");

        c1.acelerar();
        c1.frear();
        c1.imprimir();

        c2.acelerar();
        c2.frear();
        c2.imprimir();
    }
}