package listnode;

public class J17Merge {
	
    public ListNode merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
        	return list2;
        }
        if(list2 == null) {
        	return list1;
        }
        
        ListNode mergeHead = null;
        if(list1.val < list2.val) {
        	mergeHead = list1;
        	mergeHead.next = merge(list1.next, list2);
        } else {
        	mergeHead = list2;
        	mergeHead.next = merge(list1, list2.next);
        }
        return mergeHead;
    }
}
