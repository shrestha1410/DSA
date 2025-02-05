import java.util.Arrays;

public class MergeSort {
    public  static  void main(String[] args){
        int[] arr={5,4,3,2,1};
        merge(arr,0,arr.length-1);
        System.out.println("Sorted"+ Arrays.toString(arr));
    }
    public static  void merge(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            merge(arr,left,mid);
            merge(arr,mid+1,right);
            mergeSort(arr,left,mid,right);
        }
    }
    public  static void  mergeSort(int[] arr,int left,int mid,int right){
        int leftSize=mid-left+1;
        int rightSize=right-mid;

        int[] leftArr= new int[leftSize];
        int[] rightArr= new int[rightSize];

        for(int i=0;i<leftSize;i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0;j<rightSize;j++){
            rightArr[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<leftSize &&j<rightSize){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<rightSize){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
}
