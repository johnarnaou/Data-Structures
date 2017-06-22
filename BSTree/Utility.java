public class Utility{
    private static int counter;
    
    public int[] sort(int[] pin){
        BSTree tree = new BSTree();
        for(int i=0; i<pin.length; i++) tree.insertElement(pin[i]);
        counter = -1;
        pin = inOrderTree2Array(tree.getRoot(), pin);
        return pin;
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
    }
}