public class lastOccurance {
    static  int lastOc(int arr[],int i,int key){
        if(arr[i] == key){
            return i;
        } else if (i == 0) {   // Base Condition Always Second here To Avoid wrong answer if key == arr,length-1 it will return -1 only
            return  -1;
        }
        return  lastOc(arr,i-1,key);
    }

    public static void main(String[] args) {
        int yashu[] ={5,5,5,5,6};

        int arr[] = {8,3,6,9,5,10,2,5};


        System.out.println(lastOc(yashu,yashu.length-1,5));
        System.out.println(lastOc(arr, arr.length-1,5 ));

    }
}
