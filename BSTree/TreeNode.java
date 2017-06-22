public class TreeNode {
    private TreeNode left;
    private int item;
    private TreeNode right;
    
    TreeNode(int data){
        item = data;
    }
    public int getNodeData(){
        return item;
    }
    public TreeNode getLeftNode(){
        return left;
    }
    public TreeNode getRightNode(){
        return right;
    }
    public boolean isLeaf(){
        return(right == null && left == null);
    }
    public void setLeftNode(TreeNode node){
        left = node;
    }
    public void setRightNode(TreeNode node){
        right = node;
    }
}
