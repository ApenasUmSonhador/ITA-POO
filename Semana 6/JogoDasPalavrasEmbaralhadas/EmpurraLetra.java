public class EmpurraLetra implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		final String[] array = palavra.split(palavra);
		String empurrada = array[palavra.length()-1];
		for(int i=0; i<palavra.length() -1; i++) {
			empurrada += array[i];
		}
		return empurrada;
	}

}
