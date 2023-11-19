public class carro {
    int velocidade;
    int potencia;
    String nome;

    void acelerar() {
        velocidade += potencia;
    }

    void frear() {
        velocidade /= 2;
    }

    int getvelocidade() {
        return velocidade;
    }

    void imprimir() {
        System.out.println("O carro " + nome + " está na velocidade " + getvelocidade() + "Km/h");
    }
}