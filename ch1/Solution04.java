
public class Solution04 {

	public static boolean isPalindromePermutation(String s){
		int[] ch = new int[256];
		int sum = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) ==  ' ')
				continue;
			char c = Character.toLowerCase(s.charAt(i));
			if(ch[c] != 0)
				ch[c]--;
			else
				ch[c]++;
		}
		for(int i=0; i<256; i++){
			sum += ch[i];
			if(sum > 1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"Tact Coa","addeb"};
		for(String word : words){
			System.out.println(word+" ");
			if(isPalindromePermutation(word))
				System.out.println("is permutation");
			else
				System.out.println("not permutation");
		}
	}
}
