public class Lab2Q1{
	int arr[];
	int size;
	int top;

	public Lab2Q1(int x){
		arr = new int[x];
		size = 0;
		top = -1;
	}
	public void push(int n){
		if(size==0){
			arr[0]=n;
			top = arr[0];
		}
		else{
			arr[top+1] = n;
			top=top+1;
		}
		size = size + 1;
	}
	public int pop(){
		if (size==0){
			return 0;
		}
		else{
			top=top-1;
			size = size -1;
			return arr[top +1];
		}		 
	}

	public int top(){
		if(size==0){
			return 0;
		}
		return arr[top];
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;
	}
}

	

	

	
