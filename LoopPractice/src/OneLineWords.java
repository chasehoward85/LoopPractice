import java.io.*;
import java.util.*;

public class OneLineWords {

		public static void main(String[] args){
			
			Scanner kbReader = new Scanner(System.in);
			System.out.println("Enter first word");
			String fw = kbReader.nextLine();
			System.out.println("Enter second word");
			String sw = kbReader.nextLine();
			
			int finlen = fw.length() + sw.length();
			
			System.out.print(fw);
			
			for(int i = finlen; i < 30; i++){
				System.out.print(".");
			}
			
			System.out.print(sw);
			
		}
}
