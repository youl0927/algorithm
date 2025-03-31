package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int a = fibonacci(10);
        System.out.println(a);
    }

    public static int fibonacci(int n){
        if(n<2)
            return n;
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
