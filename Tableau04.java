package tableauDouble;
import java.lang.Math;
public class Tableau04 {
	public static void main(String[] args) {
//	initilisation des valeurs	
		int min = 0;
		int max = 60;
		int range = max - min;
		int maxi = 0;

		int[][] tab = new int[12][8];
// boucle qui cherchr la valeur maximum
			for (int i = 0; i < tab.length; i++) {
				for (int j = 0; j < tab[i].length; j++) {
					// remplissage automatique du tableau
					tab[i][j] = (int)((Math.random() *range)- min);
					System.out.println(" i "+i+" "+j+ " vaut "+tab[i][j]);
					if (tab[i][j] > maxi) {
						maxi = tab[i][j];
					}
				}
				System.out.println(" ");
		}

	System.out.println("le maximum est : "+maxi);
}

}
