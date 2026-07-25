package trees.problems.height;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class HeightOfTree {
    static int findHeight(TreeNode root){
        if (root == null) return 0;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        System.out.println("Height of the tree: " + findHeight(root));
        TreeNode root1 = null;
        System.out.println("Height of the tree: " + findHeight(root1));
    }
}
