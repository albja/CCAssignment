
public class Solution09 {

	public static boolean isRotation(String s1, String s2){
		//if s2 is a rotation of s1, when concatenate two s2, 
		//s2+s2 must contain s1 
		if(s1.length() != s2.length())
			return false;
		return !((s2+s2).indexOf(s1) == -1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle", s2 = "erbottlewat";
		System.out.println(s1);
		System.out.println(s2);
		boolean b = isRotation(s1, s2);
		if(b)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
