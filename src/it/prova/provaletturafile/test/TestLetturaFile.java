package it.prova.provaletturafile.test;

import it.prova.provaletturafile.model.ImplementazioneFile;
import it.prova.provaletturafile.model.Letture;
import it.prova.provaletturafile.model.Scritture;

public class TestLetturaFile {

	public static void main(String[] args) {
		ImplementazioneFile.newFile();
		
		System.out.println("----------------------------------------------------------------------");
		
		//Scritture.writeFile();			//scrittura senza BufferedReader
		Scritture.writeFile2(); 			//scrittura con BufferedReader
		
		System.out.println("----------------------------------------------------------------------");
		
		//Letture.readFile();			//lettura senza BufferedReader
		Letture.readFile2();			//lettura con BufferedReader
	}
}