package org.vieuxchameau.arrayFinder;

import java.util.Collections;

import static java.util.Arrays.asList;

public class ArrayFinder {
	/**
	 * Find the starting position of the second array in the
	 * source array.
	 *
	 * @return -1 if the array can not be find
	 */
	public static int findStartingPosition(final Integer[] source, final Integer[] toFind) {
		if (source == null || toFind == null) {
			return -1;
		}
		return Collections.indexOfSubList(asList(source), asList(toFind));
	}
}
