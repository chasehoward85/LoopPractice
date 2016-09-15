import java.io.*;
import java.util.*;

public class WordRepeat {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = kbReader.nextLine();
		int wordLen = word.length();
		
		for(int i = 0; i < wordLen; i++){
			System.out.println(word);
		}

	}

}
