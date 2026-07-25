package trees.problems.identical;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class IdenticalTrees {
    static boolean areIdentical(TreeNode t1, TreeNode t2){
        // Both are null
        if (t1 == null && t2 == null) return true;
        // One is null
        if (t1 == null || t2 == null) return false;
        // The data of the two nodes are not matching
        if (t1.data != t2.data) return false;
        // Do a check for the left & right subtrees [Recursion]
        return areIdentical(t1.left, t2.left) &&
                areIdentical(t1.right, t2.right);
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);

        TreeNode t3 = new TreeNode(1);
        t3.left = new TreeNode(2);
        t3.right = new TreeNode(4);
        System.out.println((areIdentical(t1,t2)) ? "Identical" :
                "Not Identical");
        System.out.println((areIdentical(t1,t3)) ? "Identical" :
                "Not Identical");
    }
}
