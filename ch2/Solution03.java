public class Solution03 {
	 //Singly-linked list.
	static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; next = null; }
	}
	
	public static void deleteMiddleNode(ListNode mid){
		ListNode ptr = mid;
		//copy the val of next node and delete next node
		if(ptr != null && ptr.next != null){
			ptr.val = ptr.next.val;
			ptr.next = ptr.next.next;
		}
	}
	
	public static void main(String[] args) {
		 ListNode p1 = new ListNode(1);
		 ListNode p2 = new ListNode(2);
		 ListNode p3 = new ListNode(3);
		 ListNode p4 = new ListNode(4);
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
		 System.out.println(scan.val+"");		 
		 deleteMiddleNode(p3);
		 scan = p1;
		 System.out.print("Output: ");
		 while(scan.next != null){
			 System.out.print(scan.val+"->");
			 scan = scan.next;
		 }
		 System.out.println(scan.val+"");
	}

}
