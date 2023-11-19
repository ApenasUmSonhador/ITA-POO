public class calculadoraBonus {

    public int bonusDoDia = 1;

    public int bonus(usuario u) {
        int multiplicador = bonusDoDia;
        if (u.vip) {
            multiplicador *= 5;
        }
        return multiplicador;
    }
}