public class Solution01 {
	
	public static boolean uniqueCharacters(final String s){
		//use dict to store the occurances of 256 ASCII characters
		int[] dict = new int[256];
		for(int i = 0; i<s.length(); ++i){
			//each char should appear once, so if 
			//s[i] > 1, i must appear more than once
			dict[s.charAt(i)]++;
			if(dict[s.charAt(i)]>1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde","start","apple","jay"};
		for(String word : words){
			System.out.print(word+": ");
			if(uniqueCharacters(word))
				System.out.println("Unique");
			else
				System.out.println("Not unique");
		}
	}
}
