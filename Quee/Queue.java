public interface Queue {

	public int size();

	public boolean isFull();

	public boolean isEmpty();

	public void Shift();

	public Object front()throws QueueEmptyException;

	public void add(Object item)throws QueueFullException;

	public Object remove()throws QueueEmptyException;

	public void Display();

}