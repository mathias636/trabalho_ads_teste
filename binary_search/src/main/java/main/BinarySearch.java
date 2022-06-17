package main;

/**
 *
 * @author unkown;
 */
public class BinarySearch {
    public static void main(String[] args) {
        return;
    }

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        boolean ordenado;
        
     
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) 
                if (arr[i-1] > arr[i]){
                    ordenado = false;  
                    return -2;
                } else{  
                    ordenado = true; 
                }
        }
    
        if(ordenado = true){
        
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
        }
        
        return -1;
    }  
}
