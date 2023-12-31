package jogoDasPalavrasEmbaralhadas;

public class LeituraDeArquivoException extends Exception {
	/**
	 * Excessao dos metodos da classe BancoDePalavras
	 */
	private static final long serialVersionUID = 1L;

	public LeituraDeArquivoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
