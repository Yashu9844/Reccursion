public class PairGoldMAn {
    public static int pairWay(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //single
        int fnm1 = pairWay(n-1);

        //Pair
        int fnm2 = pairWay(n-2);
        int ways = (n-1)*fnm2;              //(n-1) is choices to Pair (fnm2) is after pair the ways left pair


        int totalWays = fnm1 + ways;
        return totalWays;
                                          //OR In Single Line

//        return pairWay(n-1) + (n-1)*pairWay(n-2);
    }




    public static void main(String[] args) {
        System.out.println(pairWay(3));
    }
}
