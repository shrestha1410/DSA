import java.util.Arrays;

public class BinarySearch {
    public  static  void main(String[] args){
        int[] arr={78,45,23,90};
        int key=23;
        binarySearch(arr,key);
    }
    public static void binarySearch(int[] arr,int key){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }
            if(arr[mid]<key){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(index>-1){
            System.out.println(key+" is at index at "+index);
        }else{
            System.out.println(key+" is not found");
        }
    }
}
