package stream_Hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndConcatenate {

	public static void main(String[] args) {
		
// 		1:-Filter and Concatenate: Given a list of strings, filter those
//		that contain the letter 'a' and concatenate them into a single string.

		List<String> list = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab",
				"EI", "YOU");

		String result  = list.stream()
		.map(i-> i.toLowerCase())
		.filter(j->j.contains("a")).collect(Collectors.joining(", "));
		
		System.out.println(result);

	}
}