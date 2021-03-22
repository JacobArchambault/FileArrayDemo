package com.jacobarchambault.filearray;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * The FileArray class works with files and arrays for the FileArray Class
 * programming challenge.
 */
public class NumberFile {
	DataOutput outFile;

	NumberFile(
			DataOutput outFile) {
		this.outFile = outFile;
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
		for (int index = 0; index < array.length; index++)
			outFile.writeInt(
					array[index]);
	}

	static void display(
			int[] test) {
		// Display the characters.
		System.out.println(
				"The numbers read from the file are:");
		for (int i = 0; i < test.length; i++)
			System.out.print(
					test[i] + " ");
	}

}
