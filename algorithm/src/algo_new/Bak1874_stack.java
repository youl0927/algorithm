package algo_new;

import java.util.Scanner;
import java.util.Stack;

public class Bak1874_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i=0; i < a.length; i++){
            int su = a[i];
            if(su >= num){
                while(su>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else {
                int c = stack.pop();
                if(c > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    bf.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(bf.toString());
        }
    }
}
/*
N(수열 개수) A[](수열 배열)
수열 배열 채우기
for(N만큼 반복){
    if(현재 수열 값 >= 오름차순 자연수){
        while(값이 같아질 때까지){
            push()
            (+)저장
        }
        pop()
        (-)저장
    }
    else(현재 수열 값 < 오름차순 자연수){
        pop()
        if(스택 pop 결괏값 > 수열의 수) No 출력
        else(-)저장
    }
}
if(-값을 출력한 적이 없으면) 저장한 값 출력
 */