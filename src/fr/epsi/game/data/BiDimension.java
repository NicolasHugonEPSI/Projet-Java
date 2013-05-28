package fr.epsi.game.data;

public class BiDimension <T> {

	private Object[][] tableau;
	
	/**
	 * Constructeur pour un tableau a 2 dimensions
	 * @param nbLignes 
	 * @param nbColonnes
	 */
	public BiDimension(int nbLignes, int nbColonnes) {
		
	}
		
	/**
	 * Positionne la valeur <obj> dans la case de coordonnees (ligne, colonne)
	 * @param ligne la ligne (commence ˆ 0)
	 * @param colonne la colonne (commence ˆ 0)
	 * @param obj la valeur 
	 */
	public void set(int ligne, int colonne, T obj) {
	
		this.tableau[ligne][colonne] = obj;
		
	}
		
	/**
	 * Retourne la valeur contenu dans la case de coordonnees (ligne, colonne)
	 * @param ligne la ligne (commence ˆ 0)
	 * @param colonne la colonne (commence ˆ 0)
	 * @return La valeur 
	 */
	@SuppressWarnings("unchecked")
	public T get(int ligne, int colonne) {
		
		return (T) this.tableau[ligne][colonne];
	}
		
	/**
	 * Positionne la valeur <obj> dans la case de coordonnees (coord)
	 * @param coord la coordonnee
	 * @param obj la valeur 
	 */
	public void set(Coordonnee coord, T obj)
	{
		int temp1 = coord.getColonne();
		int temp2 = coord.getLigne();
		this.tableau[temp1][temp2] = obj;
	}

	/**
	 * Retourne la valeur contenu dans la case de coordonnees (coord)
	 * @param coord la coordonnee
	 * @return La valeur 
	*/
	public T get(Coordonnee coord) 
	{	
		int temp1 = coord.getColonne();
		int temp2 = coord.getLigne();
		
		return (T) this.tableau[temp1][temp2] ;
	}

	/**
	 * Retourne le nombre de ligne du tableau a 2 dimensions
	 * @return nb de lignes
	 */
	public int getNbLignes() {
		return 0;
	}

	/**
	 * Retourne le nombre de colonnes du tableau a 2 dimensions
	 * @return nb de colonnes
	 */
	public int getNbColonnes() {
		return 0;
	}

	/**
	 * Recherche un element dans le tableau et renvoi ses coordonnes s'il est trouve, null sinon
	 * @param obj L'objet en question
	 * @return Les coordonnees de l'objet
	 */
	public Coordonnee search(T obj) {
		return null;
	}

	
}
