package tableauDouble;
import java.util.Scanner;
public class Tableau05 {
	public static void main(String[] args) {
//		initialisation des variables
		// Variable pour les tests, nombres aléatoires
//		int min = 0;
//		int max = 20;
//		int range = max - min;
		// Fin test
		int val = 0;
		int temp = 0;
		int moyenneMat = 0;
		int moyenneTotal = 0;
		int nbrenote = 0;
		int nbretotal = 0;
		
		// création du tableau
		int[][] tab = new int[4][3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tab.length; i++) {
			temp = i;
			moyenneMat = 0;
			nbrenote = 0;
			for (int j = 0; j < tab[i].length; j++) {
				System.out.println("saisissez une valeur  ");
				val = sc.nextInt();
				tab[i][j] = val;
				// remplir avec des valeurs aléatoires pour les tests
//				tab[i][j] = (int)((Math.random() *range)- (min));
				System.out.println(" Matière " + i + " note " + j + " vaut " + tab[i][j]);
				if (temp == i) {
					moyenneMat = moyenneMat + tab[i][j];
					nbrenote++;
					nbretotal++;
				}
			}
			moyenneTotal = moyenneTotal + moyenneMat;
			// test des valeurs de sortie
//			System.out.println(nbrenote);
			System.out.println(" Moyenne de la matière " + moyenneMat / nbrenote);
			System.out.println(" ");
			sc.close();

		}
		System.out.println("la moyenne total est : " + moyenneTotal/nbretotal);
	}
}


