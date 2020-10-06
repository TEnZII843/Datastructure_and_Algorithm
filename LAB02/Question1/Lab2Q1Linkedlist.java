//creating a class
class Node{
    public int element;
    public Node next;

    // constructor
    public Node(int element, Node next ){
        this.element = element;
        next = null;
    }
}
public class Lab2Q1Linkedlist{
    Node top;
    Node head;
    Node tail;
    int size;

    public Lab2Q1Linkedlist(){
        top = null;
        head = null;
        tail = null;
        size = 0;
    }
    //
    public boolean isEmpty()
    {
        if (this.top == null) {

            return true;    
        }
        else {
            return false;
        }
    }
    //
    public int size(){
        return size;
    }
    //
    public int top()
    {
        if (isEmpty()){
            return 0;

        }
        else {
            return top.element;
        }
        
    }
    public void push(int n)
    {
        Node newest = new Node(n, null);
        if(this.isEmpty()) {
            this.head = newest;
            this.top = newest;
            this.tail = newest;
        }
        else {
            this.top.next= newest;
            this.top = newest;
        }
        size = size + 1;
    }
    public int pop() {
        if(this.isEmpty()) {
            return 0;
        }
        else {
            int x = this.top.element;
            if(this.head == this.top) {// only one node
                this.top = null;
                this.head = null;
            }
            else {
                Node newest = this.head;
                while(newest.next != this.top) // iterating to the last element
                newest = newest.next;
                newest.next = null;
                this.top = newest;
            }
            size = size - 1;
            return x;
        }
    }
    //
    public static void main(String[] args) {
        Lab2Q1Linkedlist obj1 = new Lab2Q1Linkedlist();

        obj1.push(6);
        obj1.push(2);
        obj1.push(3);
                
        System.out.println(obj1.isEmpty());
        System.out.println(obj1.size());
        System.out.println(obj1.top());
        System.out.println(obj1.pop());
        System.out.println(obj1.size());
        System.out.println(obj1.top());
         System.out.println(obj1.size());
        System.out.println("All test pass");
    }
}

