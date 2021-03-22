package com.jacobarchambault.filearray;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class NumberArray {
	Scanner scanner;
	NumberArray(Scanner scanner){
		this.scanner = scanner;
	}
	/**
	 * The readArray method reads integers from a file into an int array.
	 * 
	 * @param array    The array to hold the integers.
	 * @exception IOException When an IO error occurs.
	 */
	void readArray(
			List<Integer> array) {
		// Open the file.
		while (scanner.hasNextInt()) {
			array.add(scanner.nextInt());
		}
	}
}
