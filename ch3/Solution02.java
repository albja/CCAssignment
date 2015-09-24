import java.util.*;

class MinStack {
	//use 2 stacks, stMin to store current minimal number 
    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> stMin = new Stack<Integer>();
    
    public void push(int x) {
        st.push(x);
        if(stMin.empty())
        	stMin.push(x);
        //if x<=current minimal number, update minimal number
        else if(x <= stMin.peek())
        	stMin.push(x);
    }

    public void pop() {
        int t = st.pop();
        //if current minimal number is popped, then update stMin
        if(!stMin.empty() && t == stMin.peek())
        	stMin.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return stMin.peek();
    }
}


public class Solution02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
