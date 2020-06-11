package crazycircus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Joueur {
	
	private String nom;
	private int nbPoint;
	private boolean aDejaJoue = false;
	
	
	public Joueur(String nomJoueur) {
		this.nom = nomJoueur;
		this.nbPoint = 0;
		this.aDejaJoue = false;
	}

	/**
	 * Affecte un nom à un joueur et le range dans une ArrayList
	 * @param listeJoueur l'ArrayList de joueurs
	 * @param nomJoueur le nom du joueur
	 */
	public static void creerJoueur(ArrayList<Joueur> listeJoueur, String nomJoueur) {
		Joueur j = new Joueur(nomJoueur);
		listeJoueur.add(j);
	}
	
	public void ajouterPoint() {
		nbPoint++;
	}
	
	public int getScore() {
		return nbPoint;
	}
	
	public String getNom() {
		return nom;
	}
	
	public boolean getADejaJoue() {
		return aDejaJoue;
	}
	
	/**
	 * Met le joueur dans l'état "à déjà joué"
	 */
	public void setADejaJoue() {
		aDejaJoue = true;
	}
	
	/**
	 * Met le joueur dans l'état "n'a pas joué"
	 */
	public void setAPasJoue() {
		aDejaJoue = false;
	}
	
	/**
	 * Récupère l'indice d'un joueur de l'ArrayList avec son nom
	 * @param listeJoueur l'ArrayList de joueurs
	 * @param nomJoueur le nom du joueur 
	 * @return i l'indice du joueur
	 */
	public static int indiceJoueur(ArrayList<Joueur> listeJoueur, String nomJoueur) {
		int i = 0;
		while(i < listeJoueur.size()) {
			if(nomJoueur.equals(listeJoueur.get(i).nom)) {
				break;
			}
		i++;
		}
		return i;
	}
	
	/**
	 * Vérification de l'existance d'un joueur
	 * @param listeJoueur l'ArrayList dans lequel on vérifie
	 * @param nom Le nom du joueur à vérifier
	 * @return boolean
	 */
	public static boolean verifJoueur(ArrayList<Joueur> listeJoueur, String nom) {
		
		boolean existe = false;
		for(int i = 0; i < listeJoueur.size(); i++) {
			if(nom.equals(listeJoueur.get(i).nom)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	/**
	 * Remet tous les joueurs d'un l'ArrayList à l'état "A pas jouer"
	 * @param listeJoueur L'ArrayList de joueurs
	 */
	public static void reinitialiserADejaJoue(ArrayList<Joueur> listeJoueur) {
		for(int i = 0; i < listeJoueur.size(); i++) {
			listeJoueur.get(i).setAPasJoue();
		}
	}
	
	/**
	 * Trie un ArrayList de joueurs par score décroissant puis par ordre alphabétique
	 * @param listeJoueur L'ArrayList de joueurs
	 */
	public final static void trierClassement(ArrayList<Joueur> listeJoueur) {
		List<Joueur> list = listeJoueur;
				list.sort(Comparator.comparing(Joueur::getScore).reversed().thenComparing(Joueur::getNom));
	}
}
