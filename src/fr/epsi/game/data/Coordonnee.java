package fr.epsi.game.data;

public class Coordonnee {
	
		private int ligne;
		private int colonne;
		
		/**
		 * Constructeur pour une coordonnee a partir de sa representation text (A5, C6)
		 * @param coord La coordonnee
		 */
		public Coordonnee(String coord)
		{
			char valueColonne = coord.charAt(0);
			
			if(valueColonne - 'A' == 0)
			{
				this.colonne = 0;
			}
			else if(valueColonne - 'B' == 0)
			{
				this.colonne = 1;
			}
			else
			{
				this.colonne = 2;
			}
			
			String valueLigne = coord.substring(1);
			this.ligne = Integer.parseInt(valueLigne) - 1;
		}

		/**
		 * Constructeur pour une coordonnee
		 * @param ligne le numero de la ligne
		 * @param colonne le numero de la colonne
		 */
		public Coordonnee(int ligne, int colonne)
		{

			this.ligne = ligne;
			this.colonne = colonne;
			
		}
			
		/**
		 * Retourne l'indice de la ligne
		 * @return the ligne
		 */
		public int getLigne()
		{
			return this.ligne;
		}

		/**
		 * Retourne l'indice de la colonne
		 * @return the colonne
		 */
		public int getColonne()
		{
			
			return this.colonne;
			
		}

			
		/**
		 * Redefini le toString pour afficher une coordonnee sous la forme A0, B5, D1
		 */
		public String toString() {
			
			
			return "Return";
		}


}
