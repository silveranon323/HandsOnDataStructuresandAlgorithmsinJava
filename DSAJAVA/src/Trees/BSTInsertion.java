package Trees;
class TreeNodee {
    int data;
    TreeNodee left, right;

    TreeNodee(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTInsertion {
    public static TreeNodee insert(TreeNodee root, int key) {
        if (root == null) {
            return new TreeNodee(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void inorderTraversal(TreeNodee root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNodee root = null;
        int[] values = {10, 5, 15, 3, 7, 12, 18};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder traversal: ");
        inorderTraversal(root);
    }
}
