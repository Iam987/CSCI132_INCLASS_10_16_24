import java.util.LinkedList;

public class StackLinkedList {
	private LinkedList<VideoGame> data;
	private VideoGame top;
	private int size;
	
	public StackLinkedList() {
		data = new LinkedList<VideoGame>();
		top = null;
		size = 0;
	}
	
	public void push(VideoGame newGame) {
		data.addFirst(newGame);
		top = data.getFirst();
		size += 1;
	}
	
	public void pop() {
		if(size == 0) {
			System.out.println("Error: stack is empty");
			return;
		}
		data.removeFirst();
		top = data.getFirst();
		size += -1;
	}
	
	public VideoGame peak() {
		return top;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public void printStack() {
		for(VideoGame VG : data) {
			System.out.println(VG.getName() + " - Rated: " + VG.getRating());
		}
	}
}
