package stream_easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {		
		
//		1:- Find the longest string in a list of strings
		List<String> list = Arrays.asList("A", "Bb", "CcCDeF", "aBC", "Ac", "Ab",
				"EI", "YOU");

//		Optional<String> result  = list.stream().max(Comparator.comparing(String::length));
		Optional<String> result  = list.stream().max((a,b)-> a.length()- b.length());
		
		System.out.println(result);
		
	}

}
