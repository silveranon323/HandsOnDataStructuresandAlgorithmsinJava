package Trees;
class treeNodee {
    int data;
    treeNodee left, right;

    treeNodee(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTInsertDelete {
    public static treeNodee insert(treeNodee root, int key) {
        if (root == null) {
            return new treeNodee(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static treeNodee deleteNode(treeNodee root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: get inorder successor (smallest in right subtree)
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public static int minValue(treeNodee root) {
        int minv = root.data;
        while (root.left != null) {
            root = root.left;
            minv = root.data;
        }
        return minv;
    }

    public static void inorderTraversal(treeNodee root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        treeNodee root = null;
        int[] values = {20, 10, 30, 5, 15, 25, 35};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder traversal before deletion: ");
        inorderTraversal(root);
        System.out.println();

        root = deleteNode(root, 10);  // Delete node with value 10

        System.out.print("Inorder traversal after deletion: ");
        inorderTraversal(root);
    }
}
