public class carro {
    int velocidade;
    int potencia;
    String nome;

    carro(int potencia, String nome) {
        this.potencia = potencia;
        this.nome = nome;
        velocidade = 0;
    }

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