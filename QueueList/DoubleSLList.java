public class DoubleSLList implements List {
    int megethos = 0;
    DoubleNode first = new DoubleNode(), last = new DoubleNode();
    
    public boolean isEmpty( ){
        if(megethos == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public int size( ){
        return megethos;
    }
    
    public void insertFirst(Object data){
        DoubleNode n = new DoubleNode(data, first, null);
        if(isEmpty()){
            last = n;
        }
        first.setPrevious(n);
        first = n;
        megethos++;
    }
    
    public void insertLast(Object data){
        DoubleNode n = new DoubleNode(data, null, last);
        if(isEmpty()){
            first = n;
        } else {
            last.setNext(n);
        }
        megethos++;
        last = n;
    }
    
    public void insert(int position, Object data) throws NoSuchListPosition{
        if(position >=0 && position <= size()){
            if(position == 0){
                insertFirst(data);
            } else if(position == size()){
                insertLast(data);
            } else {
                DoubleNode tmp, tmpPre, current = first;
                
                for(int i=0; i<=position; i++){
                    current = current.getNext();
                }
                
                tmpPre = current.getPrevious();
                tmp = new DoubleNode(data, current, current.getPrevious());
                tmpPre.setNext(tmp);
                current.setPrevious(tmp);
                megethos++;
            }
        } else {
            throw new NoSuchListPosition("No such list position");
        }
    }
    
    public void insert(int data){
        if(isEmpty()){
            insertFirst(data);
        } else {
            DoubleNode current = first;
            int position = -1;
            boolean found = false;
            do{
                position++;
                if((int)current.getItem() > data){
                    found = true;
                }
                current = current.getNext();
            }while(found == false && position+1 < size());

            insert(position, data);
        }
    }
    
    public boolean isSorted(){
        boolean sorted = true;
        DoubleNode current = first;
        int i = 0;
        do{
            if((int)first.getItem() > (int)current.getItem()){
                sorted = false;
            }
            current = current.getNext();
            i++;
        }while(sorted == true && i < size());
        
        return sorted;
    }
    
    public Object removeFirst() throws ListEmptyException{
        if(isEmpty()){
            throw new ListEmptyException("List is Emprty");
        } else {
            Object tmp = first.getItem();
            first = first.getNext();
            first.setPrevious(null);
            megethos--;
            return tmp;
        }
    }
    
    public Object removeLast() throws ListEmptyException {
       if(isEmpty()){
            throw new ListEmptyException("List is Emprty");
        } else {
           Object tmp = last.getItem();
           last = last.getPrevious();
           last.setNext(null);
           megethos--;
           return tmp;
       }
    }
    public Object remove(int position) throws ListEmptyException, NoSuchListPosition{
        if(isEmpty()){
            throw new ListEmptyException("List UnderFlow");
        } else {
            if(position >=0 && position<=size()){
                Object item;
                if(position == 0){
                   item = removeFirst();
                } else if(position+1 == size()){
                    item = removeLast();
                } else {
                    DoubleNode tmpPre, tmpNex, current = first;

                    for(int i=0; i<=position; i++){
                        current = current.getNext();
                    }
                    item = current.getItem();

                    tmpPre = current.getPrevious();
                    tmpNex = current.getNext();
                    tmpPre.setNext(tmpNex);
                    tmpNex.setPrevious(tmpPre);  
                }
                megethos--;
                return item;
            } else {
                throw new NoSuchListPosition("No such List position");
            }
        }
    }
    
    public void printList(){
        if(isEmpty() == false){
            DoubleNode current = first;
            //System.out.println("          " + 1 + ". Object \n" + current.getItem().toString());
            for(int i=0; i<size(); i++){
                
                System.out.println("          " + (i+1) + ". Object \n" + current.getItem().toString());
                current = current.getNext();
                
            }
        } else {
            System.out.println("List is Empty");
        }
    }
}
