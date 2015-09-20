
public class Solution02 {

	public static boolean isPermutation(String s1, String s2){
		//use dict to store the occurances of 256 ASCII characters
		int[] ch = new int[256];
		//each char of a string should have a pairwise char in another
		//array or it cannot be a permutation
		for(int i=0; i<s1.length(); ++i)
			if(s1.charAt(i) != ' ')
				ch[s1.charAt(i)]++;
		for(int i=0; i<s2.length(); ++i)
			if(s2.charAt(i) != ' ')
				if(--ch[s2.charAt(i)] < 0)
					return false;
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcdef","afdceb"};
		for(String word : words)
			System.out.println(word+" ");
		
		if(isPermutation(words[0], words[1]))
				System.out.println("is permutation");
			else
				System.out.println("not permutation");
	}
}
