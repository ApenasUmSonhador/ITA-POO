public class principal {
    public static void main(String[] args) {
        carro c1 = new carro();
        c1.potencia = 10;
        c1.velocidade = 0;
        c1.nome = "Corcel";

        carro c2 = new carro();
        c2.potencia = 15;
        c2.velocidade = 0;
        c2.nome = "Carango";

        c1.acelerar();
        c1.frear();
        c1.imprimir();

        c2.acelerar();
        c2.frear();
        c2.imprimir();
    }
}