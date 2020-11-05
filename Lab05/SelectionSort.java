public class SelectionSort {  
    public static void Sort(int[] array){  
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
}    