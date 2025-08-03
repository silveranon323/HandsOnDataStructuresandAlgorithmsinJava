package Trees;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SimpleTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        System.out.println("Root: " + root.data);
        System.out.println("Left child: " + root.left.data);
        System.out.println("Right child: " + root.right.data);
    }
}
