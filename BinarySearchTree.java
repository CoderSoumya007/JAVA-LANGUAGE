

public class BinarySearchTree {
    class Node {
        int value;
        Node left;
        Node right;
    
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
     static Node root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(31);
        bst.insert(62);
        bst.insert(53);
        bst.insert(47);
        bst.insert(87);
        bst.insert(9);
        System.out.println("succes");
        bst.preorder(root);
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }
    public void preorder(Node root){
        if(root==null){
            return ;
        }
        preorder(root.left);
        System.out.print(root.value + " ");
        preorder(root.right);
    }

    public Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }
}
