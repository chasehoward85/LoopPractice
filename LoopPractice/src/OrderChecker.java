import java.io.*;
import java.util.*;
public class OrderChecker {
	
	public static void main(String[] args){
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("How many bolts did you order?");
		int bolts = kbReader.nextInt();
		System.out.println("How many nuts did you order?");
		int nuts = kbReader.nextInt();
		System.out.println("How many washers did you order?");
		int wash = kbReader.nextInt();
		
		final int boltPrice = 5;
		final int nutPrice = 3;
		final int washPrice = 1;
		
		int totCost = (bolts * boltPrice) + (nuts * nutPrice) + (wash * washPrice);
		
		if(nuts < bolts){
			System.out.println("Number of bolts: " + bolts + "\nNumber of nuts: " + nuts
					+ "\nNumber of washers: " + wash);
			System.out.println("\nCheck the order: Too few nuts");
			System.out.println("\nTotal cost: " + totCost);
		}
		if(wash != bolts * 2){
			System.out.println("Number of bolts: " + bolts + "\nNumber of nuts: " + nuts
					+ "\nNumber of washers: " + wash);
			System.out.println("\nCheck the order: Too few washers");
			System.out.println("\nTotal cost: " + totCost);
		}
		if(nuts < bolts && wash != bolts * 2){
			System.out.println("Number of bolts: " + bolts + "\nNumber of nuts: " + nuts
					+ "\nNumber of washers: " + wash);
			System.out.println("\nCheck the order: Too few nuts");
			System.out.println("Check the order: Too few washers");
			System.out.println("\nTotal cost: " + totCost);
		}
		else{
			System.out.println("Number of bolts: " + bolts + "\nNumber of nuts: " + nuts
					+ "\nNumber of washers: " + wash);
			System.out.println("\nOrder is ok");
			System.out.println("\nTotal cost: " + totCost);
		}
	}
}
