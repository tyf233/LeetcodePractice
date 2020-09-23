public class solution21 
{
    public static class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if (l1 == null && l2 == null) return null;
        ListNode head = new ListNode();
        ListNode p = head;
        while (l1 != null || l2 != null)
        {
            if(l1 == null) 
            {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
                continue;
            }
            if(l2 == null) 
            {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
                continue;
            }
            if(l1.val <= l2.val)
            {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            } 
            else 
            {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        return p.next;
    }

    public static void main(String[] args) 
    {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(2);
        ListNode c1 = new ListNode(4);
        //a.next = b;
        //b.next = c;
        a1.next = b1;
        b1.next = c1;
        ListNode head = mergeTwoLists(a, null);
        while (head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
