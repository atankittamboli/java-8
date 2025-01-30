package stream_easy;

import java.util.Arrays;
import java.util.List;

public class sumOfArray {

	public static void main(String[] args) {
		
		//java 7
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
 
        // java 8
        int sumForjava8 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("sumForjava8: " + sumForjava8);
        
	}

}
