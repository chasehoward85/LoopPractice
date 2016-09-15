import java.io.*;
import java.util.*;

public class DiscountPrices {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is the total amount in cents?");
		int am = kbReader.nextInt();
		int tot;
		int dis;
		
		if(am >= 2000){
			dis = am * 10;
			tot = (dis - am) / 10;
			System.out.println("The discounted price is " + tot);
		}
		
		else{
			System.out.println("The total is not enough for a discount");
		}

	}

}
