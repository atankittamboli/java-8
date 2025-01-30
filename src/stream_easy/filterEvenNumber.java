package stream_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterEvenNumber {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(1,2,3,4,5);
		
		List<Integer> resultList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(resultList);
	}
}
