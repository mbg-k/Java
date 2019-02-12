/**
 * @author 
 *
 */
public class CatalogueV2 {

	private Vecteur<String> oeuvres;
	private Pile<Integer> numerosLibres;
	/**
	 * construit un catalogue vide
	 */
	public CatalogueV2(){
		// TODO
		oeuvres = new VecteurImpl<String>();
		numerosLibres = new PileImpl<Integer>();
		// au depart : 10 oeuvres vides
		for (int i = 9; i>=0 ; i--) {
			oeuvres.ajoute("");
			numerosLibres.push(i);
			System.out.println(i);
		}
	}

	/**
	 * renvoie le nombre d'oeuvres contenues dans le catalogue
	 * @return le nombre d'oeuvres contenues dans le catalogue
	 */
	public int nombreOeuvres(){
		return oeuvres.taille()-numerosLibres.taille();
	}

	/**
	 * ajoute une oeuvre dans le catalogue
	 * precondition : l'oeuvre n'y est pas encore
	 * Votre methode ne doit pas faire cette verification!
	 * @param oeuvre l'oeuvre a ajouter
	 * @return le numero de l'oeuvre ajoutee
	 * @throws IllegalArgumentException si l'oeuvre est vide ou null
	 */
	public int ajouter(String oeuvre){
		if(numerosLibres.estVide()){
			// ajout de 10 oeuvres vides
			int nombreOeuvres = oeuvres.taille();
			for(int i = nombreOeuvres+9; i>=nombreOeuvres; i--){
				oeuvres.ajoute("");
				numerosLibres.push(i);
				System.out.println(i);
			}
		}
		int numero = numerosLibres.pop();
		oeuvres.remplace(numero, oeuvre);
		return numero;
		
	}

	
	/**
	 * renvoie l'oeuvre correspondante au numero passe en parametre
	 * @param numeroOeuvre le numero de l'oeuvre recherchee
	 * @return l'oeuvre ou null si le numeroOeuvre ne correspond a aucune oeuvre actuellement exposee 
	 */
	public String consulter(int numeroOeuvre){
		try{
			String oeuvre = oeuvres.element(numeroOeuvre);
			if(oeuvre.equals(""))
					return null;
			return oeuvre;
		}
		catch(VecteurOutException e){
			return null;
		}
	}


	/**
	 * supprime l'oeuvre correspondante au numero passe en parametre
	 * @param numeroOeuvre le numero de l'oeuvre a supprimer
	 * @return l'oeuvre supprimee ou null si le numeroOeuvre ne correspond a aucune oeuvre actuellement exposee 
	 */
	public String supprimer(int numero0euvre){
		try{
			String oeuvre = oeuvres.element(numero0euvre);
			if(oeuvre.equals(""))
				return null;
			oeuvres.remplace(numero0euvre, "");
			numerosLibres.push(numero0euvre);
			return oeuvre;
		}
		catch(VecteurOutException e){
			return null;
		}
	}
	
	/**
	 * renvoie un String avec les oeuvres existantes (pas les vides)
	 * Les numeros et les descriptifs doivent apparaitre 
	 */
	public String toString(){
		String aRenvoye = "";
		for (int i = 0; i < oeuvres.taille(); i++) {
			if(!oeuvres.element(i).equals("")){
				aRenvoye += "\n numero : "+ i + " oeuvre :"+ oeuvres.element(i);
			}			
		}
		return aRenvoye;
	}
}
