package com.jacobarchambault.filearray;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
		// Write the array to the file MyNumbers.txt.
		try {
			File file = new File(
					"MyNumbers.txt");
			new NumberFile(
					new FileWriter(
							file)).write(
									new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
			// Read the contents of the file into the test array.
			display(
					new NumberArray(
							new Scanner(
									file)).fromFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void display(
			List<Integer> list) {
		// Display the characters.
		System.out.println(
				"The numbers read from the file are:");
		for (int i : list)
			System.out.print(
					i + " ");
	}

}
