
/**
 * Made by Caleb Wallis 
 * https://github.com/caleb-wallis
 */


/**
 * Stack of nodes
 * */
public class Stack{

    // Head of the stack    
    private Node head;

    // Initialize a stack object
    public Stack(){
        head = null;
    }

     /**
     * Adds a new node to the start of the stack.
     * 
     * @param s The value of the new node
     */
    public void push(String s){
        // Create a new node
        Node newNode = new Node(s);

        // If the stack isn't empty then make newNode point to the head
        if(head != null){
            newNode.next = head;
        }

        // Make the head point to newNode
        head = newNode;
    }


    /**
     * Removes the item from the start of the stack and return its value
     * 
     * @return Value of the removed item
     */
    public String pop(){
        if(head == null){
            return null;
        }
        String value = head.value;
        head = head.next;
        return value;
    }


    /**
     * Looks at the first item of the stack and return its value
     * 
     * @return Value of the first item in the stack
     */
    public String peek(){
        if(head == null){
            return null;
        }
        return head.value;
    }


    /**
     * Returns whether the stack is empty or not
     * 
     * @return True if the stack is empty; otherwise returns false
     */
    public boolean isEmpty(){
        // If the start of the stack is null return true
        if(head == null){
            return true;
        }
        // Else return false
        return false;
    }


    /**
     * Returns a count of the number of values in the stack; zero if the stack is empty.
     * 
     * @return The number of values in the stack
     */
    public int length(){
        // Set count to 0 and set current to head to count from start of the stack
        Node current = head;
        int count = 0;

        // While not at the end of the stack
        while(current != null){
            // Add 1 to count
            count++;
            // Move to next value
            current = current.next;
        }
        // Return number of values in the stack
        return count;
    }


    /**
     * Prints out the node values that are inside the stack in order
     */
    public void dump(){
        // Start from the beginning of the stack
        Node current = head;
        // Loop through the entire stack from the start
        while(current != null){
            // Print out the value of the current node
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println();
    }
}