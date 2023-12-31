package jogoDasPalavrasEmbaralhadas;

public class FabricaMecanicaDoJogo {
	private String entrada;
	public FabricaMecanicaDoJogo(String entrada){
		this.entrada = entrada;
	}
	public MecanicaDoJogo EscolheMecanica() {
		switch(entrada) {
		case("1"):
			MecanicaDoJogo classico = new Classico();
			return classico;
		case("2"):
			MecanicaDoJogo hardcore = new Hardcore();
			return hardcore;
		}
		System.out.println("Digite apenas os números das opções!");
		return null;
	}
}
