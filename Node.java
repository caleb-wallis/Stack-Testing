
/**
 * Made by Caleb Wallis 
 * https://github.com/caleb-wallis
 */


/**
 * Node for a linked list of strings
 * */
public class Node{

    // Value of the node
    public String value;
    // The node that this node points to
    public Node next;

    /**
     * Sets the value of the node
     * 
     * @param string the string that the value will become
     * */
    public Node(String s){
        value = s;
    }
}