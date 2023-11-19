public class principal {

    public static void main(String[] args) {
        somador s1 = new somador();
        s1.nome = "Somador 1";
        somador s2 = new somador();
        s2.nome = "Somador 2";
        somador s3 = new somador();
        s3.nome = "Somador 3";

        for (int i = 0; i < 3; i++) {
            s1.somar();
            s2.somar();
            s3.somar();
        }

        s1.imprimir();
        s2.imprimir();
        s3.imprimir();
    }
}