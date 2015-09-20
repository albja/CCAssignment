

public class Solution02 {
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val=x; next=null;}
	}
	
	public static ListNode iterReturnKth(ListNode head, int k){
		int i=0;
		ListNode p = head;
		//first move 1st pointer k-1 step
		while(head != null && i<k-1){
			p = p.next;
			i++;
		}
		//move both pointers until p move to the end of list
		//and then p will be the kth pointer to the last element 
		if(i<k-1)		return null;
		while(p.next != null){
			head = head.next;
			p = p.next;
		}
		return head;
	}
	
	public static int recurReturnKth(ListNode head, int k, ListNode p){
		//base case, return 0 when reach the end of list
		if(head == null)	return 0;
		//add 1 to each return of the passing call through stack 
		int n = recurReturnKth(head.next, k, p)+1;
		if(n == k)
			p.next = head;
		return n; 
	}
	
	public static void main(String[] args) {
		 ListNode p1 = new ListNode(1);
		 ListNode p2 = new ListNode(2);
		 ListNode p3 = new ListNode(1);
		 ListNode p4 = new ListNode(2);
		 ListNode p5 = new ListNode(5);
		 p1.next=p2;
		 p2.next=p3;
		 p3.next=p4;
		 p4.next=p5;
		 ListNode scan = p1;
		 System.out.print("Input:  ");
		 while(scan.next != null){
			 System.out.print(scan.val+"->");
			 scan = scan.next;
		 }
		 System.out.println(scan.val);		 
		 ListNode p = iterReturnKth(p1,2);
		 System.out.print("Output: ");
		 System.out.println(p.val);		
	}

}
