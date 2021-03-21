package com.jacobarchambault.filearray;

import java.io.IOException;

/**
 * This program demonstrates a solution to theFileArray Class programming
 * challenge.
 */
public class FileArrayDemo {
	public static void main(
			String[] args) {
		int[] test = new int[8];

		try {
			// Write the array to the file MyNumbers.txt.
			FileArray.writeArray(
					"MyNumbers.txt",
					new int[] {1, 2, 3, 4, 5, 6, 7, 8});
			// Read the contents of the file into the test array.
			FileArray.readArray(
					"MyNumbers.txt",
					test);
			// Display the characters.
			System.out.println(
					"The numbers read from the file are:");
			for (int i = 0; i < test.length; i++)
				System.out.print(
						test[i] + " ");
		} catch (IOException e) {
			System.out.println(
					"Error = " + e.getMessage());
		}
	}
}
