public class teste {

    public static void main(String[] args) {
        calculadoraBonus cb = new calculadoraBonus();
        registroPontos rp = new registroPontos(cb);

        // Sem o vip
        usuario u = new usuario();
        u.nome = "Leticia";
        rp.criarTopico(u);
        System.out.println("A quantidade de pontos do usuário u é de: " + u.pontos);

        // Com o vip
        usuario uvip = new usuario();
        uvip.vip = true;
        uvip.nome = "Leticia";
        rp.criarTopico(uvip);
        System.out.println("A quantidade de pontos do usuário uvip é de: " + uvip.pontos);
    }
}