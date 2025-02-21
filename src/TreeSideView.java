import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node root;
    Node left;
    Node right;
    int data;

    public  Node(int data){

        this.data=data;
        Node left=right=null;
    }
}
public class TreeSideView {


    public static ArrayList<ArrayList<Integer>> levelorder(Node root) {

        Queue<Node>q=new LinkedList<>();
ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i=0;i<size;i++){
            Node curr=q.poll();
            level.add(curr.data );



            if(curr.left!=null){
                q.add(curr.left);
            }
            if (curr.right!=null){
                q.add(curr.right);
            }
        }

        list.add(level);
        }
return list;

    }
    static void printList(ArrayList<Integer> list) {
        // Iterate through the
        // list and print each element
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(0) + " ");
            break;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.left.right=new Node(8);
        root.right.right.right = new Node(5);
        root.right.right.left = new Node(6);


        // Perform level order traversal
ArrayList<ArrayList<Integer>>result=levelorder(root);
        for (ArrayList<Integer> level : result) {
            printList(level);
        }

    }
}
//    1
//  3   2
// 7 8        4
//       6   5