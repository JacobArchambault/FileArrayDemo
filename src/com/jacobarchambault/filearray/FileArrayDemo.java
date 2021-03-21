package com.jacobarchambault.filearray;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates a solution to theFileArray Class programming
 * challenge.
 */
public class FileArrayDemo {
	public static void main(
			String[] args) {
		List<Integer> test = new ArrayList<Integer>(8);

		try {
			// Write the array to the file MyNumbers.txt.
			FileArray myArray = new FileArray(
					new DataOutputStream(
							new FileOutputStream(
									"MyNumbers.txt")));
			myArray.write(
					new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
			// Read the contents of the file into the test array.
			myArray.readArray(
					"MyNumbers.txt",
					test);
//			FileArray.display(
//					test);
		} catch (IOException e) {
			System.out.println(
					"Error = " + e.getMessage());
		}
	}
}
