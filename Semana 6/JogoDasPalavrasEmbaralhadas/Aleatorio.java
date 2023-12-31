package jogoDasPalavrasEmbaralhadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aleatorio implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {
        String aleatoria = "";
        String[] vetor = palavra.split(""); // Separador vazio para obter caracteres individuais
        List<String> array = new ArrayList<String>();
        Random r = new Random();

        for (int i = 0; i < palavra.length(); i++) {
            array.add(vetor[i]);
        }

        while (!array.isEmpty()) {
            int index = r.nextInt(array.size());
            aleatoria = aleatoria.concat(array.get(index));
            array.remove(index);
        }
        
        if(aleatoria.equals(palavra)) {
        	return embaralhar(palavra);
        }
        return aleatoria;
    }
}
