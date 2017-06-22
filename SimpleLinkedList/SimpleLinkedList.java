public class SimpleLinkedList implements List{
    SLListNode first = new SLListNode(), last = new SLListNode();
    int megethos = 0;
    
    public boolean isEmpty(){
        boolean k;
        if(megethos == 0){
            k = true;
        } else {
            k = false;
        }
        
        return k;
    }
    
    public int size(){
        return megethos;
    }
    
    public void insertFirst(Object data){
        SLListNode n = new SLListNode(data, first);
        if(isEmpty()){
            last = n;
        }
        first = n;
        megethos++;
    }
    
    public void insertLast(Object data){
        SLListNode n = new SLListNode(data);
        if(isEmpty()){
            first = n;
        } else {
            last.setNextNode(n);   
        }
        last = n;
        megethos++;
    }
    
    public Object removeFirst() throws ListEmptyException{
        if(isEmpty()){
            throw new ListEmptyException("List is Emprty");
        } else {
            Object item = first.getNodeData();
            first = first.getNextNode();
            megethos--;
            return item;
        }
    }
    
    public Object removeLast() throws ListEmptyException{
        if(isEmpty()){
            throw new ListEmptyException("List is Empty");
        } else {
            Object tmp = last.getNodeData();
            SLListNode current = first;
            while(current.getNextNode().getNextNode() != null)
                current = current.getNextNode();
            last = current;
            megethos--;
            return tmp;
        }
    }
    
    public void printList(){
        if(isEmpty() == false){
            SLListNode current = first;
            for(int i=0; i<size(); i++){
                System.out.println("          " + (i+1) + ". Object \n" + current.getNodeData().toString());
                current = current.getNextNode();
            }
        } else {
            System.out.println("List is Empty");
        }
    }
}
