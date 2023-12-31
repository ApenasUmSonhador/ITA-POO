package jogoDasPalavrasEmbaralhadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	List<String> ListaDePalavras = new ArrayList<String>();
	private int NumeroDePalavras = 0;
	
	public BancoDePalavras(String arquivo) throws LeituraDeArquivoException {
		this.ListaDePalavras = LerArquivo(arquivo);
	}
	
	public List<String> LerArquivo(String arquivo) throws LeituraDeArquivoException {
		try (Scanner sc = new Scanner(new File(arquivo))) {
			while (sc.hasNextLine()){
			  String s = sc.nextLine();
			  ListaDePalavras.add(s);
			  this.NumeroDePalavras++;
			}
		} catch (FileNotFoundException e) {
	         throw new LeituraDeArquivoException("Arquivo não encontrado", e);
	     } catch (SecurityException e) {
	         throw new LeituraDeArquivoException("Permissão negada ao acessar o arquivo", e);
	     }
		if(this.NumeroDePalavras == 0) {
			Throwable e = null;
			throw new LeituraDeArquivoException("O arquivo está vazio", e);
		}
		return ListaDePalavras;
		}
		
	public String sorteiaPalavra() {
		Random r = new Random();
		String sorteada = this.ListaDePalavras.get(r.nextInt(0,NumeroDePalavras));
		return sorteada;
	}
}