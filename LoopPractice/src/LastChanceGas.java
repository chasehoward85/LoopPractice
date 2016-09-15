import java.io.*;
import java.util.*;

public class LastChanceGas {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is your tank capacity?");
		int cap = kbReader.nextInt();
		System.out.println("What percentage is the guage at?");
		int per = kbReader.nextInt();
		System.out.println("What is your MPG?");
		int mpg = kbReader.nextInt();
		
		int mL = ((cap * per) / 100) * mpg;
		
		if(mL < 200){
			System.out.println("Get Gas!");
		}
		else{
			System.out.println("Safe to Proceed");
		}

	}

}
