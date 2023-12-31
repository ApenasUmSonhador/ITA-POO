package jogoDasPalavrasEmbaralhadas;

public interface MecanicaDoJogo {
	public static void inicioDoJogo(int chances, Embaralhador embaralhador, String palavraParaAdivinhar) {
		String palavraEmbaralhada = embaralhador.embaralhar(palavraParaAdivinhar);
        System.out.println("A palavra embaralhada é: " + palavraEmbaralhada);
        System.out.println("Você tem " + chances + " chance(s) para adivinhar. Qual é a palavra? ");
}
	public static boolean chute(String palpite, String palavraParaAdivinhar, int chances) {
	        if (palpite.equals(palavraParaAdivinhar)) {
	            System.out.println("Parabéns! Você acertou!");
	            return true;
	        } else {
	            chances--;
	            if (chances > 0) {
	                System.out.println("Resposta incorreta. Tente novamente.");
	            } else {
	                System.out.println("Suas chances acabaram. A palavra correta era: " + palavraParaAdivinhar);
	        }
	    }
		return true;
	}
	
	public abstract int selecionaChances();
}
