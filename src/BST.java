public class BST {

    class Node {

        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }


    }

    class buildtree {
        static Node root;

        public void insert(int data) {
            root = insertRec(root, data);
        }

        public Node insertRec(Node root, int data) {

            if (root == null) {
                root = new Node(data);
            } else if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
            return root;
        }

        public void inorder() {
            inorderRec(root);
        }

        public void inorderRec(Node root) {
            if (root == null) {
                return;
            }

            inorderRec(root);
            System.out.println(root.data);
            inorderRec(root.right);


        }

    }
    public static void main(String[] args) {



    }
}
