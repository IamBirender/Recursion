package Java;
public class HeightOfBinaryTree
{
   public static class TreeNode
{
    TreeNode left ;
    TreeNode right;
    int val;

    public TreeNode(int val)
    {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.left = null;
        this.right = null;
        this.val = val; 
    }
}


    public static int getHeight(TreeNode root)
{
    if(root == null)
    {
        return 0;
    }

    return 1 + Math.max(getHeight(root.left),
    getHeight(root.right));


}

public static void main(String[] args)
{
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);
    t.left.left = new TreeNode(3);
    System.out.println(getHeight(t));
}


}

