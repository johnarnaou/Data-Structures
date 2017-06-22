public class ArrayQueue implements Queue {
	private int capacity, front = 0, rear = -1, am=-1;
	Object[] oura;

	ArrayQueue(int n){
		capacity = n;
		oura = new Object[n];
	}

	public int size(){
		return rear - front;
	}

	public boolean isEmpty(){
		if(am == -1){
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull(){
		if(rear == capacity-1){
			return true;
		} else {
			return false;
		}
	}

	public Object front() throws QueueEmptyException{
		if(isEmpty()){
			throw new QueueEmptyException("Queue Underflow");
		} else {
			return oura[front];
		}
	}

	public Object remove() throws QueueEmptyException{
		Object temp;
		if(isEmpty() == false){
			temp = oura[front];
			oura[front] = null;
			front++;
                        am--;
		} else {
			throw new QueueEmptyException("Queue Underflow");
		}
		Shift();
		return temp;
	}

	public void Shift(){
		Object[] temp = new Object[capacity];

		for(int i=0; i<rear; i++){
			temp[i] = oura[front];
			front++;
		}

		oura = temp;
		rear--;
		front = 0;
	}

	public void add(Object item)throws QueueFullException{
		if(isFull()){
			throw new QueueFullException("Queue Overflow");
		} else {
			rear++;
			oura[rear] = item;
                        am++;
		}
	}
        
        public void Display(){
            if(isEmpty() == false){
                int temp = front;
                for(; temp<=rear; temp++){
                    System.out.println(oura[temp].toString());
                }
            } else {
                System.out.println("Queue is empty");
            }
	}
}



