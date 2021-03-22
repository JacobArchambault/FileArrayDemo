package com.jacobarchambault.filearray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * This program demonstrates a solution to theFileArray Class programming
 * challenge.
 */
public class FileArrayDemo {
	public static void main(
			final String[] args) {
		// Write the array to the file MyNumbers.txt.
		try {
			final var file = new File(
					"MyNumbers.txt");
			new NumberFile(
					new FileWriter(
							file)).write(
									new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
			// Read the contents of the file into the test array.
			FileArrayDemo.display(
					new NumberArray(
							new Scanner(
									file)).fromScannerInput());
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void display(
			final List<Integer> list) {
		// Display the characters.
		System.out.println(
				"The numbers read from the file are:");
		for (final int i : list) {
			System.out.print(
					i + " ");
		}
	}

}
