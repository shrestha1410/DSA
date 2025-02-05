import java.util.Arrays;

public class BubbleSort {
    public static void  main(String[] args){
        int[] arr={5,4,3,2,1};
        bubbleSort(arr);
        System.out.println("Sorted"+ Arrays.toString(arr));
    }
    public  static  void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
}
