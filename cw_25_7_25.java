class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class TreeTraversal{
    TreeNode root;
    //inorder traversal
    void inorder(TreeNode node){
        if(node!=null){
            inorder(node.left); //visit left sub tree
            System.out.println(node.data+"");
            inorder(node.right); //visit right sub tree
        }
    }
    public static void main(String[] args){
        TreeTraversal tt=new TreeTraversal();
        //manually create the tree
        tt.root=new TreeNode(1);
        tt.root.left=new TreeNode(2);
        tt.root.right=new TreeNode(3);
        tt.root.left.left=new TreeNode(4);
        tt.root.left.right=new TreeNode(5);
        tt.root.right.left=new TreeNode(6);
        tt.root.right.right=new TreeNode(7);
        System.out.println("**Nodes in the tree**");
        tt.inorder(tt.root);
        
    }
}