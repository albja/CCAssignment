import java.util.*;

public class Solution01 {
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x; next = null; }
	}
	
	//follow up: if temporary buffer is not allowed
	public static void removeDups(ListNode p){
		ListNode walk, pre = null;
		if(p == null || p.next == null)		return;
		//for each different node, traverse the list to delete dups
		while(p != null){
			walk = p.next;
			pre = p;
			//delete all dups of p
			while(walk != null){
				if(walk.val == p.val){
					pre.next = walk.next;
				}else
					pre = walk;
				walk = walk.next;
			}
			p = p.next;
		}
	}
	
	public static void removeDups2(ListNode p){
		HashSet<Integer> dict = new HashSet<Integer>();
		ListNode pre = null;
		while(p != null){
			//delete the node if it is duplicated
			if(!dict.add(p.val))
				pre.next = p.next;
			else
				pre = p;
			p = p.next;
		}
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
		 removeDups(p1);
		 scan = p1;
		 System.out.print("Output: ");
		 while(scan.next != null){
			 System.out.print(scan.val+"->");
			 scan = scan.next;
		 }
		 System.out.println(scan.val+"");
	}
}
