import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {
        root= null;
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
       
    }
    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        if (root == null) 
            return 0; 
          
        // Using level order Traversal. 
        Queue<Node> q = new LinkedList<Node>(); 
        q.offer(root); 
          
        int count = 1;  
        while (!q.isEmpty()) 
        { 
            Node tmp = q.poll(); 
            // when the queue is empty: 
            // the poll() method returns null. 
            if (tmp != null) 
            { 
                if (tmp.left != null) 
                {  
                    count++;   
                    q.offer(tmp.left); 
                } 
                if (tmp.right != null) 
                {  
                    count++;  
                    q.offer(tmp.right); 
                } 
            } 
        } 
        return count; 
    } 
    /**
     * Returns the value associated with the given key.
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     */
    public Value get(Key key) {
        Node x = root;
        while (x != null) {
            int res = key.compareTo(x.key);
            if      (res < 0) x = x.left;
            else if (res > 0) x = x.right;
            else return x.val;
        }
        return null;    
    }
    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     */
    public void put(Key key, Value val) {
        Node z = new Node(key, val);
        if (root == null) {
            root = z;
            return;
        }
        Node parent = null, x = root;
        while (x != null) {
            parent = x;
            int res = key.compareTo(x.key);
            if      (res < 0) x = x.left;
            else if (res > 0) x = x.right;
            else {
                x.val = val;
                return;
            }   // overwrite duplicate
        }
        int res = key.compareTo(parent.key);
        if (res < 0) parent.left  = z;
        else         parent.right = z;    
       
    }
    // /**
    //  * Returns the smallest key in the symbol table.
    //  *
    //  * @return the smallest key in the symbol table
    //  * @throws NoSuchElementException if the symbol table is empty
    //  */
    public Key min() {
        if (isEmpty())throw new NoSuchElementException("Symbol table is empty");
        return (min(root).key);                     
    } 
    private Node min(Node x) { 
        Node temp = x;

        while(temp.left !=null){
            temp = temp.left;
        }
        return temp;     
    } 
    // /**
    //  * Returns the largest key in the symbol table less than or equal to {@code key}.
    //  * @param  key the key
    //  * @return the largest key in the symbol table less than or equal to {@code key}
    //  * @throws NoSuchElementException if there is no such key
    //  * @throws IllegalArgumentException if {@code key} is {@code null}
    //  */
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("Argument to floor() is null ");
        if (isEmpty()) throw new NoSuchElementException("called floor() with empty symboltable");
            Node x = floor(root,key);
            if(x == null)
                return null;
            else 
                return x.key;      
    } 
    private Node floor(Node x, Key key) {
        Node small = null;
        while (x != null){
            int compare = key.compareTo(x.key);
            if(compare == 0) return x;
            if(compare > 0){
                small = x;
                x = x.right;
            }
            else{
                x = x.left;
            }
        }
        return small;
    } 
    // /**
    //  * Return the key in the symbol table whose rank is {@code k}.
    //  * This is the (rank+1)st smallest key in the symbol table.
    //  *
    //  * @param  rank the order statistic
    //  * @return the key in the symbol table of rank {@code k}
    //  * @throws IllegalArgumentException unless {@code k} is between 0 and
    //  *        <em>n</em>–1
    //  */
    public Key select(int rank) {
        if(rank<0 || rank>=size()) throw new IllegalArgumentException("sorry!!!");
        Node x = select(root, rank);
        return x.key;
    }

    // Return key of rank k. 
    private Node select(Node x, int r) {
        int count = -1;
        ArrayList<Node> stack = new ArrayList<Node>();
        Node curr = x;
        while(!stack.isEmpty() || curr!=null){
            if(curr!=null){
                stack.add(curr);
                curr = curr.left;
            } 
            else{
                curr = stack.remove(stack.size()-1);
                count++;
                if(count==r) break;
                curr = curr.right;
            }
        }
        return curr;
    } 
    // /**
    //  * Returns all keys in the symbol table in the given range,
    //  * as an {@code Iterable}.
    //  *
    //  * @param  lo minimum endpoint
    //  * @param  hi maximum endpoint
    //  * @return all keys in the symbol table between {@code lo} 
    //  *         (inclusive) and {@code hi} (inclusive)
    //  * @throws IllegalArgumentException if either {@code lo} or {@code hi}
    //  *         is {@code null}
    //  */
    public Iterable<Key> keys(Key lo, Key hi) {
        Queue<Key> queue = new LinkedList<Key>();
        keys(root, queue, lo, hi);
        return queue;
    } 

    private void keys(Node x,Queue<Key> queue, Key lo, Key hi) { 
        if (x == null)  
        return;  
    
        Node curr = x;
        int com = lo.compareTo(curr.key);
        int cmp = hi.compareTo(curr.key);
          
        while (curr != null) {  
            if (curr.left == null)  
            {   
                if (com <= 0 && cmp >= 0)  queue.offer(curr.key);    
                curr = curr.right;  
            }  
            else {  
                Node pre = curr.left;    
                while (pre.right != null && pre.right != curr)  
                    pre = pre.right;  
                if (pre.right == null)  
                {  
                    pre.right = curr;  
                    curr = curr.left;  
                }  
                else {  
                    pre.right = null;    
                    if (com <= 0 && cmp >= 0)  queue.offer(curr.key);   
                    curr = curr.right;  
                }  
            }
        }
    }
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/    
}
