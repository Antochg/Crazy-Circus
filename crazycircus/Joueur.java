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
	 * Affecte un nom � un joueur et le range dans une ArrayList
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
	 * Met le joueur dans l'�tat "� d�j� jou�"
	 */
	public void setADejaJoue() {
		aDejaJoue = true;
	}
	
	/**
	 * Met le joueur dans l'�tat "n'a pas jou�"
	 */
	public void setAPasJoue() {
		aDejaJoue = false;
	}
	
	/**
	 * R�cup�re l'indice d'un joueur de l'ArrayList avec son nom
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
	 * V�rification de l'existance d'un joueur
	 * @param listeJoueur l'ArrayList dans lequel on v�rifie
	 * @param nom Le nom du joueur � v�rifier
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
	 * Remet tous les joueurs d'un l'ArrayList � l'�tat "A pas jouer"
	 * @param listeJoueur L'ArrayList de joueurs
	 */
	public static void reinitialiserADejaJoue(ArrayList<Joueur> listeJoueur) {
		for(int i = 0; i < listeJoueur.size(); i++) {
			listeJoueur.get(i).setAPasJoue();
		}
	}
	
	/**
	 * Trie un ArrayList de joueurs par score d�croissant puis par ordre alphab�tique
	 * @param listeJoueur L'ArrayList de joueurs
	 */
	public final static void trierClassement(ArrayList<Joueur> listeJoueur) {
		List<Joueur> list = listeJoueur;
				list.sort(Comparator.comparing(Joueur::getScore).reversed().thenComparing(Joueur::getNom));
	}
}
