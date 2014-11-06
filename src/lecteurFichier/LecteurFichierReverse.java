package lecteurFichier;

public class LecteurFichierReverse extends LecteurFichier {
	private String nomFile;
	public LecteurFichierReverse(String nomFile) {
		super();
		this.nomFile = nomFile;
	}

	@Override
	public void affiche() {
		boolean test = super.openAndCheck(nomFile);
		if(test == true){
			super.readfichier();
			for(int a = contenu.size()-1; a >= 0;a--){
				System.out.println(contenu.get(a));
			}
			
		}else {
			System.out.println("Le fichier est vide ou n'existe pas");
		}
		
	}

}
