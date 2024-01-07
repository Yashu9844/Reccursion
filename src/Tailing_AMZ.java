public class Tailing_AMZ {
    static  int tailing(int n){
        if(n == 0 || n ==1){              //Explanation Is in Book
            return 1;
        }
        int TotalWays = tailing(n-1) + tailing(n-2);  //vertically(n-1) { Horizontally(n-2)
        return  TotalWays;
    }

    public static void main(String[] args) {
        System.out.println(tailing(3));
        System.out.println(tailing(4));
        System.out.println(tailing(5));
    }
}
