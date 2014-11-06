package lecteurFichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

abstract class LecteurFichier implements ILecteurFichier {
	protected ArrayList<String> contenu;
	private File file;
	
	public LecteurFichier(){
		this.contenu = new ArrayList<String>();
		this.file = null;
	}
	
	@Override
	public boolean openAndCheck(String nom){
		file = new File(nom);
		if(file.isFile()){
			if(file.canRead()){
				return true;
			}
		}
		return false;
		
	}
	@Override
	public void readfichier() {
		try {
			InputStream ips=new FileInputStream(file); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne= br.readLine())!=null){
				contenu.add(ligne);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public abstract void affiche();
}
