package it.prova.provaletturafile.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Letture {
	// Listato 4. Lettura di un file di testo
	public static void readFile() {
		String path = "C://Users//Ivan//Desktop/provaletturafile.txt";
		char[] in = new char[50];
		int size = 0;
		try {
			File file = new File(path);
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.print("Caratteri presenti: " + size + "\n");
			System.out.print("Il contenuto del file è il seguente:\n");
			for (int i = 0; i < size; i++)
				System.out.print(in[i]);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Listato 5. Lettura di un file di testo con BufferRead
	public static void readFile2() {
		String path = "C://Users//Ivan//Desktop/provaletturafile.txt";
		char[] in = new char[50];
		int size = 0;
		try {
			File file = new File(path);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			size = br.read(in);
			System.out.print("Caratteri presenti: " + size + "\n");
			System.out.print("Il contenuto del file è il seguente:\n");
			for (int i = 0; i < size; i++)
				System.out.print(in[i]);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
