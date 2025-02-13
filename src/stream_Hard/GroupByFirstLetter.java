package stream_Hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {

	public static void main(String[] args) {
		
//		1:-Group by First Letter: Given a list of names,
//		group them by their first letter
		
		List<String> list = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab",
				"EI", "YOU");


		Map<Character, List<String>> result = list.stream()
				.map(i-> i.toLowerCase())
				.collect(Collectors.groupingBy(i-> i.charAt(0)));
		
		System.out.println(" result "+result);

	}
}
