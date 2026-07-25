package trees.problems.mirror;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class MirrorTree {
    static void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    static TreeNode mirror(TreeNode root){
        if (root == null) return null;
        // Swapping of left & right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Recursively swap the left & right children
        if (root.left != null){
            mirror(root.left);
        }
        if (root.right != null){
            mirror(root.right);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Inorder Original: ");
        inOrder(root);
        System.out.println();
        root = mirror(root);
        System.out.println("Inorder Mirror: ");
        inOrder(root);
        System.out.println();


    }
}
