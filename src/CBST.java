

public class CBST {

    public static TreeNode sortedArrayToBST(int[] nums) {

        return help(nums,0,nums.length-1);
    }
    public static TreeNode help(int nums[],int left,int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=help(nums,left,mid-1);
        root.right=help(nums,mid+1,right);
        return root;
    }
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {

        int []nums={-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);

        System.out.println("Inorder Traversal of BST:");
        inorderTraversal(root);
    }
}
