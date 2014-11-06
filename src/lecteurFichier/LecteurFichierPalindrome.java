package lecteurFichier;

public class LecteurFichierPalindrome extends LecteurFichier {
	private String nomFile;
	public LecteurFichierPalindrome(String nomFile) {
		super();
		this.nomFile = nomFile;
	}
	@Override
	public void affiche() {
		boolean test = super.openAndCheck(nomFile);
		if(test == true){
			super.readfichier();
			String chInverse = "";
			for(int a = 0; a < contenu.size();a++){
				String[] mots = contenu.get(a).split(" ");
				for(int b = 0; b < mots.length; b++){
					int taille = mots[b].length();
					for(int i = taille -1; i>-1; i--)
			         {
			            chInverse+= mots[b].substring(i, i +1);
			         }
					chInverse+= " ";
				}
				chInverse+= "\n";
				
			}
			System.out.println(chInverse);
		}else {
			System.out.println("Le fichier est vide ou n'existe pas");
		}
		
	}


}
