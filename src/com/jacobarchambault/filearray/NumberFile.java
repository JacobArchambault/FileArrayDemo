package com.jacobarchambault.filearray;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * The FileArray class works with files and arrays for the FileArray Class
 * programming challenge.
 */
public class NumberFile {
	FileWriter fileWriter;

	NumberFile(
			FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	/**
	 * The writeArray method writes an int array to a file.
	 * 
	 * @param filename The name of the file.
	 * @param array    The array to write from.
	 * @exception IOException When an IO error occurs.
	 */
	public void write(
			int[] array) throws IOException {
		// Write the array.
		for (int i : array) {
			fileWriter.write(
					String.valueOf(
							i) + " ");
		}
		fileWriter.close();
	}
}
