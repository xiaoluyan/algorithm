package listnode;

/**
 * 删除链表中的一个结点
 * @author Luyan Xiao
 *
 */
public class J13DeleteNodeInList {
	/**
	 * 法2：effective.在O(1)的时间内删除一个结点，但需要假设要删除的结点在链表中.
	 * @param headListNode
	 * @param delListNode
	 */
	public void deleteNodeInList(ListNode headListNode, ListNode delListNode) {
		if(headListNode == null || delListNode == null) {
			try {
				throw new Exception("bad input.");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		
		//链表中有多个结点，要删除的结点不是尾结点
		if(headListNode.next != null) {
			ListNode next = delListNode.next;
			delListNode.val = next.val;
			delListNode.next = next.next;
			next = null;
		} else if(headListNode == delListNode) { //链表只有一个结点，要删除的结点既是头结点也是尾结点。
			headListNode = delListNode = null;   //因java的通过传值来传递引用特点，原始引用并不为null
		} else {//链表中有多个结点，但删除的是尾结点。故删除时需要顺序查找
			ListNode pListNode = headListNode;
			while(pListNode.next != delListNode) {
				pListNode = pListNode.next;
			}
			pListNode.next = null;
		}
	}
	
	public static void main(String[] args) {
		
		J13DeleteNodeInList j13DeleteNodeInList = new J13DeleteNodeInList();
		ListNode headListNode = new ListNode(1);
//		ListNode listNode2 = new ListNode(2);
//		headListNode.next = listNode2;
//		ListNode listNode3 = new ListNode(3);
//		listNode2.next = listNode3;
//		//测试1：多个结点删除不是尾结点的结点
//		J13DeleteNodeInList.deleteNodeInList(headListNode, listNode2);
//		System.out.println(headListNode.next.val);
		
		//???只有一个结点删除有问题,需要把原始引用赋值为null
		j13DeleteNodeInList.deleteNodeInList(headListNode, headListNode);
		System.out.println(headListNode.val);
	}
}
