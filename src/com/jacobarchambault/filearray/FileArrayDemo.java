package com.jacobarchambault.filearray;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
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
			FileArray myArray = new FileArray(new DataOutputStream(new FileOutputStream(
					"MyNumbers.txt")));
			myArray.write(
					new int[] {1, 2, 3, 4, 5, 6, 7, 8});
			// Read the contents of the file into the test array.
			myArray.readArray(
					"MyNumbers.txt",
					test);
			display(
					test);
		} catch (IOException e) {
			System.out.println(
					"Error = " + e.getMessage());
		}
	}

	private static void display(
			int[] test) {
		// Display the characters.
		System.out.println(
				"The numbers read from the file are:");
		for (int i = 0; i < test.length; i++)
			System.out.print(
					test[i] + " ");
	}
}
