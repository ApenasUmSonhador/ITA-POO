package tarefa;

public class ComTitulo implements FormatadorNome {
	private final String titulo;
	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String FormatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}

}
