package stream_Hard;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StringAverageLength {

	public static void main(String[] args) {

//		1:-Calculate Average Length: Given a list of strings,
//		use map to get the lengths and then calculate 
//		the average length of the strings.
		List<String> list = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab",
				"EI", "YOU");

		
		OptionalDouble averageLength = list.stream()
				.mapToInt(String::length).average();
		
		System.out.println(averageLength);
	}

}
