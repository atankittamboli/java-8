package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertIntergerToString {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		
		List<String> result = list.stream()
		.map(String::valueOf)
		.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> result1 = list.stream()
				.map(i-> String.valueOf(i))
				.collect(Collectors.toList());
		System.out.println(result1);

	}

}
