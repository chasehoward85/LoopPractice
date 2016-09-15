import java.io.*;
import java.util.*;

public class PieEatingContest {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is your weight?");
		int wei = kbReader.nextInt();
		
		if(wei < 170){
			System.out.println("Contestant too light. Not allowed to compete");
		}
		if(wei > 230){
			System.out.println("Contestant too heavy. Not allowed to compete");
		}
		else if(wei >= 170 && wei <= 230){
			System.out.println("Contestant allowed to compete");
		}

	}

}
