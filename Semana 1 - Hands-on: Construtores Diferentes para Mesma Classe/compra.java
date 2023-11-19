public class compra {

    int valorTotal;
    int numeroParcelas;

    // a vista
    public compra(int valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

    // parcelado
    public compra(int qtdParcelas, int valorParcela) {
        numeroParcelas = qtdParcelas;
        valorTotal = qtdParcelas * valorParcela;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela() {
        return valorTotal / numeroParcelas;
    }
}