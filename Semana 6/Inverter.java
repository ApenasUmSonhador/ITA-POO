package jogoDasPalavrasEmbaralhadas;

public class Inverter implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String inversa = "";
		for(int i = palavra.length() - 1; i >= 0; i--) {
			inversa += (palavra.charAt(i));
		}
		return inversa;
	}
}
