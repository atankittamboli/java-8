package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerToString {

	public static void main(String[] args) {

//		1:-a list of integers to a comma-separated string ?
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);
		
		String result = list.stream()
		.map(i-> String.valueOf(i))
		.collect(Collectors.joining(", "));
		
		System.out.println(result);
	}

}
