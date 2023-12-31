package jogoDasPalavrasEmbaralhadas;

import java.util.Scanner;

public class Principal {
	@SuppressWarnings("resource")
	public static String LerEntrada() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().strip().toLowerCase();
	}
	
	public static MecanicaDoJogo SelecionaMecanica() {
		MecanicaDoJogo mecanica;
		System.out.println("Em que modo deseja jogar?");
		System.out.println("[1] Clássico");
		System.out.println("[2] Hardcore");
		FabricaMecanicaDoJogo f = new FabricaMecanicaDoJogo(LerEntrada());
		mecanica = f.EscolheMecanica();
		return mecanica;
	}
	
	public static void main(String[] args) throws LeituraDeArquivoException {
		String chute;
		MecanicaDoJogo mecanica;
		boolean algoritmo = true;
		// TODO: Coloque o devido local do arquivo!
		BancoDePalavras banco = new BancoDePalavras("C:\\Users\\Dell\\Desktop\\jogoDasPalavrasEmbaralhadas\\src\\jogoDasPalavrasEmbaralhadas\\palavras.txt");
		System.out.println("Bem vindo ao jogo das palavras embaralhadas!");
		
		int chances;
		boolean comChances;
		String PalavraParaAdivinhar;
		Embaralhador e;
		while(algoritmo) {
			PalavraParaAdivinhar = banco.sorteiaPalavra();
			e = FabricaEmbaralhadores.EscolheEmbaralhador();
			mecanica = SelecionaMecanica();
			chances = mecanica.selecionaChances();
			comChances = true;
			MecanicaDoJogo.inicioDoJogo(chances, e, PalavraParaAdivinhar);
			while(comChances) {
				chute = LerEntrada();
				comChances = MecanicaDoJogo.chute(chute, PalavraParaAdivinhar, chances);
				chances--;
				if (chances == 0 || chute.equals(PalavraParaAdivinhar)) {
					comChances = false;
				}
			}
			System.out.println("Deseja continuar jogando?");
			System.out.println("[S]im");
			System.out.println("[N]ao");
			String entrada = LerEntrada();
			if (!entrada.equals("s") && !entrada.equals("S")) {
				algoritmo = false;
			}
		}
		System.out.println("Obrigado por jogar!");
	}
}