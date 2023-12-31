package jogoDasPalavrasEmbaralhadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {
	public static Embaralhador EscolheEmbaralhador() {
		List<Embaralhador> ListaDeEmbaralhadores = new ArrayList<Embaralhador>();
		ListaDeEmbaralhadores.add(new Inverter());
		ListaDeEmbaralhadores.add(new Aleatorio());
		Random r = new Random();
		Embaralhador embaralhador = ListaDeEmbaralhadores.get(r.nextInt(0,2));
		return embaralhador;
	}
}
