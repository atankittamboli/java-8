package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class squareNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);

		List<Integer> result = list.stream()
				.map(i-> i*i)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
