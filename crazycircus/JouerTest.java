package crazycircus;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class JouerTest {
	
	@Test
	public void testVerifOrdre() {
		String reponse1 = "KILOSONIMA";
		assertTrue(Jouer.verifOrdre(reponse1) == true);
		
		String reponse2 = "KOLI";
		assertTrue(Jouer.verifOrdre(reponse2) == false);
	}
	
	@Test
	public void testExecuterOrdre() {
		String reponse = "KI";
		assertTrue(Jouer.verifOrdre(reponse) == true);
		
		Podium p = new Podium();
		p.pBleu.add("ELEPHANT");
		p.pBleu.add("OURS");
		p.pRouge.add("LION");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "OURS");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "LION");
		Jouer.executerOrdre(reponse, p);
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "ELEPHANT");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "OURS");
	}
}
