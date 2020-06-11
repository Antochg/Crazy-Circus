package crazycircus;

import java.util.ArrayList;

//Définition des podiums
public class Podium {
	
	//Le podium bleu
	ArrayList<String> pBleu;
	//Le podium rouge
	ArrayList<String> pRouge;
	
	/**
	 * sa construit des trucs
	 */
	public Podium() {
		pBleu = new ArrayList<>();
		pRouge = new ArrayList<>();
	}
	
	/**
	 * Compare les podiums initiaux aux podiums buts
	 * @param podiumInitial les podiums initiaux
	 * @param podiumFinal les podiums buts
	 * @return boolean
	 */
	public static boolean comparer(Podium podiumInitial, Podium podiumFinal) {
		if(podiumInitial.pBleu.equals(podiumFinal.pBleu) && podiumInitial.pRouge.equals(podiumFinal.pRouge)) {
			return true;
		}
		else {
			return false;
		}
	}
}
