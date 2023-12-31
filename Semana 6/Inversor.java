public class Inversor implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String inverso = "";
		final String[] array = palavra.split(palavra);
		for(int i = 1; i <= palavra.length(); i++) {
			inverso += array[palavra.length()-i];
		}
		return inverso;
	}

}
