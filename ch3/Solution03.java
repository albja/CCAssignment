import java.util.*;

class SetOfStacks{
	ArrayList<Stack<Integer>> stackSet = new ArrayList<Stack<Integer>>();
	//ArrayList<Integer> indexOfTop = new ArrayList<Integer>();
	int size; //maximal capacity of one sub_stack
	int currentSt = 0; //index of current sub_stack 
	
	public void init(int x)	{ 
		size = x;
		stackSet.add(new Stack<Integer>());
	}
	
	public void push(int x){
		//start a new stack when previous stack exceeds threshold
		if(stackSet.get(currentSt).size() +1 > size){
			if(++currentSt > stackSet.size()-1)
				stackSet.add(new Stack<Integer>());
			stackSet.get(currentSt).push(x);
		}else{
			stackSet.get(currentSt).push(x);
		}	
	}
	
	public int pop(){
		int t = stackSet.get(currentSt).pop();
		//shrink to previous stack when current stack is empty
		if(stackSet.get(currentSt).isEmpty() && currentSt > 0)
			currentSt--;
		return t;
	}
	
	public int peek(){
		return stackSet.get(currentSt).peek();
	}

	public int popAt(int index){
		return stackSet.get(index).pop();
	}
}


public class Solution03 {
	public static void main(String[] args) {
		SetOfStacks st = new SetOfStacks();
		st.init(2);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.popAt(0));
	}

}
