import java.util.*;

class Stack{
	int top;
	int size;
	int[] sArray;
	
	public Stack(int size){
		this.size = size;
		sArray = new int[size];
		top = -1; //intalisation of top
	}
	
	public void insert(int value){
		if(top==size-1){
			System.out.println("Stack overflow");
		}else{
			top = top+1;
			sArray[top] = value;
			System.out.println(value +" is pushed into the stack successfully");
		}
	}
	
	public void pop(){
		if(top == -1){
			System.out.println("Cannot remove stack is empty");
		}else{
			top = top-1;
			System.out.println(sArray[top]+" is removed");
		}
	}
	
	public void peek(){
		if(top == -1){
			System.out.println("stack is empty");
		}else{
			System.out.println("Top element is "+sArray[top]);
		}
	}
	
	public void display(){
		if(top == -1){
			System.out.println("stack is empty");
		}else{
			for(int i=top;i>=0;i--){
				System.out.println(sArray[i]);
			}
		}
	}
}



public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the capacity of the stack: ");
		int capacity = sc.nextInt();
		
		Stack s = new Stack(capacity);
		
		s.insert(10);
		s.insert(20);
		s.insert(30);
		s.insert(40);
		s.insert(50);
		System.out.println("After insertion");
		s.display();
		s.peek();
		s.display();

	}

}