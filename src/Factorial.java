public class Factorial {
    static int  fact(int n){
        int factorial=1;
        if(n==1){
            return 1;


        }
        factorial=n*fact(n-1)  ;
        return factorial;

    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
