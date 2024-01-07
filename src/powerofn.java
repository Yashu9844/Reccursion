public class powerofn {
    static int xpn(int x,int n){
        if (n==0) {
            return 1;
        }
        return x*xpn(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(xpn(2,10));
        System.out.println(xpn(3,3));
    }
}
