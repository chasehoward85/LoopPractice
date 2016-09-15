import java.io.*;
import java.util.*;

public class AddingUpIntegers {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("How many integers will be added?");
		int intNum = kbReader.nextInt();
		
		int intSum = 0;
				
		for (int i = 0; i < intNum; i++){
			Scanner kbReader2 = new Scanner(System.in);
			System.out.println("Enter an integer");
			int x = kbReader2.nextInt();
			intSum = intSum + x;
		}
		
		System.out.println("The sum is " + intSum);

	}

}
