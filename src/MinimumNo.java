public class MinimumNo {

    class Node{

        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data=data;

        }

    }
    Node root;
int id=-1;
    public Node insert(int nodes[]){
id++;
        if(nodes[id]!=-1){
            root=new Node(nodes[id]);
        }
        else if(nodes[id]<root.data){
            root.left=insert(nodes);
        } else if (nodes[id]>root.data) {
            root.right=insert( nodes);
        }
return root;
    }

public void inorder(){
        inOrderRec(root);
}
public void inOrderRec(Node root){

        if (root==null){
            return;
        }

        inOrderRec(root.left);
    System.out.println(root.data);
    inOrderRec(root.right);
}

    public static void main(String[] args) {

        int nodes[]={2,4,8,5,6,3};
MinimumNo m=new MinimumNo();
Node root=m.insert(nodes);
m.inorder();
    }

}
