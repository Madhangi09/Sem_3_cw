package java_project;
import java.util.*;
class Students{
	int s_id;
	String s_name;

public Students(int s_id,String s_name){
	   this.s_id=s_id;
	   this.s_name=s_name;
	   
   }
   void display(){
	   System.out.println("id: "+s_id+"Name: "+s_name);
   }
}

public class StackArrayStudent{//student.java
	static int top=-1;
	static final int size=5;
	static Students[] arr=new Students[size];//array creation
	
	public  static void push(Students s){
		if(top==size-1){
			System.out.println("Full cannot register");
		}
		else{
			top= top+1;
			arr[top]=s;
			System.out.println(s.s_name+"  Registered");
		}
		
	}
	public static void pop(){
		if(top==-1){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("Registration is failed");
			arr[top--].display();
		}
	}
	public  static void display(){
		if(top==-1){
			System.out.println("Stack is empty.Nothing's there");	
		}
		else{
			System.out.println("Student Registration details");
			for(int i=top;i>=0;i--){
			arr[i].display();	
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice;
		do{
		System.out.println("<<<<< Student Registration >>>>>>");
		System.out.println("1.Register:");
		System.out.println("2.Cancel Registration:");
		System.out.println("3.Display Student status:");
		System.out.println("4.Exit");
		System.out.println("Choose Option:");
		choice=sc.nextInt();
		sc.nextLine();//to avoid new line
		switch(choice){
		case 1:
			System.out.println("Enter Student ID:");
			int id=sc.nextInt();
			System.out.println("Enter Student Name:");
			String name=sc.next();
			push(new Students(id,name));
			break;
		case 2:
		   pop();
		   break;
			
		case 3:
			display();
			break;
		case 4:
			System.out.println("Exiting>>>");
			break;
		default:
			System.out.println("Enter valid option");
			
		}
		}while(choice!=4);
		
	}
}