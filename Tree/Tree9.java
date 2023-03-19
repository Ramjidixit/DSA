//height of a tree 

public class Tree9 {
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

    public static int noOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftroot = noOfNodes(root.left);
        int rightroot = noOfNodes(root.right);
        return leftroot + rightroot + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int sumleft = sumOfNodes(root.left);
        int sumright = sumOfNodes(root.right);
        return sumleft + sumright + root.data;

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int heigttt = Math.max(leftheight, rightheight) + 1;
        return heigttt;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println();
        System.out.println("Number of nodes==" + noOfNodes(root));
        System.out.println("Sum of all nodes=" + sumOfNodes(root));
        System.out.println("The height of the given tree=" + height(root));
    }

}
/*
 * 1 2 4 5 3 6
 * Number of nodes==6
 * Sum of all nodes=21
 * The height of the given tree=3
 */