package excercises;

import java.util.HashSet;
import java.util.Set;

public class LongestPaliandrome {
	
	 public static void main(String[] args) {
		 String str = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE";
		 System.out.println("Input String : "+str);
		 String string = longestPaliandromeString(str);		 
		 System.out.println("Longest Paliandrome : "+string);
	    }
	 
	 public static String longestPaliandromeString(String s){
		 String longestPaliandrome= "", currentPaliandrome = "";
		 Set<String> allPaliandromes = new HashSet<String>();
		 
		 
		 int rightIndex = 0, leftIndex = 0;

		 for(int centerIndex = 1; centerIndex < s.length()-1; centerIndex++){
			 leftIndex = centerIndex - 1;
			 rightIndex = centerIndex + 1;
			 
			 while(leftIndex >= 0 && rightIndex < s.length()){
				 if(s.charAt(leftIndex) != s.charAt(rightIndex))
				 { break;}
				 else
				 {leftIndex --; rightIndex++;}
			 currentPaliandrome = s.substring(leftIndex+1,rightIndex);
			 allPaliandromes.add(currentPaliandrome);
			 if(currentPaliandrome.length() > longestPaliandrome.length()){longestPaliandrome=currentPaliandrome;}
			 
			 }
		 }
		 System.out.println("All Paliandromes : " +allPaliandromes);
		 return longestPaliandrome ;
	 }
}
