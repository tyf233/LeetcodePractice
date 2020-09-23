public class solution101 
{
    public static class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static boolean isSymmetric(TreeNode root) 
    {
        return check(root, root);
    }

    public static boolean check(TreeNode p, TreeNode q)
    {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    public static void main(String[] args) 
    {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        a.left = b;
        a.right = c;
        System.out.println(isSymmetric(a));
    }
}
