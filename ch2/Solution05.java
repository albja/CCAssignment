import java.util.*;

public class Solution05 {
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; next = null;}
	}
	
	//sum list in reverse order
	public static ListNode sumList(ListNode p1, ListNode p2){
		ListNode sum = new ListNode(0);
		ListNode scan = sum;
		//use carry to store carry bit
		int carry = 0, digit = 0;
		while(p1 != null || p2 != null){
			digit = 0;
			if(p1 != null)	digit += p1.val;
			if(p2 != null)	digit += p2.val;
			digit += carry;
			carry = digit/10;
			digit %= 10;
			ListNode tmp = new ListNode(digit);
			scan.next = tmp;
			scan = scan.next;
			if(p1 != null)	p1 = p1.next;
			if(p2 != null)	p2 = p2.next;
		}
		//check if there is a carry bit for the
		//most significant digit
		if(carry > 0){
			ListNode tmp = new ListNode(carry);
			scan.next = tmp;
		}
		return sum.next;
	}

	//follow up: sum list in forward order
	public static ListNode sumList2(ListNode p1, ListNode p2){
		//use ArrayList to store each digit
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		while(p1 != null){
			a1.add(p1.val);
			p1 = p1.next;
		}
		while(p2 != null){
			a2.add(p2.val);
			p2 = p2.next;
		}
		//add from the end of the array, which is 
		//the least significant digit
		int carry = 0, i = a1.size()-1, j = a2.size()-1, digit = 0;
		ListNode pre = null, c = null;
		while(i>=0 || j>=0){
			digit = 0;
			if(i>=0)	digit += a1.get(i--);
			if(j>=0)	digit += a2.get(j--);
			digit += carry;
			c = new ListNode(digit%10);
			carry = digit/10;
			c.next = pre;
			pre = c;
		}
		if(carry > 0){
			c = new ListNode(carry);
			c.next = pre;
		}
		return c;
	}	
	
	
	public static void main(String[] args) {
		ListNode p1 = new ListNode(7);
		ListNode p2 = new ListNode(1);
		ListNode p3 = new ListNode(6);
		ListNode p4 = new ListNode(5);
		ListNode p5 = new ListNode(9);
		ListNode p6 = new ListNode(4);
		p1.next=p2;
		p2.next=p3;
		p4.next=p5;
		//p5.next=p6;
		ListNode scan = p1;
		System.out.print("input:  ");
		for(int i=0; i<2; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		}
		System.out.println(scan.val);
		scan = p4;
		System.out.print("input:  ");
		for(int i=0; i<1; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		}
		System.out.println(scan.val);
		System.out.print("output: ");
		ListNode ret = sumList2(p1,p4);
		scan = ret;
		for(int i=0; i<2; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		}
		System.out.println(scan.val);
	}

}
