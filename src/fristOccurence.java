public class fristOccurence {
    static  int firstOc(int arr[],int i,int key){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
           return -1;

        }

        return firstOc(arr,i+1,key);
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10};
        int key=11;
        System.out.println(firstOc(arr,0,key));
    }
}
