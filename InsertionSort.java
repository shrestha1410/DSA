import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
     int[] arr={5,4,3,2,1};
     insertionSort(arr);
     System.out.println("Sorted"+ Arrays.toString(arr));
    }
    public static  void insertionSort(int[] arr){
        int i=1;
        while(i<arr.length){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
               arr[j+1]=arr[j];
               j--;
            }
          arr[j+1]=key;
         i++;
        }
    }
}
