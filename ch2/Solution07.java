public class Solution07 {
	 //Singly-linked list.
	 static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; next = null; }
	 }
	 
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	      ListNode pA = headA, pB = headB;
	      //pA and pB move the same distance, thus they must intersect or
	      //both move to null in some time
	      while(pA != pB){
	    	  pA = pA == null ? headB : pA.next;
	          pB = pB == null ? headA : pB.next;
	      }
	      return pA;
	 }	
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ListNode p1 = new ListNode(1);
		 ListNode p2 = new ListNode(2);
		 ListNode p3 = new ListNode(3);
		 ListNode p4 = new ListNode(4);
		 ListNode p5 = new ListNode(5);
		 ListNode p6 = new ListNode(6);
		 p1.next=p2;
		 p2.next=p5;
		 p3.next=p4;
		 p4.next=p5;
		 p5.next=p6;
		 ListNode scan = p1;
		 System.out.print("input:  ");
		 for(int i=0; i<2; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		 }
		 System.out.println();
		 System.out.print("               ");
		 System.out.print(scan.val+"->");
		 scan = scan.next;
		 System.out.print(scan.val+"->");
		 System.out.println();		 
		 
		 scan = p3;
		 System.out.print("        ");
		 for(int i=0; i<2; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		 }
		 System.out.println();		 
		 System.out.print("output: ");
		 ListNode ret = getIntersectionNode(p1, p3);
		 if(ret != null){
			System.out.println(ret.val+" ");
		 }else
			System.out.println("null");
	}

}
