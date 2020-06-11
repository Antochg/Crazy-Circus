package crazycircus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Affichage {
	
	/**
	 * Affiche le podium du début de la manche et le podium à atteindre
	 * @param pInitial le podium initial
	 * @param pFinal le podium final
	 */
	public static final void afficherJeu(Podium pInitial, Podium pFinal) {
	
		for(int i = 3; i > 0; i--) {
			if(i <= pInitial.pBleu.size()) {
				if(pInitial.pBleu.get(i-1).equals("OURS")) {
					System.out.print("  " + pInitial.pBleu.get(i-1) + "  ");
				}
				if(pInitial.pBleu.get(i-1).equals("LION")) {
					System.out.print("  " + pInitial.pBleu.get(i-1) + "  ");
				}
				if(pInitial.pBleu.get(i-1).equals("ELEPHANT")) {
					System.out.print(pInitial.pBleu.get(i-1));
				}
			}
			else {
				System.out.print("        ");
			}
			
			if(i <= pInitial.pRouge.size()) {
				if(pInitial.pRouge.get(i-1).equals("OURS")) {
					System.out.print("   " + pInitial.pRouge.get(i-1) + "         ");
				}
				else if(pInitial.pRouge.get(i-1).equals("LION")) {
					System.out.print("   " + pInitial.pRouge.get(i-1) + "         ");
				}
				else if(pInitial.pRouge.get(i-1).equals("ELEPHANT")) {
					System.out.print(" " + pInitial.pRouge.get(i-1) + "       ");
				}
			}
			else {
				System.out.print("                ");
			}
			
			if(i <= pFinal.pBleu.size()) {
				if(pFinal.pBleu.get(i-1).equals("OURS")) {
					System.out.print("  " + pFinal.pBleu.get(i-1) + "  ");
				}
				else if(pFinal.pBleu.get(i-1).equals("LION")) {
					System.out.print("  " +pFinal.pBleu.get(i-1) + "  ");
				}
				else if(pFinal.pBleu.get(i-1).equals("ELEPHANT")) {
					System.out.print(pFinal.pBleu.get(i-1));
				}
			}
			else {
				System.out.print("        ");
			}
			
			if(i <= pFinal.pRouge.size()) {
				if(pFinal.pRouge.get(i-1).equals("OURS")) {
					System.out.println("   " + pFinal.pRouge.get(i-1));
				}
				else if(pFinal.pRouge.get(i-1).equals("LION")) {
					System.out.println("   " + pFinal.pRouge.get(i-1));
				}
				else if(pFinal.pRouge.get(i-1).equals("ELEPHANT")) {
					System.out.println(" " + pFinal.pRouge.get(i-1));
				}
			}
			else {
				System.out.println("        ");
			}
		}
		afficherRegles();
	}
	
	/**
	 * Affiche les règles du jeu
	 */
	public static final void afficherRegles() {
		System.out.println("  ----     ----    ==>    ----     ----");
		System.out.println("  BLEU     ROUGE          BLEU     ROUGE\n");
		System.out.println("------------------------------------------");
		System.out.println("KI : BLEU --> ROUGE    NI : BLEU  ^");
		System.out.println("LO : BLEU <-- ROUGE    MA : ROUGE ^");
		System.out.println("SO : BLEU <-> ROUGE\n");
	}
	
	/**
	 * Affiche le classement des joueurs du premier au dernier
	 * @param listeJoueur l'ArrayList de joueurs
	 */
	public static final void afficherClassement(ArrayList<Joueur> listeJoueur) {
		for(int i = 0; i < listeJoueur.size(); i++) {
			if(i == 0) {
				System.out.println("\nLe " + (i+1) + "er est " + listeJoueur.get(i).getNom() +
						" avec " + listeJoueur.get(i).getScore() + " points !");
			}
			else {
				System.out.println("Le " + (i+1) + "ème est " + listeJoueur.get(i).getNom() +
						" avec " + listeJoueur.get(i).getScore() + " points !");
			}
		}
	}
}
