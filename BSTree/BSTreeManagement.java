public class BSTreeManagement {
    public static void main(String[] args){
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };
        BSTree tree = new BSTree();
        Utility myUtil = new Utility();
        
        for (int i=0; i<matrix.length; i++) tree.insertElement(matrix[i]);
        
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();

        matrix = myUtil.sort(matrix);
        
        System.out.print("Sorted Array: ");
        for (int i=0; i<matrix.length; i++) System.out.print(matrix[i] + " ");
    }
    
}
