public class registroPontos {

    private calculadoraBonus bonus;

    public registroPontos(calculadoraBonus cb) {
        bonus = cb;
    }

    public void fazerComentario(usuario u) {
        u.pontos += 3 * bonus.bonus(u);
    }

    public void criarTopico(usuario u) {
        u.pontos += 5 * bonus.bonus(u);
    }

    public void darlike(usuario u) {
        u.pontos += 1 * bonus.bonus(u);
    }
}