package stream_Hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountVowels {

	public static void main(String[] args) {
		
//		1:- Count Vowels: Given a list of strings, use map to count the vowels
//		in each string and return a list of counts.
		List<String> list = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab",
				"EI", "YOU");
		
		List<Integer> vowelCounts = list.stream()
				.map(CountVowels::getVowels)
				.collect(Collectors.toList());

		System.out.println(vowelCounts);
	}
	
	private static int getVowels(String str) {
		
		return (int)str.toLowerCase()
				.chars().filter(i -> "aeiou".indexOf(i) != -1)
				.count();
	}

}
