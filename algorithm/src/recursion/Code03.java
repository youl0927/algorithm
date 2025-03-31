package recursion;

public class Code03 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }

    public static int func(int n){
        if(n<=0)           //적어도 하나의 재귀에 빠지지 않는 경우가 존재해야 한다.
            return 0;
        else{
            return n+func(n-1);
        }
    }
}

//이렇게 된다면면 무한로프에 빠지지 않음. 왜냐면 n의 변수 0이 된다면 return 됨
//test