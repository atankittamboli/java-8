package stream_Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortedByLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab");
		
//		1:-Sort by String Length
		List<String> result = list.stream()
				.sorted((a,b)-> Integer.compare(a.length(), b.length()))		
				.collect(Collectors.toList());
		
		System.out.println(" result "+result);
		
//		2:-Create a List of First Characters

		List<String> listOfFirstCharacter = list.stream()
				.map(i-> String.valueOf(i.charAt(0)))
				.collect(Collectors.toList());
		
		System.out.println(" listOfFirstCharacter "+listOfFirstCharacter);

	}

}