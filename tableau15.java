package tableauDouble;

import java.util.*;
import java.lang.Math;

public class tableau15 {
	public static void main(String[] args) {

		int move = 0;
		int startX = 0; // ligne
		int startY = 0; // colonne
		Scanner sc = new Scanner(System.in);
		
		int [][] jeuDame = creationTableau0(10,10); 
		
		System.out.println("position de d�part du pion en hauteur");
		startX = sc.nextInt();
		System.out.println("position de d�part du pion en hauteur");
		startY = sc.nextInt();

		jeuDame[startX][startY] = 1;

		for (int i = 0; i < jeuDame.length; i++) {
			for (int j = 0; j < jeuDame[i].length; j++) {
				System.out.print(jeuDame[i][j] + "   ");
			}
			System.out.println();
		}

		System.out.println("Faite un d�placement");
		move = sc.nextInt();

		while (move != 4) {

			if (move == 0) {
				System.out.println("Vous vous �tes d�plac� en haut � gauche");
				jeuDame[startX][startY] = 0;
				startX = (startX + 9)%10;
				startY = (startY +9)%10;
				jeuDame[startX][startY] = 1;
				imprimeTableau (jeuDame);
			}
			else if (move == 1) {
				System.out.println("Vous vous �tes d�plac� en haut � droite");
				jeuDame[startX][startY] = 0;
				startX = (startX + 9)%10;
				startY = (startY + 1)%10;
				jeuDame[startX][startY] = 1;
				imprimeTableau (jeuDame);
			}
			else if (move == 2) {
				System.out.println("Vous vous �tes d�plac� en bas � gauche");
				jeuDame[startX][startY] = 0;
				startX = (startX + 1)%10;
				startY = (startY + 1)%10;
				jeuDame[startX][startY] = 1;
				imprimeTableau (jeuDame);
			}
			else if (move == 3) {
				System.out.println("Vous vous �tes d�plac� en bas � droite");
				jeuDame[startX][startY] = 0;
				startX = (startX + 1)%10;
				startY = (startY + 9)%10;
				jeuDame[startX][startY] = 1;
				imprimeTableau (jeuDame);
			}
			else if (move == 4) {
				System.out.println("Vous sortez du jeu");
				break;
			}
			
			
			System.out.println("Faite un d�placement");
			move = sc.nextInt();
			System.out.println();
		}
		sc.close();

	}

	public static void imprimeTableau(int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "   ");
			System.out.println();
		}
	}

	public static void imprimeTableau(int tab[][]) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static int [][] creationTableau0(int largeur, int hauteur) {
		int[][] tab = new int[largeur][hauteur];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = 0;
				}
		
	}
		return tab; 
}	

}
