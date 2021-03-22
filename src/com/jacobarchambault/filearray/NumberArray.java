package com.jacobarchambault.filearray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberArray {
	Scanner scanner;

	NumberArray(
			final Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * The readArray method reads integers from a file into an int array.
	 *
	 * @param array The array to hold the integers.
	 * @return
	 * @exception IOException When an IO error occurs.
	 */
	List<Integer> fromFile() throws IOException {
		final List<Integer> array = new ArrayList<>();
		while (scanner.hasNext()) {
			array.add(
					Integer.parseInt(
							scanner.next()));
		}
		return array;
	}
}
