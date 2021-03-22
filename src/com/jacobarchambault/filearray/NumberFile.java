package com.jacobarchambault.filearray;

import java.io.FileWriter;
import java.io.IOException;

/**
 * The FileArray class works with files and arrays for the FileArray Class
 * programming challenge.
 */
public class NumberFile {
	FileWriter fileWriter;

	NumberFile(
			final FileWriter fileWriter) {
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
			final int[] array) throws IOException {
		// Write the array.
		for (final int i : array) {
			fileWriter.write(
					String.valueOf(
							i) + " ");
		}
		fileWriter.close();
	}
}
