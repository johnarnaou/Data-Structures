public class SLListNode {
    private Object data;
    private SLListNode nextNode;
    
    SLListNode(Object item, SLListNode node){
        data = item;
        nextNode = node;
    }
    
    SLListNode(){}
    
    SLListNode(Object item){
        data = item;
    }
    public Object getNodeData(){
        return data;
    }
    public SLListNode getNextNode(){
        return nextNode;
    }
    public void setNodeData(Object d){
        data = d;
    }
    public void setNextNode(SLListNode n){
       nextNode = n; 
    }
    public String toString(){
        return data + "\n";
    }

}