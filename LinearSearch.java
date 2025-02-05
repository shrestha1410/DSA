public class LinearSearch {
    public  static  void main(String[] args){
     int[] arr={67,78,34,90};
     int key=99;
     linearSearch(arr,key);
    }
    public static void linearSearch(int[] arr,int key){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key){
              index=i;
              break;
            }
        }
        if(index>-1){
            System.out.println(key+" is at index at "+ index);
        }else{
            System.out.println(key+" not found");
        }
    }
}
