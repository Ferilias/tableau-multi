package tableauDouble;
import java.lang.Math;
public class tableau13 {
	public static void main(String[] args) {
//		
		int min = 0;
		int max = 100;
		int range = max - min;
		int maxi = 0;
		
//		int rand = (int)((Math.random() *range)+ (min));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Merde ");
//		H = sc.nextInt();
//		L = sc.nextInt();
//		sc.close();
		int[][] tab = new int[12][8];

			for (int i = 0; i < tab.length; i++) {
				for (int j = 0; j < tab[i].length; j++) {
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
//	public static void afficheTableau(int[] tableau)
//	{
//		for (int i = 0; i < tableau.length; i++)
//		{
//			System.out.print(tableau[i] + " ");
//		
//		}
//		
//		System.out.println();
//	}
//		
//		public static void afficheTableau2(int[][] tableau)
//		{
//			for (int i = 0; i < tableau.length; i++)
//			{
//				for (int j = 0; j < tableau.length; i++)
//				{
//					System.out.print(tableau[i] + " "+ tableau[j]);
//				
//				}
//			}
//			
//			System.out.println();
//	}
}
