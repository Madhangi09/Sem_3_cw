//Node class for each shopping item
class CartItem{
	String itemName;
	int quantity;
	double price;
	CartItem prev, next;
	public CartItem(String itemName, int quantity, double price){
		this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.prev = null;
        this.next = null;
    }
}
// Circular Doubly Linked List for Shopping Cart
class ShoppingCart {
    private CartItem head=null;
    // Insert item at the end
    public void insertAtEnd(String itemName, int quantity, double price) {
        CartItem newItem=new CartItem(itemName, quantity, price);
        if (head==null) {
            head=newItem;
            head.next=head;
            head.prev=head;
        } else {
            CartItem tail=head.prev;
            tail.next=newItem;
            newItem.prev=tail;
            newItem.next=head;
            head.prev=newItem;
        }
        System.out.println(itemName+"Added to the cart");
    }
    // Display all items in the cart
    public void displayCart() {
        if (head==null) {
            System.out.println("Shopping cart is empty");
            return;
        }
        System.out.println("\nItems in Shopping Cart:");
        CartItem current=head;
        do {
            System.out.println("Item:"+current.itemName+",Quantity:"+current.quantity+",Price:₹"+current.price);
            current=current.next;
        } while (current!=head);
    }
}
// Main class to run the shopping cart
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.insertAtEnd("Milk", 2, 40.0);
        cart.insertAtEnd("Bread", 1, 25.0);
        cart.insertAtEnd("Butter", 1, 55.0);
        cart.displayCart();
    }
}
