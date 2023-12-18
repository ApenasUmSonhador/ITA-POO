package tarefa;

public class Autoridade {
	private final String nome;
	private final String sobrenome;
	private final FormatadorNome formatador;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador = formatador;
	}
	
	public String getTratamento() {
		return formatador.FormatarNome(nome, sobrenome);
	}
}
