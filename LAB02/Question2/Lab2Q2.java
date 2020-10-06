public class Lab2Q2{

	int len;
	int rear;
	int front;
	int top;
	int first;
	int[] arr;

	public Lab2Q2(int n){
		len = 0;
		rear = -1;
		front = -1;
		first = -1;
		arr = new int[n];

	}
	public int len(){
		return len;
	}
	public int first(){
		if(len==0){
			return 0;
		}
		return arr[front];
	}
	public void enqueue(int n) {
		if (len==0){
			arr[0] = n;
			front = 0;
			rear = 0;
			first = arr[0];
		}
 		else{
 			arr[rear+1]=n;
 			rear=rear+1;
 		}
 		len=len+1;
	}
	public int dequeue () 
	{   
	    if(len==0)   
	    {  
	    	return 0;  
	         
	    }  
	    else  
	    {  
	        front=front+1;
	        
	    } 
	    len=len-1;
	    return arr[front-1]; 
	       
	}
	public boolean isEmpty(){
		if (len==0){
			return true;
		}
		return false;
		
	}  
	
}

