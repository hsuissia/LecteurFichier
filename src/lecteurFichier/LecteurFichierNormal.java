package lecteurFichier;

public class LecteurFichierNormal extends LecteurFichier {
	private String nomFile;
	public LecteurFichierNormal(String nomFile) {
		super();
		this.nomFile = nomFile;
	}

	@Override
	public void affiche() {
		boolean test = super.openAndCheck(nomFile);
		if(test == true){
			super.readfichier();
			for(int a = 0; a<contenu.size();a++){
				System.out.println(contenu.get(a));
			}
			
		}else {
			System.out.println("Le fichier est vide ou n'existe pas");
		}
		
	}

}
