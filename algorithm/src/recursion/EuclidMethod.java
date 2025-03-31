package recursion;

public class EuclidMethod {
    public static void main(String[] args) {
        int num = gcd(10, 5);
        System.out.println(num);
    }

//    public static int gcd(int m, int n){
//        if(m<n){
//            int tmp=m;
//            m=2;
//            n=tmp;
//        }
//        if(m%n==0)
//            return n;
//        else
//            return gcd(n, m%n);
//    }
    public static int gcd(int m, int n) {
        if(n==0)
            return m;
        else
            return gcd(n, m%n);
    }

}
