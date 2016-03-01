package listnode;

public class J15FindKthToTailInListNode {
	
	/**
	 * 题目： 输入一个链表，输出该链表中倒数第k个结点。为了符合大多数人的习惯，
	 * 本题从1开始计数，即链表的尾结点是倒数第1个结点。 例如一个链表有6个结点，
	 * 从头结点开始它们的值依次是1，2，3，4，5，6.这个链表的倒数第3个结点是值为4的结点。
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode findKthToTailInListNode(ListNode head, int k) {
		
		//链表为空或k为0，无意义
		if(head == null || k == 0) {
			try {
				throw new Exception("bag input.");
			} catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		ListNode aListNode = head;
		ListNode bListNode = null;
		//第一个指针先走k-1步
		for(int i = 0; i < k - 1; i++) {
			if(aListNode.next != null) { //判断链表的大小是否比K小
				aListNode = aListNode.next;
			} else {
				return null;
			}
		}
		bListNode = head;
		//两个指针一起向前走，当第一个指针指向尾结点时，第二个指针指向的正好是倒数第K个结点
		while(aListNode.next != null) { //判断链表的大小是否比K小
			aListNode = aListNode.next;
			bListNode = bListNode.next;
		}
		
		return bListNode;
	}
	
	public static void main(String[] args) {
        ListNode head = new ListNode(1);  
        ListNode second = new ListNode(2);  
        ListNode third = new ListNode(3);  
        ListNode forth = new ListNode(4);
        head.next = second;  
        second.next = third;  
        third.next = forth;  
        ListNode res = J15FindKthToTailInListNode.findKthToTailInListNode(head, 5);
        System.out.println(res.val);
	}
}
