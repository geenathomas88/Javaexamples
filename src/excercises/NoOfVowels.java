//find no of vowels, consonants,words with string API
package excercises;

public class NoOfVowels {
	public static void main(String args[]){
		NoOfVowels nov = new NoOfVowels();
		String str = "Good Morning world, Have A great day";
		nov.noOfVowelsAndConsonants(str);
		System.out.print("Number of words in the given string : "+ nov.noOfWords(str));
	}
	void noOfVowelsAndConsonants(String s){
		//char[] vowels = {'a', 'e', 'i','o','u'};
		int noofvowels = 0, noofconsonants=0; 		
		s= s.toLowerCase();
		for(int i = 0; i< s.length();i++){
			char ch = s.charAt(i);			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){				
				noofvowels++;
			}
			else if(Character.isWhitespace(ch)){}
			else
				noofconsonants++;
		}
		System.out.println("Number of consonants in the given string : "+noofconsonants);
		System.out.println("Number of vowels in the given string : "+noofvowels);	
	}

	int noOfWords(String s){
		String[] temp = s.split(" ");
		return temp.length;	
	}
	int noOfLetters(String s){
		//TODO
		int noofletters= 0;		
		return noofletters;
	}
}
