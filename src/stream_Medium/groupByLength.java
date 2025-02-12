package stream_Medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupByLength {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("A", "Bb", "CcC", "aBC", "Ac", "Ab");
		
//		1:-Group by Length of String
		Map<Integer, List<String>> result = names.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(" result "+result);
		
//		2:- Given a list of strings, filter for those longer than 1 characters 
//		and then convert them to uppercase.
		List<String> filterOperationMap = names.stream()
				.filter(i-> i.length()>1)
				.map(i-> i.toUpperCase())
				.collect(Collectors.toList());				
		
		System.out.println(" filterOperationMap "+filterOperationMap);


	}
}
