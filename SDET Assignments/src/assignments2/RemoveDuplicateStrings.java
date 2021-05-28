package assignments2;
import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicateStrings {

		static List<String> words;
		
		public static void main(String[] args) {
			words = new ArrayList<String>();
			System.out.println("Adding Words..");
			words.add("THE");
			words.add("OF");
			words.add("GUEST");
			words.add("VERY");
			words.add("NEXT");
			words.add("THE");
			words.add("SORRY");
			words.add("THANKS");
			words.add("THE");
			words.add("REST");
			words.add("VERY");
			words.add("GUEST");
			
			System.out.println("Printing Words");
			words.forEach(System.out::println);
			
			System.out.println("Removing Duplicate Words");
			words = removeDuplicateWords(words);
			words.forEach(System.out::println);
					
		}
		
		static List<String> removeDuplicateWords(List<String> words){
			List<String> uniqueWords = new ArrayList<String>();
			if(!words.isEmpty()) {
				for(String word : words) {
					if(!uniqueWords.contains(word)) {
						uniqueWords.add(word);
					}
				}
			}
			return uniqueWords;
		}
	}
