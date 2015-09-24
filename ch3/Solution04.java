import java.util.*;

//Assume all the operations are valid
class MyQueue{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);    
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        if(s2.empty()){
            while(!s1.empty())
                s2.push(s1.pop());
        }
        return s2.peek();   
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (s1.empty() && s2.empty());
    }
}

public class Solution04 {
	public static void main(String[] args) {
		MyQueue st = new MyQueue();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		st.push(5);
		System.out.println(st.peek());
	}

}
