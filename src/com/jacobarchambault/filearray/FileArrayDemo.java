package com.jacobarchambault.filearray;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program demonstrates a solution to theFileArray Class programming
 * challenge.
 */
public class FileArrayDemo {
	public static void main(
			String[] args) {
		List<Integer> test = new ArrayList<Integer>(
				8);

		try {
			// Write the array to the file MyNumbers.txt.
			new FileArray(
					new DataOutputStream(
							new FileOutputStream(
									"MyNumbers.txt"))).write(
											new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
			// Read the contents of the file into the test array.
			new NumberArray(
					new Scanner(
							new File(
									"MyNumbers.txt"))).readArray(
											test);
//			FileArray.display(
//					test);
		} catch (IOException e) {
			System.out.println(
					"Error = " + e.getMessage());
		}
	}
}
