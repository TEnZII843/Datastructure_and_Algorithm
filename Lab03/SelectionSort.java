public class SelectionSort {  
    public static void selectionSort(int[] array){  
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int smallest = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[smallest]){  
                    smallest = j;  
                }  
            }  
            int smallerNumber = array[smallest];   
            array[smallest] = array[i];  
            array[i] = smallerNumber;  

        }  
    }  
       
    public static void main(String a[]){  
        int[] array1 = {8,6,5,2,1,4,3,7};  
        System.out.println("Before Selection Sort");  
        for(int i=0; i<array1.length; i++){    
            System.out.print(array1[i] +" ");  
        }    
      
        System.out.println();  
          
        selectionSort(array1); 
         
        System.out.println("After Selection Sort");  
        for(int i=0; i<array1.length; i++){    
            System.out.print(array1[i] +" ");  
        }    
    }  
}  