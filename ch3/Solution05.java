import java.util.*;

public class Solution05 {
	
	public static void Sort(Stack<Integer> st){
		Stack<Integer> r = new Stack<Integer>();
		while(!st.empty()){
			int tmp = st.pop();
			//put current smallest elem of st into r
			while(!r.empty() && tmp < r.peek()){
				st.push(r.pop());
			}
			r.push(tmp);
		}
		//pop elems from r into st, since r stores largest elems on the
		//top, st will stores the smallest elems on the top
		while(!r.empty())
			st.push(r.pop());
	}
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(2);
		st.push(1);
		st.push(3);
		st.push(5);
		Sort(st);
		while(!st.empty())
			System.out.println(st.pop());	
	}

}
