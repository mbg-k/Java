/**
 * @author 
 *
 */
public class Catalogue {

	private Vecteur<String> oeuvres;
	private Pile<Integer> numerosLiberes;
	/**
	 * construit un catalogue vide
	 */
	public Catalogue(){
		oeuvres = new VecteurImpl<String>();
		numerosLiberes = new PileImpl<Integer>();
	}

	/**
	 * renvoie le nombre d'oeuvres contenues dans le catalogue
	 * @return le nombre d'oeuvres contenues dans le catalogue
	 */
	public int nombreOeuvres(){
		return oeuvres.taille()-numerosLiberes.taille();
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
		if(!numerosLiberes.estVide()){
			int numero = numerosLiberes.pop();
			oeuvres.remplace(numero, oeuvre);
			return numero;
		}
		oeuvres.ajoute(oeuvre);
		return oeuvres.taille()-1;
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
			numerosLiberes.push(numero0euvre);
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
