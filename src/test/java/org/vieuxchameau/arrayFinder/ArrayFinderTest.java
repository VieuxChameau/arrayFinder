package org.vieuxchameau.arrayFinder;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;
import static org.vieuxchameau.arrayFinder.ArrayFinder.findStartingPosition;

public class ArrayFinderTest {

	private static final int NOT_FIND = -1;

	@Test
	public void should_not_find_position_if_src_array_null() {
		final Integer[] source = null;
		final Integer[] toFind = {4, 5};

		final int position = findStartingPosition(source, toFind);

		assertThat(position).isEqualTo(NOT_FIND);
	}

	@Test
	public void should_not_find_position_if_nothing_to_find() {
		final Integer[] source = {2, 3, 4, 5};
		final Integer[] toFind = null;

		final int position = findStartingPosition(source, toFind);

		assertThat(position).isEqualTo(-1);
	}

	@Test
	public void should_find_index_position() {
		final Integer[] source = {2, 3, 4, 5};
		final Integer[] toFind = {4, 5};

		final int position = findStartingPosition(source, toFind);

		assertThat(position).isEqualTo(2);
	}
}