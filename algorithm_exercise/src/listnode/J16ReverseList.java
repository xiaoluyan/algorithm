package listnode;

/**
 * 题目：输入一个链表，反转链表后，输出链表的所有元素。
 * @author Luyan Xiao
 *
 */
public class J16ReverseList {
	public static ListNode reverseList(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode reverseHead = null;
		ListNode pNode = head;
		//保存前一个结点指针
		ListNode prevNode = null;
		while(pNode != null) {
			//保存后一个结点指针
			ListNode nextNode = pNode.next;
			//反转后链表的头结点是原始链表的尾结点
			if(nextNode == null) {
				reverseHead = pNode;
			}
			//当前结点指向前一个结点
			pNode.next = prevNode;
			//前一结点到现任结点
			prevNode = pNode;
			//现任结点到下一个结点
			pNode = nextNode;
		}
		
		return reverseHead;
	}
	
	public static void main(String[] args) {
        ListNode head = new ListNode(1);  
        ListNode second = new ListNode(2);  
        ListNode third = new ListNode(3);  
        ListNode forth = new ListNode(4);
        head.next = second;  
        second.next = third;  
        third.next = forth;  
        ListNode res = J16ReverseList.reverseList(head);
        System.out.println(res.val);
	}
}
