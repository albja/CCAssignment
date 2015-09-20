public class Solution08 {
	 //Singly-linked list.
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; next = null; }
	 }
	 
    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode oneStep = head, twoStep = head, middle;
        //twoStep moves 1 step faster than oneStep, if
        //there is a loop, twoStep will catch oneStep from back
        while(twoStep != null && twoStep.next != null){
            twoStep = twoStep.next.next;
            oneStep = oneStep.next;
            if(oneStep == twoStep)
                break;
        }
        //there is no cycle
        if(twoStep == null || twoStep.next == null)
            return null;
        middle = oneStep;
        oneStep = head;
        //since they move the same length, they will meet
        //at the begining of the loop
        while(oneStep != middle){
            oneStep = oneStep.next;
            middle = middle.next;
        }
        return oneStep;
    }
    
	public static void main(String[] args) {
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(4);
		ListNode p5 = new ListNode(5);
		ListNode p6 = new ListNode(3);
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=p5;
		p5.next=p6;
		p6.next=p3;
		ListNode scan = p1;
		System.out.print("input:  ");
		for(int i=0; i<5; i++){
			System.out.print(scan.val+"->");
			scan = scan.next;
		}
		System.out.println(scan.val);
		System.out.print("output: ");
		ListNode ret = detectCycle(p1);
		if(ret != null){
			System.out.println(ret.val+" ");
		}else
			System.out.println("null");
	}
}
