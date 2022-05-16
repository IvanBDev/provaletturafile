package it.prova.provaletturafile.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Scritture {
	// Listato 2. Scrittura di un file
	public static void writeFile() {
		String path = "C://Users//Ivan//Desktop/provaletturafile.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			fw.write("Questo è il nostro primo file senza BufferedWriter");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Listato 3. Scrittura di un file con BufferWriter
	public static void writeFile2() {
		String path = "C://Users//Ivan//Desktop/provaletturafile.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Questo è il nostro primo file con BufferedReader");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
