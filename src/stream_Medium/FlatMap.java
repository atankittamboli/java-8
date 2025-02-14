package stream_Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// List of lists of integers
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
        );

        // Flattening the list of lists into a single list of integers using flatMap
        List<Integer> flattenedList = listOfLists.stream()
                                                 .flatMap(List::stream) // Flatten each list into a stream
                                                 .collect(Collectors.toList()); // Collect into a single list

        // Printing the flattened list
        System.out.println(flattenedList);

	}

}
