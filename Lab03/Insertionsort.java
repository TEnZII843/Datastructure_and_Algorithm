public class Insertionsort{
	public static void insertion(int array[]){
		for (int i=1; i<array.length ; i++ ) {
			int compare= array[i];
			int j=i-1;
		  	while ( (j > -1) && ( array [j] > compare ) ) {  
            	array [j+1] = array [j];  
            	j--;  
            }  
            array[j+1] = compare; 
			
		}

	}
	public static void main(String[] args) {
		int[] array1 = {8,6,5,2,1,4,3,7};    
        System.out.println("Before Insertion Sort");    
        for(int i=0; i<array1.length; i++){    
            System.out.print(array1[i] +" ");    
        } 
        System.out.println("");
        insertion(array1);   
           
        System.out.println("After Insertion Sort");    
        for(int i=0; i<array1.length; i++){    
            System.out.print(array1[i] +" ");       
		}
	}		
}