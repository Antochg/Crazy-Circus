package crazycircus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class MouvementTest {

	@Test
	public void testKI() {
		Podium p = new Podium();
		p.pBleu.add("ELEPHANT");
		p.pBleu.add("OURS");
		p.pRouge.add("LION");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "OURS");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "LION");
		Mouvement.KI(p);
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "ELEPHANT");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "OURS");
	}
	
	@Test
	public void testLO() {
		Podium p = new Podium();
		p.pBleu.add("ELEPHANT");
		p.pRouge.add("OURS");
		p.pRouge.add("LION");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "LION");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "ELEPHANT");
		Mouvement.LO(p);
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "OURS");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "LION");
	}
	
	@Test
	public void testSO() {
		Podium p = new Podium();
		p.pBleu.add("ELEPHANT");
		p.pBleu.add("OURS");
		p.pRouge.add("LION");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "LION");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "OURS");
		Mouvement.SO(p);
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "OURS");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "LION");
	}
	
	@Test
	public void testNI() {
		Podium p = new Podium();
		p.pBleu.add("ELEPHANT");
		p.pBleu.add("OURS");
		p.pRouge.add("LION");
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "OURS");
		assertTrue(p.pBleu.get(0) == "ELEPHANT");
		Mouvement.NI(p);
		assertTrue(p.pBleu.get(p.pBleu.size()-1) == "ELEPHANT");
		assertTrue(p.pBleu.get(0) == "OURS");
	}
	
	@Test
	public void testMA() {
		Podium p = new Podium();
		p.pBleu.add("ELEPHANT");
		p.pRouge.add("OURS");
		p.pRouge.add("LION");
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "LION");
		assertTrue(p.pRouge.get(0) == "OURS");
		Mouvement.MA(p);
		assertTrue(p.pRouge.get(p.pRouge.size()-1) == "OURS");
		assertTrue(p.pRouge.get(0) == "LION");
	}
}
