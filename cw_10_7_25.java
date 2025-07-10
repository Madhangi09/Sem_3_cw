class Node {
    int emp_id;
    String emp_name;
    Node prev, next;

    public Node(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.prev = null;
        this.next = null;
    }
}

class EmployeeNode {
    Node head;

    public void insertAtEnd(int emp_id, String emp_name) {
        Node newNode = new Node(emp_id, emp_name);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {  
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtFirst(int emp_id, String emp_name) {
        Node newNode = new Node(emp_id, emp_name);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void displayBackward() {
        Node temp = head;

        if (temp == null) {
            System.out.println("\n***List is empty*");
            return;
        }

        // Traverse to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.println("\n***Displaying in reverse order*");
        while (temp != null) {
            System.out.println("Employee Id = " + temp.emp_id + "\tEmployee Name = " + temp.emp_name);
            temp = temp.prev;
        }
    }
}

public class DoublyLinked {
    public static void main(String[] args) {  
        EmployeeNode en = new EmployeeNode();
        en.insertAtEnd(100, "Shruthi");
        en.insertAtEnd(101, "Sampatha");
        en.insertAtEnd(102, "Lakshmi");
        en.insertAtEnd(103, "Sadhana");

        en.displayBackward();
    }
}
