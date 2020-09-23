import java.util.Stack;

public class solution207 
{
    public static class ListNode
    {
        int data;
        ListNode next;
        //ListNode (int x) {val = x;}

        //public ListNode() {
        //}
    }
    public static ListNode reverseList (ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static class PrintListReverse
    {
       //输入一个头结点然后利用栈操作完成逆序输出
        public void print_reverse(ListNode listNode)
        {
            Stack<ListNode> stack = new Stack<ListNode>(); 
            //将节点入栈
            while(listNode!=null){
                stack.push(listNode);
                listNode = listNode.next;
                }
            //节点出栈
            while(!stack.empty()){
                System.out.println(stack.pop().data);
            }
        }
    }
    public static void main(String[] args) 
    {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.data = 1;
        node2.data = 3;
        node3.data= 5;
        node1.next = node2;
        node2.next = node3;
        PrintListReverse test = new PrintListReverse();
        test.print_reverse(node1);
        test.print_reverse(reverseList(node1));
    }
}
