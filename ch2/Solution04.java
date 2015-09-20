
public class Solution04 {
	 //Singly-linked list.
	 static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; next = null; }
	 }
	
    public static ListNode partition(ListNode head, int x) {
        ListNode p1 = new ListNode(4);
        ListNode p2 = new ListNode(0);
        //Use 2 fake head nodes to store lists with nodes less
        //than x and greater than or equal to x
        ListNode pp1 = p1, pp2 = p2, scan = head;
        while(scan != null){
            if(scan.val < x){
                pp1.next = scan;
                pp1 = pp1.next;
            }else{
                pp2.next = scan;
                pp2 = pp2.next;
            }
            scan = scan.next;
        }
        pp2.next = null;
        pp1.next = p2.next;
        return p1.next;
    }
    
	public static void main(String[] args) {
		ListNode p1 = new ListNode(3);
		ListNode p2 = new ListNode(4);
		ListNode p3 = new ListNode(8);
		ListNode p4 = new ListNode(5);
		ListNode p5 = new ListNode(10);
		ListNode p6 = new ListNode(2);
		ListNode p7 = new ListNode(1);		
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=p5;
		p5.next=p6;
		p6.next=p7;
		ListNode scan = p1;
		System.out.print("input:  ");
		while(scan != null){
			System.out.print(scan.val+" ");
			scan = scan.next;
		}
		System.out.println("partition:5");
		System.out.print("output: ");
		ListNode ret = partition(p1, 5);
		while(ret != null){
			System.out.print(ret.val+" ");
			ret = ret.next;
		}
	}
}
