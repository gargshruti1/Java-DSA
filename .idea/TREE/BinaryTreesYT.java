package TREE;
public class BinaryTreesYT {
    static class Node {//node class of every tree
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(" ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            System.out.print(" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // Postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            System.out.print( " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Preorder traversal"); // Move to the next line
        preorder(root); // Preorder traversal
        System.out.println();
        System.out.println("Inorder traversal"); // Move to the next line
        inorder(root); // Inorder traversal
        System.out.println();
        System.out.println(" Postorder traversal");
        postorder(root); // Postorder traversal
    }
}
