public class Solution05 {

	public static boolean isOneEditDistance(String word1, String word2){
		int m = word1.length(), n = word2.length();	
		//use the shorter one to compare
		if(m>n)	
			return isOneEditDistance(word2, word1);
		if(n-m>1) 
			return false;
		for(int i=0; i<m; i++){
			if(word1.charAt(i) != word2.charAt(i)){
				//if w1 and w2 are one distance, they should have
				//equal substr after deleting the different character
				return (word1.substring(i).equals(word2.substring(i+1)) ||
						word1.substring(i+1).equals(word2.substring(i+1)));
			}
		}
		return n-m <= 1;	
	}
	
	
	public static void main(String[] args) {
		String s1= "bake", s2 = "baku";
		System.out.println(s1);
		System.out.println(s2);
		boolean b = isOneEditDistance(s1,s2);
		if(b)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
