public class TestConsigne {

	public static void main(String[] args) {

	//	Consigne consigne = new Consigne(3);
		ConsigneLIFO consigne = new ConsigneLIFO(3);
		System.out.println("Les tests se font avec une consigne comportant 3 casiers");
		System.out.println("Vous devez verifier les resultats qui s'affichent");
		System.out.println("test 1 : 3 casiers de libre sur les 3");
		System.out.println("casiers libres? "+consigne.resteUnCasierLibre()); 
		System.out.println();
		System.out.println("test 2 : 4 attributions");
		System.out.println("consigne.attribuerCasier(mdpa) ");
		System.out.println("le casier n°"+consigne.attribuerCasierLibre("mdpa")+" a ete attribue avec le mot de passe mdpa");
		System.out.println("consigne.attribuerCasier(mdpb)");
		System.out.println("le casier n°"+consigne.attribuerCasierLibre("mdpb")+" a ete attribue avec le mot de passe mdpb");
		System.out.println("consigne.attribuerCasier(mdpc) ");
		System.out.println("le casier n°"+consigne.attribuerCasierLibre("mdpc")+" a ete attribue avec le mot de passe mdpc");
		System.out.println("casiers libres? "+consigne.resteUnCasierLibre()); 
		System.out.println("consigne.attribuerCasier(mdpx)"+consigne.attribuerCasierLibre("mdpx"));
		System.out.println();
		System.out.println("test 3 : ouverture mauvais numeros de casier");
		System.out.println("consigne.ouvrirCasier(-1, blabla) : "+consigne.libererCasier(-1, "blabla"));
		System.out.println("consigne.ouvrirCasier(3, blabla) : "+consigne.libererCasier(3, "blabla"));
		System.out.println("consigne.ouvrirCasier(4, blabla) : "+consigne.libererCasier(4, "blabla"));
		
		System.out.println("Le jeu de tests doit etre complete!!!");
		
		//TEST4 : ouvrir un casier : mot de passe OK

		//TEST5 : ouvrir un casier : mot de passe KO

		//TEST6 : ouvrir le casier qui vient d'etre libere avec mot de passe OK - 
		
		
		

		// A COMPLETER A VOTRE GUISE


	}

}
