package crazycircus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class JoueurTest {
	
	@Test
	public void testAjouterPoint() {
		Joueur j = new Joueur("G�rome");
		j.ajouterPoint();
		assertTrue(j.getScore() == 1);
	}
	
	@Test
	public static void testCreerJoueur() {
		ArrayList<Joueur> listeJoueur  = new ArrayList<>();
		String nomJoueur = "G�r�me";
		Joueur.creerJoueur(listeJoueur, nomJoueur);
		assertEquals("G�r�me",listeJoueur.get(0).getNom());
	}
	
	@Test
	public void testSetADejaJoue() {
		Joueur j = new Joueur("G�rome");
		j.setADejaJoue();
		assertTrue(j.getADejaJoue() == true);
	}
	
	@Test
	public void testSetAPasJoue() {
		Joueur j = new Joueur("G�rome");
		j.setAPasJoue();
		assertTrue(j.getADejaJoue() == false);
	}
	
	@Test
	public void testIndiceJoueur() {
		ArrayList<Joueur> listeJoueur  = new ArrayList<>();
		String nomJoueur1 = "G�r�me";
		Joueur.creerJoueur(listeJoueur, nomJoueur1);
		String nomJoueur2 = "Patrice";
		Joueur.creerJoueur(listeJoueur, nomJoueur2);
		assertTrue(Joueur.indiceJoueur(listeJoueur, nomJoueur1) == 0);
		assertTrue(Joueur.indiceJoueur(listeJoueur, nomJoueur2) == 1);
	}
	
	@Test
	public void testVerifJoueur() {
		ArrayList<Joueur> listeJoueur  = new ArrayList<>();
		String nomJoueur1 = "G�r�me";
		Joueur.creerJoueur(listeJoueur, nomJoueur1);
		String nomJoueur2 = "Patrice";
		Joueur.creerJoueur(listeJoueur, nomJoueur2);
		assertTrue(Joueur.verifJoueur(listeJoueur, "G�r�me") == true);
		assertTrue(Joueur.verifJoueur(listeJoueur, "Patrice") == true);
	}
	
	@Test
	public void testReinitialiserADejaJoue() {
		ArrayList<Joueur> listeJoueur  = new ArrayList<>();
		String nomJoueur1 = "G�r�me";
		Joueur.creerJoueur(listeJoueur, nomJoueur1);
		String nomJoueur2 = "Patrice";
		Joueur.creerJoueur(listeJoueur, nomJoueur2);
		listeJoueur.get(0).setADejaJoue();
		listeJoueur.get(1).setADejaJoue();
		assertTrue(listeJoueur.get(0).getADejaJoue() == true);
		assertTrue(listeJoueur.get(1).getADejaJoue() == true);
		Joueur.reinitialiserADejaJoue(listeJoueur);
		assertTrue(listeJoueur.get(0).getADejaJoue() == false);
		assertTrue(listeJoueur.get(1).getADejaJoue() == false);
	}
	
	@Test
	public void testTrierClassement() {
		ArrayList<Joueur> listeJoueur  = new ArrayList<>();
		String nomJoueur1 = "G�r�me";
		Joueur.creerJoueur(listeJoueur, nomJoueur1);
		String nomJoueur2 = "Patrice";
		Joueur.creerJoueur(listeJoueur, nomJoueur2);
		listeJoueur.get(1).ajouterPoint();
		Joueur.trierClassement(listeJoueur);
		assertEquals(listeJoueur.get(0).getNom(), "Patrice");
		assertEquals(listeJoueur.get(1).getNom(), "G�r�me");
	}
}
