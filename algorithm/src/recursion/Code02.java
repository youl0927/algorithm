package recursion;

public class Code02 {
    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    public static void func(int k){
        if(k<=0)           //적어도 하나의 재귀에 빠지지 않는 경우가 존재해야 한다.
            return;
        else{
            System.out.println("Hello..");
            func(k-1);  //제귀를 반복하다보면 결국 base case로 수렴해야 한다.
        }
    }
}

//이렇게 된다면면 무한로프에 빠지지 않음. 왜냐면 n의 변수 0이 된다면 return 됨
//test