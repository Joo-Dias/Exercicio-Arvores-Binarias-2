package view;

import controller.Arvore;

public class Main {

	public static void main(String[] args) {
		
		Arvore tree = new Arvore();
		
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		
		
		// Inserindo cada valor do vetor na árvore
		for(int valor : vetor) {
			tree.insert(valor);
		}
		
		// Fazendo o atravessamento da árvore por pre, in e pos
		try {
			System.out.println("Atravessamento PRE =============");
			tree.prefixSearch();
			System.out.println("");
			System.out.println("Atravessamento IN =============");
			tree.infixSearch();
			System.out.println("");
			System.out.println("Atravessamento POS =============");
			tree.postfixSearch();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
