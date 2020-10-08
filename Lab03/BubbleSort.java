public class BubbleSort {  
    static void bubbleSort(int[] array) {  
        int temp = 0;  
         for(int i=0; i < array.length; i++){  
                 for(int j=1; j < (array.length-i); j++){  
                          if(array[j-1] > array[j]){  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int array[] ={8,6,5,2,1,4,3,7};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(array);  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
                }  
   
        }  
}  