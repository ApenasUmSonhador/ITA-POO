public class Paciente{
    double peso;
    double altura;

    // Construtor que recebe peso em quilos e altura em metros
    public Paciente(double quilos, double metros){
        peso = quilos;
        altura = metros;
    }

    public String calcularIMC(){
        // Primeiro calculo IMC
        double imc = peso/(altura*altura);

        // Confiro se IMC é menor que 16 kg/m²
        if(imc < 16){
            return "Baixo peso muito grave";
        }

        // Confiro se IMC é entre 16 e 16,99 kg/m²
        if(imc <= 16.99){
            return "Baixo peso grave";
        }

        // Confiro se IMC é entre 17 e 18,49 kg/m²
        if(imc <= 18.49){
            return "Baixo peso";
        }

        // Confiro se IMC é entre 18,50 e 24,99 kg/m²
        if(imc <= 24.99){
            return "Peso normal";
        }

        // Confiro se IMC é entre 25 e 29,99 kg/m²
        if(imc <= 29.99){
            return "Sobrepeso";
        }

        // Confiro se IMC entre 30 e 34,99 kg/m²
        if(imc <= 34.99){
            return "Obesidade grau I";
        }

        // Confiro se IMC entre 35 e 39,99 kg/m²
        if(imc <= 39.99){
            return "Obesidade grau II";
        }

        // Só nos resta ser igual ou maior que 40 kg/m²
        return "Obesidade grau III (obesidade mórbida)";

        /* 
        Claramente daria para melhorar o código com uma lógica de busca binária,
        mas estava com medo de dificultar a compreensão do código.
        */
    } 
}