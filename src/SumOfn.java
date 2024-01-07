public class SumOfn {
    static  int sumodfn(int n){
        if(n==1){
            return 1;
        }
       int sum = n + sumodfn(n-1);;
       return  sum;
    }

    public static void main(String[] args) {

        System.out.println(sumodfn(8));
    }
}
