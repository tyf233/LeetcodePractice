public class solution83 
{
    public static class ListNode 
    {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteDuplicates(ListNode head) 
    {
        if (head == null)  return head;
        ListNode q = head;
        while (q.next != null)
        {
            if (q.val == q.next.val)
                q.next = q.next.next;
            else
                q = q.next;
        }
        return head;
    }

    public static void main(String[] args) 
    {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(2);
        a.next = b;
        b.next = c;
        deleteDuplicates(a);
        while (a != null)
        {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
