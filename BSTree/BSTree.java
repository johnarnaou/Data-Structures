public class BSTree {
    // Instance field (data member)
    private TreeNode root;
    private static int counter = -1;
    // Methods
    public BSTree( ){ 
        root = null; 
    }
    
    public boolean isEmpty( ){
        return (root == null);
    }
    
    public void insertElement(int data){
        if (isEmpty( ))
            root = new TreeNode(data);
        else
            insertNode(data,root); 
    }
    
    public void inOrderTraversal( ){
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println( ); 
    }
    
    public void preOrderTraversal( ){
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println(); 
    }
    public void postOrderTraversal( ){
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println(); 
    }
    
    public TreeNode getRoot(){
        return root;
    }
    
    private void insertNode(int data, TreeNode node){
        if(data < node.getNodeData()){
            if(node.getLeftNode() == null){
                node.setLeftNode(new TreeNode(data));
            } else {
                insertNode(data, node.getLeftNode());
            }
        } else {
             if(node.getRightNode() == null){
                node.setRightNode(new TreeNode(data));
            } else {
                insertNode(data, node.getRightNode());
            }
        }
    }
    
    private void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.getLeftNode());
        System.out.print(" " + node.getNodeData());
        inOrder(node.getRightNode());
    }
    
    private void preOrder(TreeNode node){
        if(node == null)
            return;
        System.out.print(" " + node.getNodeData());
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
        
        
    }
    
    private void postOrder(TreeNode node){
        if(node == null)
            return;
        
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(" " + node.getNodeData());
    }
    
   /* public int[] sort(int[] pin){
        return inOrderTree2Array(root, pin);
    }
    public static int[] inOrderTree2Array(TreeNode node, int[] pin) {
        if(node.getLeftNode() != null){
            inOrderTree2Array(node.getLeftNode(), pin);
        } 
        
        counter++;
        pin[counter] = node.getNodeData();
        
        if(node.getRightNode() != null){
            inOrderTree2Array(node.getRightNode(), pin);
        }
        return pin;
    } */
    
}
