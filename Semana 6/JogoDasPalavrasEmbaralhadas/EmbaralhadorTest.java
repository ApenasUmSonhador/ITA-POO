package jogoDasPalavrasEmbaralhadas;

import org.junit.Assert;
import org.junit.Test;

public class EmbaralhadorTest {

	@Test
	public void testAleatorio() {
		Embaralhador a = new Aleatorio();
		Assert.assertNotEquals("teste", a.embaralhar("teste"));
	}
	
	@Test
	public void testInverter() {
		Embaralhador i = new Inverter();
		Assert.assertEquals("etset", i.embaralhar("teste"));
	}
}
