public class ContaEspecial extends ContaCorrente {

    int limite;

    ContaEspecial(int limite) {
        this.limite = limite;
    }

    public int sacar(int valor) {
        if (valor > limite + saldo) {
            return 0;
        }
        saldo -= valor;
        return valor;
    }
}