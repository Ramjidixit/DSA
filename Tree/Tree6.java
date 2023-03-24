//count number of nodes

public class Tree6 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;

            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

    }

    public static int countNoNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countNoNodes(root.left);
        int rightNodes = countNoNodes(root.right);
        return leftNodes + rightNodes + 1;

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println();
        System.out.println("The number of nodes===" + countNoNodes(root));
    }

}