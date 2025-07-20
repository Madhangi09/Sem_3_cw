package dsa;
class Queue
{
	int front, rear, capacity;
	int QArray[];
	
	Queue(int size) //constructor
	{
		front = rear = 0;
		capacity = size;
		QArray = new int[capacity];
	}
	public void enqueue(int value)
	{
		if(front == capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			QArray[rear++] = value;
			System.out.println(value + " is inserted successfully");
		}
	}
	public void dequeue()
	{
		if(front == capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			System.out.println(QArray[front]+" is removed");
			for(int i=0;i<rear - 1;i++)
			{
				QArray[i] = QArray[i+1];
			}
			rear = rear - 1; // or rear --
		}
	}
	public void display()
	{
		if(front == capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		System.out.println("***QUEUE**");
		for(int i=front;i<rear;i++)
		{
			System.out.println(QArray[i]);
		}
	}
}
public class QueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("After Enqueue :");
		q.display();
		q.dequeue();
		System.out.println("After Dequeue : ");
		q.display();
	}

}