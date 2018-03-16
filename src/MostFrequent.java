class MostFrequent {

	public static void main(String[] args) {
		int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
		int taille = tab1.length;

		/*******************************************
		 * Completez le programme a partir d'ici.
		 *******************************************/
		if (tab1 != null && taille > 0) {
			int[] tblCompteur = new int[taille];
			int indice = 0;

			for (int i = 0; i < taille; i++) {
				int temp = tab1[i];
				tblCompteur[i]++;

				for (int j = 0; j < taille; j++) {
					if ( (j != i) && (temp == tab1[j]) ) {
						tblCompteur[i]++;
					}
				}

			}

			int maxValue = tblCompteur[0];
			for(int i = 1; i < taille; i++){ 
				if(tblCompteur[i] > maxValue){ 
					maxValue = tblCompteur[i]; 
					indice = i;
				} 
			} 

			System.out.println("Le nombre le plus frequent dans le tableau est le :");
			System.out.println(tab1[indice] + " (" + tblCompteur[indice] + " x)");
		}

		/*******************************************
		 * Ne rien modifier apres cette ligne.
		 *******************************************/

	}
}