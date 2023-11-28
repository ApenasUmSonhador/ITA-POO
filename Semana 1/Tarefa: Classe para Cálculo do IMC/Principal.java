public class Principal {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(48, 1.63);
        Paciente paciente2 = new Paciente(74, 1.68);
        Paciente paciente3 = new Paciente(59, 1.70);

        System.out.println("Paciente 1:");
        System.out.println("Diagnóstico: " + paciente1.calcularIMC());
        System.out.println("----------------------------------------");
        System.out.println("Paciente 2:");
        System.out.println("Diagnóstico: " + paciente2.calcularIMC());
        System.out.println("----------------------------------------");
        System.out.println("Paciente 3:");
        System.out.println("Diagnóstico: " + paciente3.calcularIMC());
    }
}