import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;


    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

public class ZigZagTravel {

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){

        ArrayList<ArrayList<Integer>>list=new ArrayList<>();

        Queue<TreeNode>q=new LinkedList<>();

        q.add(root);


        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>level=new ArrayList<>();
boolean ltor=true;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                level.add(curr.data);
                if(ltor==true) {


                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                    ltor=false;
                }
                else {



                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    ltor=true;
                }

            }
            list.add(level);
        }
        return list;
    }

    public static void main(String[] args) {


        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.left.left=new TreeNode(23);
        root.right.left.right=new TreeNode(45);
        root.left.left.right=new TreeNode(44);

        List<ArrayList<Integer>>list=levelOrder(root);

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }

    }

}
