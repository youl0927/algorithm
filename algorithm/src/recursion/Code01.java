package recursion;

public class Code01 {
    public static void main(String[] args) {
        func();
    }

    public static void func(){
        System.out.println("Hello,,,");
        func();
    }
}

//자기 자신을 다시 호출하니까 무한 로프에 빠지게됨.