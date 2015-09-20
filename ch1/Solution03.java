public class Solution03 {
	
	public static void replaceSpaces(char[] s, int len){
		int i=0, count = 0;
		//count the number of space
		while(i<len){
			if(s[i++] == ' ')
				count++;
		}
		//compute the length of new string
		int nlen = len + 2*count;
		i = len - 1;
		int j = nlen-1;
		//assign the char value from the end
		//if character is space, replace it with %20
		//otherwise just copy the value
		while(i>=0){
			if(s[i] == ' '){
				s[j--] = '0';
				s[j--] = '2';
				s[j--] = '%';		
			}
			else
				s[j--] = s[i];
			i--;
		}
		//add terminal identifier
		s[nlen] = '\0';
	}
	
	public static void main(String[] args) {
		String str = "Mr John Smith                     ";
		char[] s = str.toCharArray();
		System.out.println(s);
		replaceSpaces(s, 13);
		System.out.println(s);
	}

}
