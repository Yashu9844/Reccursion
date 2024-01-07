public class fiboncci {
    static  int fib(int n){
      if(n == 1 || n == 0){
          return  n;
      }
       int fibN = fib(n-1)+fib(n-2);
       return  fibN;

    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fib(25));
    }
}
