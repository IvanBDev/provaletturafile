package it.prova.provaletturafile.model;

import java.io.File;
import java.io.IOException;

public class ImplementazioneFile {
	// Listato 1. Creazione di un file vuoto
	public static void newFile() {
		String path = "C://Users//Ivan//Desktop/provaletturafile.txt";
		try {
			File file = new File(path);
			if (file.exists())
				System.out.println("Il file " + path + " esiste");
			else if (file.createNewFile())
				System.out.println("Il file " + path + " è stato creato");
			else
				System.out.println("Il file " + path + " non può essere creato");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
