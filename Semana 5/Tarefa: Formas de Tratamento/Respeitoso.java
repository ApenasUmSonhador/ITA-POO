package tarefa;

public class Respeitoso implements FormatadorNome {
	private final String tratamento;
	
	public Respeitoso(String genero) {
		if(genero ==  "Feminino" || genero == "F") {
			this.tratamento = "Sra.";
		}
		else {
			this.tratamento = "Sr.";
		}
	}
	@Override
	public String FormatarNome(String nome, String sobrenome) {
		return tratamento + " " + sobrenome;
	}

}
