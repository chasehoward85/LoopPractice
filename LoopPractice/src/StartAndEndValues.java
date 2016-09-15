import java.io.*;
import java.util.*;

public class StartAndEndValues {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter starting number");
		int sta = kbReader.nextInt();
		System.out.println("Enter ending number");
		int end = kbReader.nextInt();
		
		for(int i = sta; i <= end; i++){
			System.out.println(i);
		}

	}

}
