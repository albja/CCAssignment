//Assume the each stack has fixed size
class threeStack{
	//use 3 pointer to maintain 3 stacks
	int size;	//suppose each stack has the same size
	int[] ptr = {-1,-1,-1};	//stack pointer
	int[] stackBuffer;
	
	public void initStack(int num){
		size = num;
		stackBuffer = new int[3*size];
	}
	
	//compute index of each stack, base address+offset
	public int getIndex(int stackNum){
		return size*stackNum + ptr[stackNum];
	}
	
	public void push(int elem, int stackNum){
		if(ptr[stackNum] + 1 >= size)	return;
		ptr[stackNum]++;
		stackBuffer[getIndex(stackNum)] = elem;
	}
	
	public int top(int stackNum){
		return stackBuffer[getIndex(stackNum)];
	}
	
	public int pop(int stackNum){
		int ret = top(stackNum);
		if(ptr[stackNum] - 1 < 0)	return Integer.MIN_VALUE;
		ptr[stackNum]--;
		return ret;
	} 	
}

class Solution01 {
	public static void main(String[] args) {
		threeStack st = new threeStack();
		st.initStack(50);
		st.push(1,0);
		st.push(2,1);
		st.push(3,2);
		st.push(-1,0);
		System.out.println("stack 0: "+st.top(0));
		System.out.println("stack 1: "+st.top(1));
		System.out.println("stack 2: "+st.top(2));
		st.pop(0);
		System.out.println("stack 0: "+st.top(0));
	}
}
