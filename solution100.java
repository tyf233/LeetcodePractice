public class solution100 
{
    public static class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) 
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        else if (p.val != q.val) return false;
        else  return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
    
    public static void main(String[] args)
    {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode a = new TreeNode(1, left, right);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode b = new TreeNode(1, left1, right1);
        System.out.println(isSameTree(a, b));
    }
}
