package com.jacobarchambault.filearray;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * The FileArray class works with files and arrays for the FileArray Class
 * programming challenge.
 */
public class FileArray {
	DataOutput outFile;

	FileArray(
			DataOutput outFile) {
		this.outFile = outFile;
	}

	/**
	 * The writeArray method writes an int array to a file.
	 * 
	 * @param filename The name of the file.
	 * @param array    The array to write.
	 * @exception IOException When an IO error occurs.
	 */
	public void write(
			int[] array) throws IOException {
		// Write the array.
		for (int index = 0; index < array.length; index++)
			outFile.writeInt(
					array[index]);
	}

	/**
	 * The readArray method reads integers from a file into an int array.
	 * 
	 * @param filename The name of the file.
	 * @param array    The array to hold the integers.
	 * @exception IOException When an IO error occurs.
	 */
	public void readArray(
			String filename,
			int[] array) throws IOException {
		// Open the file.
		DataInputStream outFile = new DataInputStream(
				new FileInputStream(
						filename));
		// Read values from the array.
		for (int index = 0; index < array.length; index++)
			array[index] = outFile.readInt();

		// Close the file.
		outFile.close();
	}
}
