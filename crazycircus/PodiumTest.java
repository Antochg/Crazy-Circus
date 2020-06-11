package crazycircus;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PodiumTest {

	@Test
	public void testComparer() {
		Podium p1 = new Podium();
		p1.pBleu.add("ELEPHANT");
		p1.pBleu.add("OURS");
		p1.pRouge.add("LION");
		
		Podium p2 = new Podium();
		p2.pBleu.add("ELEPHANT");
		p2.pBleu.add("OURS");
		p2.pRouge.add("LION");
		
		assertTrue(Podium.comparer(p1, p2) == true);
		
		Mouvement.KI(p2);
		
		assertTrue(Podium.comparer(p1, p2) == false);
	}
}
