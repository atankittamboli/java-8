package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skipElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		
		List<Integer> result = list.stream().skip(1).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
