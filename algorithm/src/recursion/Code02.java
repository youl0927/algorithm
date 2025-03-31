package recursion;

public class Code02 {
    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    public static void func(int k){
        if(k<=0)
            return;
        else{
            System.out.println("Hello..");
            func(k-1);
        }
    }
}

//이렇게 된다면면 무한로프에 빠지지 않음. 왜냐면 n의 변수 0이 된다면 return 됨
//test