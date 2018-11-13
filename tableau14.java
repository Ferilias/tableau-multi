package tableauDouble;
import java.util.Scanner;
import java.lang.Math;

public class tableau14 {
	public static void main(String[] args) {
//		
		int min = 0;
		int max = 20;
		int val = 0;
		int temp = 0;
		int moyenneMat = 0;
		int moyenneTotal = 0;
		int nbrenote = 0;
		int nbretotal = 0;
//		int rand = (int)((Math.random() *range)+ (min));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Merde ");
//		sc.close();
		int[][] tab = new int[4][3];

		for (int i = 0; i < tab.length; i++) {
			temp = i;
			moyenneMat = 0;
			nbrenote = 0;
			for (int j = 0; j < tab[i].length; j++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("saisissez une valeur  ");
				val = sc.nextInt();
				tab[i][j] = val;
//				tab[i][j] = (int)((Math.random() *range)- (min));
				System.out.println(" Mati�re " + i + " note " + j + " vaut " + tab[i][j]);
				if (temp == i) {
					moyenneMat = moyenneMat + tab[i][j];
					nbrenote++;
					nbretotal++;
				}
			}
			moyenneTotal = moyenneTotal + moyenneMat;
//			System.out.println(nbrenote);
			System.out.println(" Moyenne de la mati�re " + moyenneMat / nbrenote);
			System.out.println(" ");

		}
	
		System.out.println("la moyenne total est : " + moyenneTotal/nbretotal);

	}
}


