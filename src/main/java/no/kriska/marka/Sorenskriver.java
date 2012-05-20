package no.kriska.marka;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Sorenskriver {

	public void write(String filename, String content) {
		try {
			// Create file
			FileWriter fstream = new FileWriter(filename);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(content);
			// Close the output stream
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
