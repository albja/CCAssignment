public class Solution06 {
	 //Singly-linked list.
	static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; next = null; }
	}
	 
	public static boolean isPalindrome(ListNode head) {
        if(head == null)
    		return true;
    	ListNode walk = head, run = head.next, mid;
    	//find mid node of list
    	while(run != null && run.next != null){
    		run = run.next.next;
    		walk = walk.next;
    	}
    	mid = walk.next;
    	walk.next = null;
    	//reverse the second half of the list
    	while(mid != null){
    		ListNode tmp = mid.next;
    		mid.next = walk;
    		walk = mid;
    		mid = tmp;
    	}
    	//cheack the two sublist to see if they are palindrome
    	run = head;
    	while(walk != null && run != null){
    		if(walk.val != run.val)
    			return false;
    		walk = walk.next;
    		run = run.next;
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(3);
		ListNode p5 = new ListNode(2);
		ListNode p6 = new ListNode(1);
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=p5;
		p5.next=p6;
		ListNode scan = p1;
		System.out.print("input:  ");
		for(int i=0; i<5; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		}
		System.out.println(scan.val);
		System.out.print("output: ");
		boolean ret = isPalindrome(p1);
		if(ret){
			System.out.println("Yes, it is palindrome!");
		}else
			System.out.println("no, it is not palindrome.");
	}
}
