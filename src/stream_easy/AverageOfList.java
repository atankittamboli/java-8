package stream_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfList {

	public static void main(String[] args) {

//		calculate the average of even numbers in a list of integers ?
		List<Integer> list = Arrays.asList(1,21,33,4,54,6,10,2,3);
		
		OptionalDouble result =  list.stream().filter(i->i%2==0).mapToInt(n->n).average();
		
		System.out.println(result);
	}

}
