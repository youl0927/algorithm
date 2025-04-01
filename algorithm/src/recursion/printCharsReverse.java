package recursion;

public class printCharsReverse {
    public static void main(String[] args) {
        String param = "test";
        printCharsReverse(param);
    }

    public static void printCharsReverse(String str){
        if(str.length()==0)
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    // 모든 순환함수는 반복으로 변경 가능
    // 그 역도 성립함, 즉 모든 반복문은 제귀로 표현 가능함
    // 순환함수는 복잡한 알고리즘을 단순하고 알기 쉽게 표현하는 것을 가능하게 함
    // 하지만 함수 호출에 따른 오버해드가 있음(매개변수 전달, 액티베이션 프레임 생성등)
}
