package tarefaFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BancoDePalavras {
	List<String> ListaDePalavras = new ArrayList<>();
	
	public void leituraDoArquivo(){
        // Caminho do arquivo com as palavras a serem lidas
        final String caminhoArquivo = "palavras.txt";

        try {
            // Criação do objeto File com o caminho do arquivo
            File arquivo = new File(caminhoArquivo);

            // Criação de um objeto FileReader para ler o arquivo
            FileReader fileReader = new FileReader(arquivo);

            // Criação de um objeto BufferedReader para ler texto de um arquivo
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            
            // Lê cada linha do arquivo enquanto houver conteúdo
            while ((linha = bufferedReader.readLine()) != null) {
                ListaDePalavras.add(linha);
            }

            // Fechamento do BufferedReader após a leitura do arquivo
            bufferedReader.close();

        } catch (IOException e) {
            // Tratamento de exceções caso ocorra algum erro na leitura do arquivo
            e.printStackTrace();
        }
    }
	
	public String getNovaPalavra() {
		int i = 0;
		String sorteada = ListaDePalavras.get(i);
		ListaDePalavras.remove(i);
		return sorteada;
	}
}