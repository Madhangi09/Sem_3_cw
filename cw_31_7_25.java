class CompletedTaskNode{
	int taskId;
	String taskName;
	CompletedTaskNode next;
	CompletedTaskNode(int taskId, String taskName){
		this.taskTd=taskId;
		this.taskName=taskName;
		this.next=null;
	}
}
public class CompletedTask{
	CompletedTaskNode head;
	//insert
	void addTask(int taskId, String taskName){
	CompletedTaskNode newNode=new CompletedTaskNode();
	if(head==null){
		System.out.println("Task Id is not found");
		return;
	}
	if(head.taskId==taskId){
		head=head.next;
		return;
	}
	CompletedTaskNode temp=head;
	while(temp.next!=null){
		if(temp.taskId==taskId){
			temp.next=temp.next.next;
			return;
		}
		temp=temp.next;
	}
	System.out.println(taskId+"not found");
	}
	void display(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		CompletedTaskNode temp=head;
		while(temp!=null){
			System.out.println(temp.taskId+""+temp.taskName);
			temp=temp.next;
		}
	}
	do{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		CompletedTask ct=new CompletedTask();
		System.out.println("---Task Management System---");
		System.out.println("1)ADD \n2)DELETE \n3)DISPLAY \4)EXIT");
		System.out.println("Enter your choice");
		choice=sc.next();
		switch(choice){
			case "ADD":
			int tId=sc.nextInt();
			sc.nextLine();
			String tName=sc.next();
			ct.addTask(tId,tName);
			break;
			case "DELETE":
			int taskId=sc.nextInt();
			ct.deletebyID(taskId);
			break;
			case"DISPLAY":
			ct.display();
			break;
			case"EXIT":
			System.out.println("Exiting....");
			break;
			default:
			System.out.println("Enter a valid choice");
		}
	}
	while(choice!="EXIT");
}
}
