import java.util.Arrays;

public class SelectionSort{
    public  static  void main(String[] args){
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        System.out.println("Sorted"+ Arrays.toString(arr));
    }
    public static  void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
