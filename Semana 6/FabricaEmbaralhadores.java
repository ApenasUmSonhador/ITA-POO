package tarefaFinal;

public class FabricaEmbaralhadores {
	private final String palavra;
	private final Embaralhador embaralhador;
	
	public FabricaEmbaralhadores(String palavra, Embaralhador embaralhador) {
		this.palavra = palavra;
		this.embaralhador = embaralhador;
	}
	
	public String getEmbaralhada() {
		return embaralhador.embaralhar(palavra);
	}
}
