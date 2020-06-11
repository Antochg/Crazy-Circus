package crazycircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jouer {
	//Nombre maximum de cartes
	private static final int nbCartes = 24;

	/**
	 * Création des 24 cartes représentant les différentes situations possibles
	 * @param cartes l'ArrayList où sont stockées les cartes
	 */
	public static void creerCarte(ArrayList<Podium> cartes) {
		
		Podium p1 = new Podium();
		p1.pBleu.add("ELEPHANT");
		p1.pBleu.add("LION");
		p1.pBleu.add("OURS");
		cartes.add(p1);
		
		
		Podium p2 = new Podium();
		p2.pBleu.add("ELEPHANT");
		p2.pBleu.add("OURS");
		p2.pBleu.add("LION");
		cartes.add(p2);
		
		Podium p3 = new Podium();
		p3.pBleu.add("LION");
		p3.pBleu.add("OURS");
		p3.pBleu.add("ELEPHANT");
		cartes.add(p3);
		
		Podium p4 = new Podium();
		p4.pBleu.add("LION");
		p4.pBleu.add("ELEPHANT");
		p4.pBleu.add("OURS");
		cartes.add(p4);
		
		Podium p5 = new Podium();
		p5.pBleu.add("OURS");
		p5.pBleu.add("ELEPHANT");
		p5.pBleu.add("LION");
		cartes.add(p5);
		
		Podium p6 = new Podium();
		p6.pBleu.add("OURS");
		p6.pBleu.add("LION");
		p6.pBleu.add("ELEPHANT");
		cartes.add(p6);
		
		Podium p7 = new Podium();
		p7.pRouge.add("ELEPHANT");
		p7.pRouge.add("LION");
		p7.pRouge.add("OURS");
		cartes.add(p7);
		
		Podium p8 = new Podium();
		p8.pRouge.add("ELEPHANT");
		p8.pRouge.add("OURS");
		p8.pRouge.add("LION");
		cartes.add(p8);
		
		Podium p9 = new Podium();
		p9.pRouge.add("LION");
		p9.pRouge.add("OURS");
		p9.pRouge.add("ELEPHANT");
		cartes.add(p9);
		
		Podium p10 = new Podium();
		p10.pRouge.add("LION");
		p10.pRouge.add("ELEPHANT");
		p10.pRouge.add("OURS");
		cartes.add(p10);
		
		Podium p11 = new Podium();
		p11.pRouge.add("OURS");
		p11.pRouge.add("ELEPHANT");
		p11.pRouge.add("LION");
		cartes.add(p11);
		
		Podium p12 = new Podium();
		p12.pRouge.add("OURS");
		p12.pRouge.add("LION");
		p12.pRouge.add("ELEPHANT");
		cartes.add(p12);
		
		Podium p13 = new Podium();
		p13.pBleu.add("ELEPHANT");
		p13.pBleu.add("LION");
		p13.pRouge.add("OURS");
		cartes.add(p13);
		
		Podium p14 = new Podium();
		p14.pBleu.add("ELEPHANT");
		p14.pBleu.add("OURS");
		p14.pRouge.add("LION");
		cartes.add(p14);
		
		Podium p15 = new Podium();
		p15.pBleu.add("LION");
		p15.pBleu.add("OURS");
		p15.pRouge.add("ELEPHANT");
		cartes.add(p15);
		
		Podium p16 = new Podium();
		p16.pBleu.add("LION");
		p16.pBleu.add("ELEPHANT");
		p16.pRouge.add("OURS");
		cartes.add(p16);
		
		Podium p17 = new Podium();
		p17.pBleu.add("OURS");
		p17.pBleu.add("ELEPHANT");
		p17.pRouge.add("LION");
		cartes.add(p17);
		
		Podium p18 = new Podium();
		p18.pBleu.add("OURS");
		p18.pBleu.add("LION");
		p18.pRouge.add("ELEPHANT");
		cartes.add(p18);
		
		Podium p19 = new Podium();
		p19.pBleu.add("ELEPHANT");
		p19.pRouge.add("LION");
		p19.pRouge.add("OURS");
		cartes.add(p19);
		
		Podium p20 = new Podium();
		p20.pBleu.add("ELEPHANT");
		p20.pRouge.add("OURS");
		p20.pRouge.add("LION");
		cartes.add(p20);
		
		Podium p21 = new Podium();
		p21.pBleu.add("LION");
		p21.pRouge.add("OURS");
		p21.pRouge.add("ELEPHANT");
		cartes.add(p21);
		
		Podium p22 = new Podium();
		p22.pBleu.add("LION");
		p22.pRouge.add("ELEPHANT");
		p22.pRouge.add("OURS");
		cartes.add(p22);
		
		Podium p23 = new Podium();
		p23.pBleu.add("OURS");
		p23.pRouge.add("ELEPHANT");
		p23.pRouge.add("LION");
		cartes.add(p23);
		
		Podium p24 = new Podium();
		p24.pBleu.add("OURS");
		p24.pRouge.add("LION");
		p24.pRouge.add("ELEPHANT");
		cartes.add(p24);
	}
	
	/**
	 * Mélange les 24 cartes de l'ArrayList
	 * @param cartes L'ArrayList où sont stockées les cartes
	 */
	public static void melanger(ArrayList<Podium> cartes) {
		//Mélanger la liste
		Collections.shuffle(cartes);
	}
	
	/**
	 * Vérification de la validité d'un ordre saisi par le joueur
	 * @param reponse l'ordre entré par le joueur
	 * @return boolean
	 */
	public static boolean verifOrdre(String reponse) {
		boolean valide = false;
		
		for(int i = 0; i < reponse.length(); i += 2) {
			
			if(reponse.substring(i, i + 2).compareTo("KI") == 0) {
				valide = true;
			}
			else if(reponse.substring(i, i + 2).compareTo("LO") == 0) {
				valide = true;
			}
			else if(reponse.substring(i, i + 2).compareTo("SO") == 0) {
				valide = true;
			}
			else if(reponse.substring(i, i + 2).compareTo("NI") == 0) {
				valide = true;
			}
			else if(reponse.substring(i, i + 2).compareTo("MA") == 0) {
				valide = true;
			}
			else {
				valide = false;
				break;
			}
		}
		return valide;
	}	
	
	/**
	 * Exécute l'ordre saisi par le joueur
	 * @param reponse l'ordre saisi par le joueur
	 * @param p les podium sur lesquels on exécute l'ordre
	 */
	public static void executerOrdre(String reponse, Podium p) {
		
		for(int i = 0; i < reponse.length(); i += 2) {
			
			if(reponse.substring(i, i + 2).compareTo("KI") == 0) {
				Mouvement.KI(p);
			}
			else if(reponse.substring(i, i + 2).compareTo("LO") == 0) {
				Mouvement.LO(p);
			}
			else if(reponse.substring(i, i + 2).compareTo("SO") == 0) {
				Mouvement.SO(p);
			}
			else if(reponse.substring(i, i + 2).compareTo("NI") == 0) {
				Mouvement.NI(p);
			}
			else if(reponse.substring(i, i + 2).compareTo("MA") == 0) {
				Mouvement.MA(p);
			}
		}
	}
}

