public class LinearSearch{
	public static int LinearSearch(int[] arr, int search){
		for (int i=0;i<arr.length;i++ ) {
			if(arr[i] == search){
				return i;
			}
		}
		return -1;
	}


	public static void main(String[] args){
		int[] a={40,30,27,57,34,64,75,9,8,10};
		int search=5;
		if (LinearSearch(a,search)==-1) {
			System.out.println(search+" is not in the array. ");	
		}
		else{
			System.out.println(search+" is found at index: "+LinearSearch(a,search));
		}
		
	}
}