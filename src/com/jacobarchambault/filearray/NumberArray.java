package com.jacobarchambault.filearray;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class NumberArray {
	/**
	 * The readArray method reads integers from a file into an int array.
	 * 
	 * @param filename The name of the file.
	 * @param array    The array to hold the integers.
	 * @exception IOException When an IO error occurs.
	 */
	public static void readArray(
			String filename,
			List<Integer> array) throws IOException {
		// Open the file.
		try (DataInputStream outFile = new DataInputStream(
				new FileInputStream(
						filename))) {
			// Read values from the array.
			for (int index = 0; index < array.size(); index++)
				array.add(
						outFile.readInt());
		} catch (IOException e) {
			System.out.println(
					"Error = " + e.getMessage());
		}
	}
}
