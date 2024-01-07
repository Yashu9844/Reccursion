public class Chech_Sort {
    static  boolean isSort(int arr[],int i){
        if(i == arr.length -1){
            return true;
        } else if (arr[i] > arr[i+1]){
            return false;
        }
        return  isSort(arr,i+1);

    }

    public static void main(String[] args) {
        int yashu[]={1,2,3,5,7};
        int arr[] = {1,5,4,7};
        System.out.println(isSort(yashu,0));
    }
}
