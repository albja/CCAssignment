
public class Solution06 {
	
	public static String stringCompression(String s){
		int len = s.length(), count = 1;
		if(s.length() == 0) 	return new String();
		char pre = s.charAt(0);
		//use a new string to store the compressed string
		StringBuffer ret = new StringBuffer();
		for(int i=1; i< len; ++i){
			if(s.charAt(i) == pre)
				//count duplicate charaters
				count++;
			else{
				//add count number 
				ret.append(pre);
				ret.append(count);
				count = 1;
				pre = s.charAt(i);		
			}
		}
		ret.append(pre);
		ret.append(count);
		return ret.length() < len ?  ret.toString() : s;
	}

	public static void main(String[] args) {
		String s = "abcccccaaad";
		System.out.println(s);
		System.out.println(stringCompression(s));
	}

}
