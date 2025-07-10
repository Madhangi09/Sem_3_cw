class StudentNode
{
    int stu_id;
    String stu_name;
    StudentNode prev;
    StudentNode next;
    
    public StudentNode(int stu_id, String stu_name)
    {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinkedList{
    
    StudentNode head;
    
    public void insert(int stu_id,String stu_name)
    {
        StudentNode newNode = new StudentNode(stu_id,stu_name);
        
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        StudentNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode; //temp--> last node .... adds reference
        newNode.prev = temp;
    }
    
    public void display()
    {
        StudentNode temp = head;
        System.out.println("List data are");
        while(temp != null)
        {
            System.out.println("\nId : "+temp.stu_id+", Name : "+temp.stu_name);
            temp =temp.next;
        }
    }
    
    public void delete(int stu_id)
    {
        StudentNode temp = head;
        
        if(temp == null)
        {
            System.out.println("Student id : "+temp.stu_id+" not found");
            return;
        }
        while(temp.stu_id != stu_id && temp != null)
        {
            temp = temp.next;
        }
        
        if(temp.prev != null)
        {
            temp.prev.next = temp.next;
        }
        else
        {
            head = temp.next;
        }
        
        if(temp.next != null)
        {
            temp.next.prev = temp.prev;
        }
        System.out.println("Student id : "+temp.stu_id+" is successfully removed!!!");
        
    }
    
    public static void main(String[] args)
    {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.insert(100,"Rakshana");
        dl.insert(101,"Archana");
        dl.insert(102,"Kanish");
        dl.insert(103,"Varshan");
        dl.insert(104,"Sarvesh");
        dl.display();
        dl.delete(103);
        dl.display();
    }    
    
}