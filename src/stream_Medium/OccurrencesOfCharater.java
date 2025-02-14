package stream_Medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrencesOfCharater {

	public static void main(String[] args) {

//		1:-count the occurrences of a each character in a list of strings?
		List<String> list = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab",
				"EI", "YOU");
		
		
		 Map<Object, Long> characterCount = list.stream().flatMap(str-> str.chars().mapToObj(c->(char)c))
		.collect(Collectors.groupingBy(c-> c, Collectors.counting()));
		
		System.out.println(characterCount);

		
//		2:- particular char count
		Long result = list.stream().flatMapToInt(i->i.chars().filter(j->j=='Y')).count();
		
		System.out.println(result);
	}
	
}
