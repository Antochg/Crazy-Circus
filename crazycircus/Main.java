package crazycircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {	

	public static void main(String[] args) {
		//Création d'une ArrayList de Joueur
		ArrayList<Joueur> listeJoueur  = new ArrayList<>();
	
		System.out.println("Nombre de joueur (minimum 2) : ");
		boolean errNbJoueur = true;
		//Nombre de joueur
		int nbJoueur = 0;
		//Demande de la saisi du nombre de joueurs tant que la saisi n'est pas un entier supérieur à 1
		do {
			Scanner sc = new Scanner(System.in);
			errNbJoueur = false;
			try {
				nbJoueur = sc.nextInt();
				sc.nextLine();	//On vide la ligne
			} catch (java.util.InputMismatchException e) {
				errNbJoueur = true;
			}
			if(nbJoueur < 2) {
				System.out.println("Saisissez un nombre supérieur à 1 !");
			}
		} while(errNbJoueur || nbJoueur < 2);
		
		Scanner sc = new Scanner(System.in);
		
		//Création des joueurs et de leur pseudo

		for(int i = 1; i <= nbJoueur; ++i) {
			
			do {
				System.out.println("Comment s'appelle le joueur " + i + " ? (Nom sans espace)");
				String nomJoueur = sc.nextLine().toUpperCase();
				if(nomJoueur.indexOf(" ") >= 0) {
					System.err.println("Le nom contient des espaces, recommencer !");
				}
				else if (nomJoueur.equals("")) {
					System.err.println("Le nom est vide, recommencer !");
				}
				else {
					while(Joueur.verifJoueur(listeJoueur, nomJoueur)) {
						System.err.println("Le joueur existe déjà ! Choisissez un autre nom : ");
						nomJoueur = sc.nextLine().toUpperCase();
					}
				 Joueur.creerJoueur(listeJoueur, nomJoueur);
				 System.out.println("Le joueur " + i + " est : " + nomJoueur);
				 break;
				}
			}while(true);
		}
	
		System.out.println("Le jeu commence ! Bonne chance !\n");
		//Création d'une ArrayList qui représente les 24 cartes du jeu
		ArrayList<Podium> cartes = new ArrayList<Podium>();
		Jouer.creerCarte(cartes);
		Jouer.melanger(cartes);
		System.out.println("Pour répondre, saisissez votre nom puis l'ordre (exemple : nom KILOSO)\n");
		
		for(int i = 0; i < cartes.size()-1; ++i) {
			Affichage.afficherJeu(cartes.get(i), cartes.get(i+1));
			int cpt = listeJoueur.size(); //Le nombre de personne n'ayant pas joué
			do {
				if(cpt != 1) {
					System.out.print("Votre réponse : ");
					String reponse = sc.nextLine().toUpperCase().trim();
					String[] nomReponse = reponse.split("\\s+");
					if (reponse.equals("")) {
						System.out.println("La réponse est vide, recommencer !\n");
					}
					else if (nomReponse.length == 1) {
						System.out.println("Saisissez un nom puis ordre !");
					}
					else {
						if(Joueur.verifJoueur(listeJoueur, nomReponse[0])) {
							if(listeJoueur.get(Joueur.indiceJoueur(listeJoueur, nomReponse[0])).getADejaJoue() == false) {
								if(Jouer.verifOrdre(nomReponse[1])) {
									Podium pTest = new Podium();
									pTest = cartes.get(i);
									try {
										Jouer.executerOrdre(nomReponse[1], pTest);
									}
									catch(java.lang.ArrayIndexOutOfBoundsException e1) {
									}
									catch(java.lang.IndexOutOfBoundsException e2) {
									}
									finally {
										if(Podium.comparer(pTest, cartes.get(i+1))) {
											try {
												Jouer.executerOrdre(nomReponse[1], cartes.get(i));
											}
											catch(java.lang.ArrayIndexOutOfBoundsException e1) {
											}
											catch(java.lang.IndexOutOfBoundsException e2) {
											}
											System.out.println("Bravo, vous gagnez un point !\n");
											listeJoueur.get(Joueur.indiceJoueur(listeJoueur, nomReponse[0])).ajouterPoint();
											Joueur.reinitialiserADejaJoue(listeJoueur);
											break;
										}
										else {
											--cpt;
											System.out.println("Vous vous êtes trompés, vous ne pouvez plus jouer pendant cette manche !");
											listeJoueur.get(Joueur.indiceJoueur(listeJoueur, nomReponse[0])).setADejaJoue();
										}	
									}
								}
								else {
									--cpt;
									System.out.println("Vous vous êtes trompés, vous ne pouvez plus répondre pendant cette manche !");
									listeJoueur.get(Joueur.indiceJoueur(listeJoueur, nomReponse[0])).setADejaJoue();
								}	
							}
							else {
								System.out.println("Le joueur a déjà joué, il ne peut pas rejouer pendant cette manche !");
							}
						}	
						else {
							System.out.println("Le joueur n'existe pas !");
						}
					}	
				}
				else {
					System.out.println("Il ne reste qu'un joueur, il gagne la manche !\n");
					for(int j = 0; j < listeJoueur.size(); ++j) {
						if(listeJoueur.get(j).getADejaJoue() == false) {
							listeJoueur.get(j).ajouterPoint();
						}
					}
					Joueur.reinitialiserADejaJoue(listeJoueur);
					break;
				}
		} while((cartes.get(i).equals(cartes.get(i+1)) == false));
	}
	System.out.println("La partie est fini ! Voici le classement : \n");
	Joueur.trierClassement(listeJoueur);
	Affichage.afficherClassement(listeJoueur);
	}
}