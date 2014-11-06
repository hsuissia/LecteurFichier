package lecteurFichier;

public class Lanceur {

	public static void main(String[] args) {
		System.out.println("<---Lecteur Fichier--->");
		LecteurFichierNormal launch1 = new LecteurFichierNormal("test.txt");
		launch1.affiche();
		System.out.println("<---Lecteur Fichier Reverse--->");
		LecteurFichierReverse launch = new LecteurFichierReverse("test.txt");
		launch.affiche();
		System.out.println("<---Lecteur Fichier Palindromique--->");
		LecteurFichierPalindrome launch2 = new LecteurFichierPalindrome("test.txt");
		launch2.affiche();
	}

}
