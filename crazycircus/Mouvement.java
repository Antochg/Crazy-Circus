package crazycircus;

public class Mouvement {

	/**
	 * Ajoute au sommet du podium rouge l'objet qui se trouve au sommet du podium bleu
	 * @param p les podiums
	 */
	public static final void KI(Podium p) {
			p.pRouge.add(p.pBleu.get(p.pBleu.size()-1));
			p.pBleu.remove(p.pBleu.size()-1);		
	}
	
	/**
	 * Ajoute au sommet du podium bleu l'objet qui se trouve au sommet du podium rouge
	 * @param p les podiums
	 */
	public static final void LO(Podium p) {
			p.pBleu.add(p.pRouge.get(p.pRouge.size()-1));
			p.pRouge.remove(p.pRouge.size()-1);
	}
	
	/**
	 * L'objet situé au sommet du podium bleu échange de place avec l'objet situé au sommet du podium rouge
	 * @param p les podiums
	 */
	public static final void SO(Podium p) {
			String st;
			st = p.pRouge.get(p.pRouge.size()-1);
			p.pRouge.remove(p.pRouge.size()-1);
			p.pRouge.add(p.pBleu.get(p.pBleu.size()-1));
			p.pBleu.remove(p.pBleu.size()-1);
			p.pBleu.add(st);
	}
	
	/**
	 * L'objet au pied du podium bleu se retrouve au sommet de ce même podium
	 * @param p les podiums
	 */
	public static final void NI(Podium p) {
			p.pBleu.add(p.pBleu.get(0));
			p.pBleu.remove(0);
	}
	
	/**
	 * L'objet au pied du podium rouge se retrouve au sommet de ce même podium
	 * @param p les podiums
	 */
	public static final void MA(Podium p) {
			p.pRouge.add(p.pRouge.get(0));
			p.pRouge.remove(0);
	}
}
