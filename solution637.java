import java.util.ArrayList;
import java.util.List;

public class solution637
{
    public static class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
    public static List<Double> averageOfLevels(TreeNode root) 
    {
        List<Integer> counts = new ArrayList<Integer>();  //每层节点数量
        List<Double> sums = new ArrayList<Double>(); //每层和
        dfs(root, 0, counts, sums);
        List<Double> averages = new ArrayList<Double>(); //存放平均值
        int size = sums.size();
        for (int i = 0; i < size; i++)
        {
            averages.add(sums.get(i)/counts.get(i));
        }
        return averages;
    }
    public static void dfs(TreeNode root, int level, List<Integer> counts, List<Double> sums)
    {
        if (root == null)
        {
            return;
        }
        if (level < sums.size())
        {
            sums.set(level, sums.get(level) + root.val);
            counts.set(level, counts.get(level) + 1);
        }
        else
        {
            sums.add(1.0 * root.val);
            counts.add(1);
        }
        dfs(root.left, level + 1, counts, sums);
        dfs(root.right, level + 1, counts, sums);
    }
    
    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(1);
        TreeNode zuo = new TreeNode(2);
        TreeNode you = new TreeNode(4);
        root.left = zuo;
        root.right = you;
        for(int i = 0; i < averageOfLevels(root).size(); i++)
        {
            System.out.println(averageOfLevels(root).get(i));
        }
    }
}
