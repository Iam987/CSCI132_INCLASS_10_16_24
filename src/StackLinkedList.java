
public class StackLinkedList {
	private LinkedList<VideoGame> data;
	private int top;
	private int size;
	
	public StackLinkedList(int s) {
		data = new VideoGame[s];
		top = -1;
		size = 0;
	}
	
	public void push(VideoGame newGame) {
		if(size == data.length) {
			System.out.println("Can't push, stack is full...");
			return;
		}
		top += 1;
		data[top] = newGame;
		size += 1;
	}
	
	public void pop() {
		if(size == 0) {
			System.out.println("Error: stack is empty");
			return;
		}
		data[top] = null;
		top += -1;
		size += -1;
	}
	
	public VideoGame peak() {
		if(size != 0) {
			return data[top];
		}
		return null;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public void printStack() {
		for(int i = size-1; i >= 0; i--) {
			System.out.println(data[i].getName() + " - Rated: " + data[i].getRating());
		}
	}
}
