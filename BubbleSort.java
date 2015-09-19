package bubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
	        String[] numbers = scanner.nextLine().replace("[", "").replace("]", "").split(", ");
	        ArrayList<Integer> numbersArr = new ArrayList<Integer>();
	        for(String number: numbers){
	        	numbersArr.add(Integer.parseInt(number));
	        }
	        
	        //TODO: Parse the numbers and add them to the list
//	        StopWatch stopWatch = new StopWatch();
//	        stopWatch.start();
	
	        //TODO: Write the sorting algorithm that you use for sorting the List's elements
	        Sort(numbersArr);
//	        stopWatch.stop();
//	        long time = stopWatch.getTime();
	
	        System.out.println(numbersArr);
	//        System.out.println(time/1000.0);
		}
		finally{
			scanner.close();
		}
	}
	public static void Sort(ArrayList<Integer> numbers){
		boolean swap;
		int count = 0;
		do{
			swap = false;
			for(int i = 1; i < numbers.size() - count; i++){
				if (numbers.get(i-1) > numbers.get(i)){
					swap = true;
					int a = numbers.get(i);
					numbers.set(i, numbers.get(i - 1));
					numbers.set(i - 1, a);
				}
			}
			count++;
		}
		while(swap);
	}
}
