public class ContaCorrente {

    int saldo;

    public int sacar(int valor) {
        if (valor > saldo) {
            return 0;
        }
        saldo -= valor;
        return valor;
    }

    public void depositar(int valor) {
        saldo += valor;
    }
}